package com.geektech.gravityfalls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.gravityfalls.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState==null){
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, FirstFragment()).commit()
        }
    }
}