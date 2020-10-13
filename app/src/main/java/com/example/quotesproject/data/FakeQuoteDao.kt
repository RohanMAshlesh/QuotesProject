package com.example.quotesproject.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {

    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    //Function to add Quote
    fun addQuote(quote: Quote) {
        //add quote
        quoteList.add(quote)
        //update list
        quotes.value = quoteList
    }

    //Function to display quotes
    fun getQuote() = quotes as LiveData<List<Quote>>
}