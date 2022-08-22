package com.example.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myUser = User("John","Doe",25,false)

        binding.user = myUser
    }
}