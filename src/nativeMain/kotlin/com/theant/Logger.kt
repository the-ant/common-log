package com.theant

internal actual fun printlnLog(TAG: String, message: String, logLevel: LogLevel) {
    println("$TAG - $logLevel: $message")
}
