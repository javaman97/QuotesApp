package com.quotes.quotesapp.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiQuotes(
    @SerialName("author")
    val author: String = "",
    @SerialName("quote")
    val quote: String = ""
)