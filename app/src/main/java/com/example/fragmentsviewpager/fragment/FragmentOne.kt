package com.example.fragmentsviewpager.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragmentsviewpager.adapter.MyMovieAdapter
import com.example.fragmentsviewpager.databinding.FragmentOneBinding
import com.example.fragmentsviewpager.R
import com.example.fragmentsviewpager.model.Movie
import com.example.fragmentsviewpager.network.MoviesApi
import com.example.fragmentsviewpager.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * A simple [Fragment] subclass.
 */
class FragmentOne : Fragment() {

    private lateinit var fragBinding: FragmentOneBinding

    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapterMyMovie: MyMovieAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
        {
            fragBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_one, container, false)

            val view = fragBinding.root

            val repository = MoviesRepository(MoviesApi())

            GlobalScope.launch(Dispatchers.Main) {
                val movies = repository.getMovies()

                Log.d("Usman", movies.toString())

                layoutManager = LinearLayoutManager(view.context)
                fragBinding.recyclerMovieList.layoutManager = layoutManager
                fragBinding.recyclerMovieList.setHasFixedSize(true)

                adapterMyMovie =
                    MyMovieAdapter(
                        view.context,
                        movies as MutableList<Movie>
                    )

                fragBinding.recyclerMovieList.adapter = adapterMyMovie
            }

            return view
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //binding.cameraPreview
    }

}
