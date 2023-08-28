package com.example.shyra_linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toasttugas1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnTest1.setOnClickListener{
                Toast.makeText(this@MainActivity,"Hello Guys!", Toast.LENGTH_LONG).show()
            }
        }
    }
}