package com.example.sfedukot.api

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RestApiService{

    fun sendToServer(form: RegistrationForm, onResult: (RegistrationForm?) -> Unit){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.sendToServer(form).enqueue(
            object : Callback<RegistrationForm> {
                override fun onFailure(call: Call<RegistrationForm>, t:Throwable){
                    onResult(null)
                }
                override fun onResponse(call: Call<RegistrationForm>, response: Response<RegistrationForm>){
                    val addedUser = response.body()
                    onResult(addedUser)
                }
            }
        )
    }

}