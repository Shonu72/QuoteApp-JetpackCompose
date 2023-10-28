package co.techlax.quoteapp.ui.theme.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import co.techlax.quoteapp.ui.theme.models.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote: Quote) -> Unit) {
    LazyColumn(content = {
        items(data) {
            QuoteListItem(quote = it, onClick)
        }
    })
}
