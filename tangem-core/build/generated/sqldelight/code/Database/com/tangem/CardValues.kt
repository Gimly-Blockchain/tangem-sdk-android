package com.tangem

import com.squareup.sqldelight.ColumnAdapter
import kotlin.Boolean
import kotlin.String

data class CardValues(
  val cardId: String,
  val isPin1Default: Boolean?,
  val isPin2Default: Boolean?,
  val cardVerification: VerificationState?,
  val cardValidation: VerificationState?,
  val codeVerification: VerificationState?
) {
  override fun toString(): String = """
  |CardValues [
  |  cardId: $cardId
  |  isPin1Default: $isPin1Default
  |  isPin2Default: $isPin2Default
  |  cardVerification: $cardVerification
  |  cardValidation: $cardValidation
  |  codeVerification: $codeVerification
  |]
  """.trimMargin()

  class Adapter(
    val cardVerificationAdapter: ColumnAdapter<VerificationState, String>,
    val cardValidationAdapter: ColumnAdapter<VerificationState, String>,
    val codeVerificationAdapter: ColumnAdapter<VerificationState, String>
  )
}
