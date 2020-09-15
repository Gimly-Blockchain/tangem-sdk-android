package com.tangem

import com.squareup.sqldelight.Transacter
import com.squareup.sqldelight.db.SqlDriver
import com.tangem.tangemcore.newInstance
import com.tangem.tangemcore.schema

interface Database : Transacter {
  val cardValuesEntityQueries: CardValuesEntityQueries

  companion object {
    val Schema: SqlDriver.Schema
      get() = Database::class.schema

    operator fun invoke(driver: SqlDriver, cardValuesAdapter: CardValues.Adapter): Database =
        Database::class.newInstance(driver, cardValuesAdapter)}
}
