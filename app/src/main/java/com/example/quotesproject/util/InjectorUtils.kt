package com.example.quotesproject.util

import com.example.quotesproject.data.FakeDatabase
import com.example.quotesproject.ui.quotes.QuoteRepository
import com.example.quotesproject.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}