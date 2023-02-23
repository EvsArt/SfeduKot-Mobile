package com.example.sfedukot

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.sfedukot.api.RegistrationForm
import com.example.sfedukot.api.RestApiService

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

    fun createUser(view: View){
        val user: RegistrationForm = RegistrationForm(
            findViewById<EditText>(R.id.username).text.toString(),
            findViewById<EditText>(R.id.password).text.toString(),
            findViewById<EditText>(R.id.confirmPassword).text.toString()
        )

        val apiService = RestApiService()
        apiService.sendToServer(user){}

    }

}

