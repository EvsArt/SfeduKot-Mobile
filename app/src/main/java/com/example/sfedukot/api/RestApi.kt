package com.example.sfedukot.api

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RestApi {

    @Headers("Content-Type: application/json")
    @POST("newperson")
    fun sendToServer(@Body form: RegistrationForm): Call<RegistrationForm>

}