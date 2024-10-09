package com.quotes.quotesapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Quote(quoteText:String){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .padding(5.dp)
        .clip(RoundedCornerShape(12.dp))){
        Column {
            Text(text = quoteText, color = Color.Black, fontSize = 22.sp)
        }
    }
}


@Composable
@Preview
fun QuotePreview(){
    Quote(quoteText = "Honesty is the best policy")
}