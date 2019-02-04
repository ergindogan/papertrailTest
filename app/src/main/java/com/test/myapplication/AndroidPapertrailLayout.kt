package com.test.myapplication

import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.LayoutBase
import org.joda.time.DateTime

class AlbertAndroidPapertrailLayout : LayoutBase<ILoggingEvent>() {

    override fun doLayout(event: ILoggingEvent): String {
        return "${DateTime(event.timeStamp).toString("MMM dd HH:mm:ss")} paper_test-${if (BuildConfig.DEBUG) "dev" else "prod"} 9009: (${event.level.levelStr} | ${BuildConfig.VERSION_NAME}) ${event.formattedMessage} "
    }
}