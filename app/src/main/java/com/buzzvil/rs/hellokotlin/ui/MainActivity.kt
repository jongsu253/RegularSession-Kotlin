package com.buzzvil.rs.hellokotlin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.buzzvil.rs.hellokotlin.R
import com.buzzvil.rs.hellokotlin.data.repository.BreweryDataRepository
import com.buzzvil.rs.hellokotlin.data.repository.BreweryDataSource
import com.buzzvil.rs.hellokotlin.data.source.BreweryRemoteDataSource
import com.buzzvil.rs.hellokotlin.domain.repository.BreweryRepository
import com.buzzvil.rs.hellokotlin.domain.usecase.GetBreweriesUseCase
import com.buzzvil.rs.hellokotlin.domain.usecase.GetBreweryUseCase
import com.buzzvil.rs.hellokotlin.network.BreweryApiService
import com.buzzvil.rs.hellokotlin.network.ServiceFactory
import com.buzzvil.rs.hellokotlin.presentation.model.Brewery
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val breweryApiService = ServiceFactory.get(BreweryApiService::class.java)
    private val breweryDataSource: BreweryDataSource =
        BreweryRemoteDataSource(breweryApiService, Schedulers.io())
    private val breweryRepository: BreweryRepository = BreweryDataRepository(breweryDataSource)
    private val getBreweryUseCase =
        GetBreweryUseCase(breweryRepository, AndroidSchedulers.mainThread())
    private val getBreweriesUseCase =
        GetBreweriesUseCase(breweryRepository, AndroidSchedulers.mainThread())

    private val adapter = BreweriesAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        loadButton.setOnClickListener {
            getBreweriesUseCase.execute()
                .doOnError {  }
                .doOnSuccess { list ->
                    adapter.breweries = list.map {
                        Brewery(it.name, it.type, it.street)
                    }
                    adapter.notifyDataSetChanged()
                }
                .subscribe()
        }
    }

}