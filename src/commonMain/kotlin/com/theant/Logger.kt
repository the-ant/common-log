package com.theant

internal expect fun printlnLog(TAG: String, message: String, logLevel: LogLevel)

fun logDebug(TAG: String, message: String) = printlnLog(TAG, message, LogLevel.DEBUG)
fun logInfo(TAG: String, message: String) = printlnLog(TAG, message, LogLevel.INFO)
fun logWarn(TAG: String, message: String) = printlnLog(TAG, message, LogLevel.WARN)
fun logError(TAG: String, message: String) = printlnLog(TAG, message, LogLevel.ERROR)
