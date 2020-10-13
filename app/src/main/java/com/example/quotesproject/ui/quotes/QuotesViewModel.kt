package com.example.quotesproject.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.quotesproject.data.Quote

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuote() = quoteRepository.getQuote()
}