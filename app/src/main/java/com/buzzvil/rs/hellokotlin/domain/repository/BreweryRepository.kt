package com.buzzvil.rs.hellokotlin.domain.repository

import com.buzzvil.rs.hellokotlin.domain.model.Brewery
import io.reactivex.Single

interface BreweryRepository {
    fun getBreweryById(id: Int) : Single<Brewery>

    fun getBreweries() : Single<List<Brewery>>
}