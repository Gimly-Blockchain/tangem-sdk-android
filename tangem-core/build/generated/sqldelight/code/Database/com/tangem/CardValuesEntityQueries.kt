package com.tangem

import com.squareup.sqldelight.Query
import com.squareup.sqldelight.Transacter
import kotlin.Any
import kotlin.Boolean
import kotlin.String

interface CardValuesEntityQueries : Transacter {
  fun <T : Any> selectByCardId(cardId: String, mapper: (
    cardId: String,
    isPin1Default: Boolean?,
    isPin2Default: Boolean?,
    cardVerification: VerificationState?,
    cardValidation: VerificationState?,
    codeVerification: VerificationState?
  ) -> T): Query<T>

  fun selectByCardId(cardId: String): Query<CardValues>

  fun insertOrReplace(
    cardId: String,
    isPin1Default: Boolean?,
    isPin2Default: Boolean?,
    cardVerification: VerificationState?,
    cardValidation: VerificationState?,
    codeVerification: VerificationState?
  )

  fun deleteAll()

  fun deleteByCardId(cardId: String)
}
