package com.example.androidmaquetacion

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val star1 = findViewById<ImageView>(R.id.star1)
        var isFavorite1 = false

        star1.setOnClickListener {
            isFavorite1 = !isFavorite1
            if (isFavorite1) {
                star1.setImageResource(R.drawable.star)
            } else {
                star1.setImageResource(R.drawable.deafult)
            }
        }

        val star2 = findViewById<ImageView>(R.id.star2)
        var isFavorite2 = false

        star2.setOnClickListener {
            isFavorite2 = !isFavorite2
            if (isFavorite2) {
                star2.setImageResource(R.drawable.star)
            } else {
                star2.setImageResource(R.drawable.deafult)
            }
        }

        val star3 = findViewById<ImageView>(R.id.star3)
        var isFavorite3 = false

        star3.setOnClickListener {
            isFavorite3 = !isFavorite3
            if (isFavorite3) {
                star3.setImageResource(R.drawable.star)
            } else {
                star3.setImageResource(R.drawable.deafult)
            }
        }

        val star4 = findViewById<ImageView>(R.id.star4)
        var isFavorite4 = false

        star4.setOnClickListener {
            isFavorite4 = !isFavorite4
            if (isFavorite4) {
                star4.setImageResource(R.drawable.star)
            } else {
                star4.setImageResource(R.drawable.deafult)
            }
        }





    }
}