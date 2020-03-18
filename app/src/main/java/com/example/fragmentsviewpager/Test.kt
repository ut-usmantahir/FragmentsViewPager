package com.example.fragmentsviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_one_preview.*

class Test : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_one_preview)

        var intent = intent.extras

        val name = intent?.get("name")
        val realname = intent?.get("realname")
        val team =  intent?.get("team")
        val firstappearance =    intent?.get("firstappearance")
        val createdby =    intent?.get("createdby")
        val publisher =    intent?.get("publisher")
        val imageurl =    intent?.get("imageurl")
        val bio =    intent?.get("bio")


        Glide.with(this)
            .load(imageurl)
            .into(image_movie)
        txt_name.text = name.toString()
        txt_realname.text = realname.toString()
        txt_team.text = team.toString()
        txt_firstappearance.text = firstappearance.toString()
        txt_createdby.text = createdby.toString()
        txt_publisher.text = publisher.toString()
        txt_bio.text = bio.toString()



    }
}
