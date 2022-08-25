package com.example.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProvider
import com.example.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myUser = User("John", "Doe", 25, true)
        binding.user = myUser

        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.myViewModel = myViewModel
        binding.lifecycleOwner = this


        binding.edittext.addTextChangedListener(
            onTextChanged = { text, start, before, count ->
                myViewModel.setMessage(text.toString())
            })


        //


        val dataModel = DataModel("Test","Test Desc","https://i.picsum.photos/id/661/400/400.jpg?hmac=wsnLOVv0EBUig0uzTa1e--ULW5_swoFNuzZIZJyeKb8")
        binding.dataModel = dataModel

    }
}