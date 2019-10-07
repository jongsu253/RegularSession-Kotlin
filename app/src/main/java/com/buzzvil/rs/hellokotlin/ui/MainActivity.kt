package com.buzzvil.rs.hellokotlin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.buzzvil.rs.hellokotlin.R
import com.buzzvil.rs.hellokotlin.network.BreweryApiService
import com.buzzvil.rs.hellokotlin.network.ServiceFactory

class MainActivity : AppCompatActivity() {

    private val breweryApiService = ServiceFactory.get(BreweryApiService::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}