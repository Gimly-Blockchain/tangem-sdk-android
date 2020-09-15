package com.tangem.tangem_sdk_new.extensions

import android.content.Context
import android.os.Vibrator

/**
 * Created by Anton Zhilenkov on 03/08/2020.
 */
fun Context.dpToPx(dp: Float): Float = dp * resources.displayMetrics.density
fun Context.pxToDp(px: Float): Float = Math.round(px / resources.displayMetrics.density).toFloat()

fun Context.vibrate(pattern: LongArray, repeat: Int = -1) {
    val vibro = getSystemService(Context.VIBRATOR_SERVICE) as? Vibrator ?: return
    vibro.vibrate(pattern, repeat)
}