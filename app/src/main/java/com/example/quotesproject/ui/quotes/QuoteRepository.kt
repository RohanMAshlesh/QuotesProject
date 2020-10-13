package com.example.quotesproject.ui.quotes

import com.example.quotesproject.data.FakeQuoteDao
import com.example.quotesproject.data.Quote

class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao) {

    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    fun getQuote() = quoteDao.getQuote()

    companion object {
        // @Volatile - So that writes to this property are immediately visible to other threads
        @Volatile
        private var instance: QuoteRepository? = null

        fun getInstance(quoteDao: FakeQuoteDao) = instance ?: synchronized(this) {
            instance ?: QuoteRepository(quoteDao = FakeQuoteDao()).also { instance = it }
        }

    }

}