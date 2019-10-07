package com.buzzvil.rs.hellokotlin.network

import com.buzzvil.rs.hellokotlin.network.model.Brewery
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface BreweryApiService {

    @GET("/breweries")
    fun requestBreweries(): Single<List<Brewery>>

    @GET("/breweries/{id}")
    fun requestBrewery(@Path("id") id: Int): Single<Brewery>
}