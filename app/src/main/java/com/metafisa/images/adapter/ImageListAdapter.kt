package com.metafisa.images.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.metafisa.images.databinding.ItemImagesBinding
import com.metafisa.images.model.ImageModel

class ImageListAdapter(private val imagesList : List<ImageModel>): RecyclerView.Adapter<ImageListAdapter.ImageViewHolder>() {

    private lateinit var binding: ItemImagesBinding
    class ImageViewHolder(
        private val binding: ItemImagesBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(imageData: ImageModel) {
            binding.imageData = imageData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        binding = ItemImagesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageData = imagesList[position]
        holder.bind(imageData)
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }
}