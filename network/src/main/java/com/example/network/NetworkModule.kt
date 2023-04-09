package com.example.network

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://p2p.binance.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}
