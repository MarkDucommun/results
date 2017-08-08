package io.ducommun.results

import java.io.Serializable

sealed class Result<failureType, successType> : Serializable

data class Success<failureType, successType>(
        val content: successType
) : Result<failureType, successType>()

data class Failure<failureType, successType>(
        val content: failureType
) : Result<failureType, successType>()

val EMPTY_SUCCESS = Success<String, Unit>(Unit)
