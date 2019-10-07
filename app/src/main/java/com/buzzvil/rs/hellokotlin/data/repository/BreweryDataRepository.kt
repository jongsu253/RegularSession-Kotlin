package com.buzzvil.rs.hellokotlin.data.repository

import com.buzzvil.rs.hellokotlin.domain.model.Brewery
import com.buzzvil.rs.hellokotlin.domain.repository.BreweryRepository
import io.reactivex.Single

class BreweryDataRepository(
    private val breweryDataSource: BreweryDataSource
) : BreweryRepository {

    override fun getBreweryById(id: Int): Single<Brewery> =
        breweryDataSource.getBrewery(id).map {
            Brewery(it.id, it.name, it.breweryType, it.street)
        }

    override fun getBreweries(): Single<List<Brewery>> =
        breweryDataSource.getBreweries().map { list ->
            list.map {
                Brewery(it.id, it.name, it.breweryType, it.street)
            }
        }
}