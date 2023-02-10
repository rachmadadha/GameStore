package com.bootcamp.gamestore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bootcamp.gamestore.databinding.ActivityTugas1Binding
import androidx.recyclerview.widget.LinearLayoutManager

class Tugas1 : AppCompatActivity() {
    private lateinit var binding: ActivityTugas1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugas1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.recyclerViewGame.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        val gameImages = listOf(
            GameImage(0,R.drawable.gameplay1),
            GameImage(1,R.drawable.gameplay2)
        )

        binding.recyclerViewGame.adapter = gameImageListAdapter(gameImages)
    }
}