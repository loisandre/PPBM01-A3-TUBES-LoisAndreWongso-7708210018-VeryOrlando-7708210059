package com.example.ppbmasses2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class Slide_Foto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://www.dicoding.com/blog/wp-content/uploads/2020/04/internship-rendi-photo-backend.png", "Explore And Improve Your Programming Skills"))
        imageList.add(SlideModel("https://studio93.ie/wp-content/uploads/2021/03/designer-work-2048x1470.jpg", "Explore And Improve Your Designing Skills"))
        imageList.add(SlideModel("https://www.movingstonedigital.com/wp-content/uploads/2023/08/3dspace.jpg", "Explore And Improve Your 3D Animation Skills"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}