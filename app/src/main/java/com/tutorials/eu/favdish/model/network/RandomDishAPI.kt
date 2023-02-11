package com.tutorials.eu.favdish.model.network

import com.tutorials.eu.favdish.model.entities.RandomDish
import com.tutorials.eu.favdish.utils.Constants
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomDishAPI {

    @GET(Constants.API_ENDPOINT)
    fun getDishes(
        @Query(Constants.API_KEY) apiKey: String,
        @Query(Constants.LIMIT_LICENSE) limitLicense: Boolean,
        @Query(Constants.NUMBER) number: Int,
        @Query(Constants.TAGS) tags: String
    ): Single<RandomDish.Recipes>
}