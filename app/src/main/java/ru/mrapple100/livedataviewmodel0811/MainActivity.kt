package ru.mrapple100.livedataviewmodel0811

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import ru.mrapple100.livedataviewmodel0811.databinding.ActivityMainBinding

//https://codeshare.io/P8L9Y7
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(binding.root)
        val viewModel = ViewModelProvider(this).get(CustomViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this



    }



}