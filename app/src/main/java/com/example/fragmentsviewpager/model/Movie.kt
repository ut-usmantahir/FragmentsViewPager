package com.example.fragmentsviewpager.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/*
data class Movie (
    val id : Int,
    val image: String,
    val is_new : Int,
    val language : String,
    val like_percent : Int,
    val rating : String,
    val title : String,
    val type : String,
    val vote_count : Int
)
*/
@Parcelize
data class Movie (
    var name:String,
    var realname:String,
    var team:String,
    var firstappearance:String,
    var createdby:String,
    var publisher:String,
    var imageurl:String,
    var bio:String
) : Parcelable

