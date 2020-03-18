package com.example.fragmentsviewpager.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fragmentsviewpager.R
import com.example.fragmentsviewpager.Test
import com.example.fragmentsviewpager.databinding.LayoutMovieItemBinding
import com.example.fragmentsviewpager.fragment.FragmentMovie
import com.example.fragmentsviewpager.listener.MovieRecyclerClickListener
import com.example.fragmentsviewpager.model.Movie


class MyMovieAdapter(private val context: Context, private val movieList: MutableList<Movie>): RecyclerView.Adapter<MyMovieAdapter.MyViewHolder>() {

    var listener: MovieRecyclerClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : MyViewHolder {
        return MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.layout_movie_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        Log.v("UsmanonBindViewHolder",
            movieList[position].name +" TEAM "+
                    movieList[position].team +" CREATEDBY "+
                    movieList[position].createdby)

/*        Glide.with(context)
            .load(movieList[position].imageurl)
            .into(holder.binding.imageMovie);
        Picasso.get().load(movieList[position].imageurl).into(holder.image)*/
        holder.binding.movie = movieList[position]

        holder.binding.root.setOnClickListener {

//            Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()

            listener?.onMovieClicked(position)

/*
           val intent = Intent(this.context, FragmentMovie::class.java)

                intent.putExtra("movie", holder.binding.movie)

            intent.putExtra("name", movieList[position].name)
            intent.putExtra("realname", movieList[position].realname)
            intent.putExtra("team", movieList[position].team)
            intent.putExtra("firstappearance", movieList[position].firstappearance)
            intent.putExtra("createdby", movieList[position].createdby)
            intent.putExtra("publisher", movieList[position].publisher)
            intent.putExtra("imageurl", movieList[position].imageurl)
            intent.putExtra("bio", movieList[position].bio)

            context.startActivity(intent)
*/

        }

    }

     inner class MyViewHolder(
         val binding: LayoutMovieItemBinding
     ) : RecyclerView.ViewHolder(binding.root)

    companion object {
        @JvmStatic
        @BindingAdapter("imageUrl")
        fun loadImage(view: ImageView, url: String) {
            Glide.with(view.context)
                .load(url)
                .into(view);
        }
    }

}



