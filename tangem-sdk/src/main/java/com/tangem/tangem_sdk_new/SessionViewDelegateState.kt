package com.tangem.tangem_sdk_new

import com.tangem.Message
import com.tangem.TangemError
import com.tangem.WrongValueType
import com.tangem.commands.PinType

sealed class SessionViewDelegateState() {
    data class Error(val error: TangemError) : SessionViewDelegateState()
    data class Success(val message: Message?) : SessionViewDelegateState()
    data class SecurityDelay(val ms: Int, val totalDurationSeconds: Int) : SessionViewDelegateState()
    data class Delay(val total: Int, val current: Int, val step: Int) : SessionViewDelegateState()
    data class Ready(val cardId: String?, val message: Message?) : SessionViewDelegateState()
    data class PinRequested(val pinType: PinType, val callback: (pin: String) -> Unit) : SessionViewDelegateState()
    data class PinChangeRequested(val pinType: PinType, val callback: (pin: String) -> Unit) : SessionViewDelegateState()
    data class WrongCard(val wrongValueType: WrongValueType) : SessionViewDelegateState()
    object TagLost : SessionViewDelegateState()
    object TagConnected : SessionViewDelegateState()
}