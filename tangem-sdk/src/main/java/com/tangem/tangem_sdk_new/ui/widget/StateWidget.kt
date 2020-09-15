package com.tangem.tangem_sdk_new.ui.widget

import android.view.View
import com.tangem.tangem_sdk_new.SessionViewDelegateState
import com.tangem.tangem_sdk_new.extensions.show

interface StateWidget<T> {
    fun isVisible(): Boolean
    fun showWidget(show: Boolean, withAnimation: Boolean = true)
    fun setState(params: T)
    fun onBottomSheetDismiss()
}

abstract class BaseStateWidget<T>(protected val mainView: View) : StateWidget<T> {

    override fun isVisible(): Boolean = mainView.visibility == View.VISIBLE

    override fun showWidget(show: Boolean, withAnimation: Boolean) {
        mainView.show(show)
    }

    override fun onBottomSheetDismiss() {

    }

    protected fun getString(id: Int): String = mainView.context.getString(id)

    protected fun getFormattedString(id: Int, name: String): String = mainView.context.getString(id, name)

}

abstract class BaseSessionDelegateStateWidget(mainView: View) : BaseStateWidget<SessionViewDelegateState>(mainView)