package com.theant

internal actual fun printlnLog(TAG: String, message: String, logLevel: LogLevel) {
    val log = "$TAG: $message\n"
    when(logLevel) {
        LogLevel.DEBUG -> console.log(log)
        LogLevel.WARN -> console.warn(log)
        LogLevel.INFO -> console.info(log)
        LogLevel.ERROR -> console.error(log)
    }
}
