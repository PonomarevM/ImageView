package com.example.image

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class PhotoActivity : AppCompatActivity() {

    private lateinit var photoImageView: ImageView
    private lateinit var nextButton: Button
    private var currentPhotoIndex = 0
    private val photos = arrayOf(
        R.drawable.photo1,
        R.drawable.photo2,
        R.drawable.photo3,
        R.drawable.photo4,
        R.drawable.photo5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

        photoImageView = findViewById(R.id.photoImageView)
        nextButton = findViewById(R.id.nextButton)
        currentPhotoIndex = intent.getIntExtra("currentPhotoIndex",0)
        showPhoto()


        nextButton.setOnClickListener {
            showNextPhoto()
        }
    }

    private fun showPhoto() {
        if(currentPhotoIndex < photos.size) {
            photoImageView.setImageResource(photos[currentPhotoIndex])
        }
    }


    private fun showNextPhoto() {
        if (currentPhotoIndex < photos.size - 1) {
            currentPhotoIndex++
            showPhoto()
        }else{
            val intent = Intent(this, EndActivity::class.java)
            startActivity(intent)
        }
    }
}