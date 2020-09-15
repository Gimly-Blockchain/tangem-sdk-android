package com.tangem.tangemcore

import com.squareup.sqldelight.Query
import com.squareup.sqldelight.TransacterImpl
import com.squareup.sqldelight.db.SqlCursor
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.internal.copyOnWriteList
import com.tangem.CardValues
import com.tangem.CardValuesEntityQueries
import com.tangem.Database
import com.tangem.VerificationState
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.MutableList
import kotlin.jvm.JvmField
import kotlin.reflect.KClass

internal val KClass<Database>.schema: SqlDriver.Schema
  get() = DatabaseImpl.Schema

internal fun KClass<Database>.newInstance(driver: SqlDriver, cardValuesAdapter: CardValues.Adapter):
    Database = DatabaseImpl(driver, cardValuesAdapter)

private class DatabaseImpl(
  driver: SqlDriver,
  internal val cardValuesAdapter: CardValues.Adapter
) : TransacterImpl(driver), Database {
  override val cardValuesEntityQueries: CardValuesEntityQueriesImpl =
      CardValuesEntityQueriesImpl(this, driver)

  object Schema : SqlDriver.Schema {
    override val version: Int
      get() = 1

    override fun create(driver: SqlDriver) {
      driver.execute(null, """
          |CREATE TABLE cardValues (
          |    cardId TEXT NOT NULL UNIQUE PRIMARY KEY,
          |    isPin1Default INTEGER DEFAULT 1,
          |    isPin2Default INTEGER DEFAULT 1,
          |    cardVerification TEXT,
          |    cardValidation TEXT,
          |    codeVerification TEXT
          |)
          """.trimMargin(), 0)
    }

    override fun migrate(
      driver: SqlDriver,
      oldVersion: Int,
      newVersion: Int
    ) {
    }
  }
}

private class CardValuesEntityQueriesImpl(
  private val database: DatabaseImpl,
  private val driver: SqlDriver
) : TransacterImpl(driver), CardValuesEntityQueries {
  internal val selectByCardId: MutableList<Query<*>> = copyOnWriteList()

  override fun <T : Any> selectByCardId(cardId: String, mapper: (
    cardId: String,
    isPin1Default: Boolean?,
    isPin2Default: Boolean?,
    cardVerification: VerificationState?,
    cardValidation: VerificationState?,
    codeVerification: VerificationState?
  ) -> T): Query<T> = SelectByCardIdQuery(cardId) { cursor ->
    mapper(
      cursor.getString(0)!!,
      cursor.getLong(1)?.let { it == 1L },
      cursor.getLong(2)?.let { it == 1L },
      cursor.getString(3)?.let(database.cardValuesAdapter.cardVerificationAdapter::decode),
      cursor.getString(4)?.let(database.cardValuesAdapter.cardValidationAdapter::decode),
      cursor.getString(5)?.let(database.cardValuesAdapter.codeVerificationAdapter::decode)
    )
  }

  override fun selectByCardId(cardId: String): Query<CardValues> = selectByCardId(cardId,
      ::CardValues)

  override fun insertOrReplace(
    cardId: String,
    isPin1Default: Boolean?,
    isPin2Default: Boolean?,
    cardVerification: VerificationState?,
    cardValidation: VerificationState?,
    codeVerification: VerificationState?
  ) {
    driver.execute(585294902, """
    |INSERT OR REPLACE INTO cardValues(
    |  cardId,
    |  isPin1Default,
    |  isPin2Default,
    |  cardVerification,
    |  cardValidation,
    |  codeVerification
    |)
    |VALUES (?, ?, ?, ?, ?, ?)
    """.trimMargin(), 6) {
      bindString(1, cardId)
      bindLong(2, isPin1Default?.let { if (it) 1L else 0L })
      bindLong(3, isPin2Default?.let { if (it) 1L else 0L })
      bindString(4, cardVerification?.let {
          database.cardValuesAdapter.cardVerificationAdapter.encode(it) })
      bindString(5, cardValidation?.let {
          database.cardValuesAdapter.cardValidationAdapter.encode(it) })
      bindString(6, codeVerification?.let {
          database.cardValuesAdapter.codeVerificationAdapter.encode(it) })
    }
    notifyQueries(585294902, {database.cardValuesEntityQueries.selectByCardId})
  }

  override fun deleteAll() {
    driver.execute(-502610412, """DELETE FROM cardValues""", 0)
    notifyQueries(-502610412, {database.cardValuesEntityQueries.selectByCardId})
  }

  override fun deleteByCardId(cardId: String) {
    driver.execute(-1391878417, """
    |DELETE
    |FROM cardValues
    |WHERE cardId = ?
    """.trimMargin(), 1) {
      bindString(1, cardId)
    }
    notifyQueries(-1391878417, {database.cardValuesEntityQueries.selectByCardId})
  }

  private inner class SelectByCardIdQuery<out T : Any>(
    @JvmField
    val cardId: String,
    mapper: (SqlCursor) -> T
  ) : Query<T>(selectByCardId, mapper) {
    override fun execute(): SqlCursor = driver.executeQuery(1613393216, """
    |SELECT *
    |FROM cardValues
    |WHERE cardId = ?
    """.trimMargin(), 1) {
      bindString(1, cardId)
    }

    override fun toString(): String = "CardValuesEntity.sq:selectByCardId"
  }
}
