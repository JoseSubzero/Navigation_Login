package com.example.navigation_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigation_login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId){
                R.id.opHome -> {
                    Navigation.findNavController(binding.fragmentContainerView)
                        .navigate(R.id.initFragment)
                    true
                }
                R.id.opProfile ->{
                    findNavController(R.id.fragmentContainerView)
                        .navigate(R.id.firstFragment)
                    true
                }
                else -> false
            }

        }
    }
}