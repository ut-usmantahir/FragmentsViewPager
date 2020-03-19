package com.example.fragmentsviewpager.listener

import com.example.fragmentsviewpager.fragment.FragmentTwo
import com.example.fragmentsviewpager.model.Movie

interface MovieFragmentOneHandler {

    fun onMovieAdapter(position: Int, string: Movie)
}