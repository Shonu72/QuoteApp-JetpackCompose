package co.techlax.quoteapp.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import co.techlax.quoteapp.ui.theme.models.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote: Quote) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.Black.copy(0.8f),
            ),
    ) {
        Column {
            Text(
                text = "Quote App",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(8.dp, 13.dp)
                    .fillMaxWidth(1f),
                style = MaterialTheme.typography.headlineMedium,
                fontFamily = FontFamily.Monospace,
                color = Color.White, // White text color
            )

            QuoteList(data = data, onClick)
        }
    }
}
