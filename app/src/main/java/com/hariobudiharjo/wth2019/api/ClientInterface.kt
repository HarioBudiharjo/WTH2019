package com.hariobudiharjo.wth2019.api

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ClientInterface {
    @GET("sensor")
    fun initiateSession(@Header("Authorization") token: String): Observable<ResponseBody>

    @GET("recentdata")
    fun validateOTP(@Header("Authorization") token: String, @Query("id") id: String, @Query("windspeedmph") wind: String): Observable<ResponseBody>

}