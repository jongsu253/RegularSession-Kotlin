package com.buzzvil.rs.hellokotlin.domain.usecase

import com.buzzvil.rs.hellokotlin.domain.model.Brewery
import com.buzzvil.rs.hellokotlin.domain.repository.BreweryRepository
import io.reactivex.Scheduler
import io.reactivex.Single

class GetBreweryUseCase constructor(
    private val breweryRepository: BreweryRepository,
    private val scheduler: Scheduler
) {
    fun execute(id: Int): Single<Brewery> =
        breweryRepository.getBreweryById(id).observeOn(scheduler)
}