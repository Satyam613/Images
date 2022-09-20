package com.metafisa.images.viewmodel

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import com.metafisa.images.R
import com.metafisa.images.model.ImageModel

class ImageListViewModel :ViewModel(){
    companion object {
        fun getDummyData(context: Context): List<ImageModel>{
            val imageData = arrayListOf<ImageModel>()

            val imageData1 = ImageModel(
                ContextCompat.getDrawable(context,R.drawable.blue)
            )
            val imageData2 = ImageModel(
                ContextCompat.getDrawable(context, R.drawable.blue)
            )
            val imageData3 = ImageModel(
                ContextCompat.getDrawable(context,R.drawable.blue)
            )
            val imageData4 = ImageModel(
                ContextCompat.getDrawable(context,R.drawable.blue)
            )

            imageData.add(imageData1)
            imageData.add(imageData2)
            imageData.add(imageData3)
            imageData.add(imageData4)

            return imageData

        }
    }
}