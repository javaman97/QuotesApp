package com.quotes.quotesapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable

@Composable
fun ListOfQuotes(quoteList: QuoteList){
    LazyColumn {
        Quote(quoteText = quoteList.results )
    }
}