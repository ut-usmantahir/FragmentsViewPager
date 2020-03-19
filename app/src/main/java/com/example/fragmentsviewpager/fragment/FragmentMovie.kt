package com.example.fragmentsviewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentsviewpager.R

class FragmentMovie : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_two, container, false)

        /*var bundle = Bundle()

        val name = bundle?.get("name")
        val realname = bundle?.get("realname")
        val team =  bundle?.get("team")
        val firstappearance =    bundle?.get("firstappearance")
        val createdby =    bundle?.get("createdby")
        val publisher =    bundle?.get("publisher")
        val imageurl =    bundle?.get("imageurl")
        val bio =    bundle?.get("bio")


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
*/

        return view


    }

}
