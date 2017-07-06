package io.ducommun.results

fun <failureType, successType> successType.asSuccess(): Result<failureType, successType> = Success(this)