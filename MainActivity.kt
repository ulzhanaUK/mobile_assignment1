package com.example.assignment1

import Post
import PostAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val samplePosts = listOf(
            Post(R.drawable.photo1, "Middle of the night"),
            Post(R.drawable.photo2, "Beauty of the autumn"),
            Post(R.drawable.photo3, "Being loved ^^"),
            Post(R.drawable.photo4, "Korea"),
            Post(R.drawable.photo5, "Empty street"),
            Post(R.drawable.photo6, "la la la"),
            Post(R.drawable.photo7, "Programming"),
            Post(R.drawable.photo8, "Post 8"),
            Post(R.drawable.photo9, "Exotic"),
            Post(R.drawable.photo1, "Pool"),
        )

        val adapter = PostAdapter(samplePosts)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
}
