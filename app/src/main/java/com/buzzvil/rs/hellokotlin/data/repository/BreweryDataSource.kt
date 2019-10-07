package com.buzzvil.rs.hellokotlin.data.repository

import com.buzzvil.rs.hellokotlin.data.model.Brewery
import io.reactivex.Single

interface BreweryDataSource {
    fun getBreweries(): Single<List<Brewery>>

    fun getBrewery(id: Int): Single<Brewery>
}