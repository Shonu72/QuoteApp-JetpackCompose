package co.techlax.quoteapp.ui.theme.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material.icons.outlined.FileCopy
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import co.techlax.quoteapp.DataManager
import co.techlax.quoteapp.ui.theme.models.Quote

@Composable
fun QuoteDetail(quote: Quote) {
    BackHandler {
        DataManager.switchPages(null)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color.Black.copy(.8f)),
    ) {
        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
        ) {
            Column(
                modifier = Modifier
                    .background(Color.DarkGray)
                    .fillMaxWidth()
                    .padding(4.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Image(
                    imageVector = Icons.Filled.FormatQuote,
                    colorFilter = ColorFilter.tint(Color.White),
                    contentDescription = "Quote",
                    modifier = Modifier
                        .size(40.dp)
                        .rotate(180f)
                        .padding(4.dp),
                )
            }
            Column(
                modifier = Modifier
                    .background(Color.DarkGray)
                    .fillMaxWidth()
                    .padding(4.dp),
                horizontalAlignment = Alignment.End,
            ) {
                Text(
                    text = quote.text,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(top = 10.dp, bottom = 20.dp, start = 10.dp, end = 10.dp),
                    color = Color.White,
                )
                Box(
                    modifier = Modifier
                        .background(Color.Gray.copy(.5f))
                        .fillMaxWidth(.4f)
                        .height(1.dp),
                )
                Text(
                    // this should be horizontal end alignment
                    text = quote.author,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 12.dp, start = 10.dp, end = 20.dp),
                    color = Color.White,
                )
            }
        }
    }

//    Box {
//        Card(
//            elevation = CardDefaults.cardElevation(4.dp),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(20.dp),
//        ) {
//            Row {
//                Icons.Outlined.FileCopy
//            }
//        }
//    }
}
