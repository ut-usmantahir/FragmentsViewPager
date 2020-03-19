package com.example.fragmentsviewpager.listener

import com.example.fragmentsviewpager.model.Movie

interface MovieRecyclerClickListener {
    fun onMovieClicked(position: Int, movie: Movie)
}