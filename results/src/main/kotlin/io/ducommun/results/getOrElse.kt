package io.ducommun.results

fun <failureType, successType> Result<failureType, successType>.getOrElse(alternate: successType): successType {

    return when (this) {
        is Success -> content
        is Failure -> alternate
    }
}