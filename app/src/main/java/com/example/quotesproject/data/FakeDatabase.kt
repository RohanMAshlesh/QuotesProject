package com.example.quotesproject.data

//private constructor to make it inaccessible from other class
class FakeDatabase private constructor(){
    val quoteDao = FakeQuoteDao()

    companion object{
        // @Volatile - So that writes to this property are immediately visible to other threads
        @Volatile private var instance : FakeDatabase? = null

        fun getInstance() = instance ?: synchronized(this){
            instance ?: FakeDatabase().also { instance = it }
        }

    }

}