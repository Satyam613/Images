package com.metafisa.images

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.metafisa.images.adapter.ImageListAdapter
import com.metafisa.images.databinding.ActivityMainBinding
import com.metafisa.images.viewmodel.ImageListViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this,R.layout.activity_main)

        val recyclerView = binding.imageRecyclerView
        val imageData =  ImageListViewModel.getDummyData(this)
        val adapter = ImageListAdapter(imageData)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}