package com.example.timerkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.timerkotlin.util.NotificationUtil
import com.example.timerkotlin.util.PrefUtil


class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}