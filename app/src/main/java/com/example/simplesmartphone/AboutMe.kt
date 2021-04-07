package com.example.simplesmartphone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val myPhoto: ImageView = findViewById(R.id.img_item_photo)

        val tImg = R.drawable.my_photos

        Glide.with(this)
                .load(tImg)
                .apply(RequestOptions().override(512, 512))
                .into(myPhoto)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}