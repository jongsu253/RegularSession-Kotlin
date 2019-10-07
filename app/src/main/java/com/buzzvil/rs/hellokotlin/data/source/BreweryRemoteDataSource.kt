package com.buzzvil.rs.hellokotlin.data.source

import com.buzzvil.rs.hellokotlin.data.model.Brewery
import com.buzzvil.rs.hellokotlin.data.repository.BreweryDataSource
import com.buzzvil.rs.hellokotlin.network.BreweryApiService
import io.reactivex.Scheduler
import io.reactivex.Single

class BreweryRemoteDataSource constructor(
    private val breweryApiService: BreweryApiService,
    private val scheduler: Scheduler
) : BreweryDataSource {
    override fun getBreweries(): Single<List<Brewery>> =
        breweryApiService.requestBreweries().map { list ->
            list.map {
                Brewery(it.id, it.name, it.breweryType, it.street, it.city, it.state, it.phone)
            }
        }.subscribeOn(scheduler)

    override fun getBrewery(id: Int): Single<Brewery> =
        breweryApiService.requestBrewery(id).map {
            Brewery(it.id, it.name, it.breweryType, it.street, it.city, it.state, it.phone)
        }.subscribeOn(scheduler)
}