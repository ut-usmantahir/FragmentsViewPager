package com.example.fragmentsviewpager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.fragmentsviewpager.R
import com.example.fragmentsviewpager.listener.MovieFragmentOneHandler
import com.example.fragmentsviewpager.model.Movie
import kotlinx.android.synthetic.main.fragment_two.*
import kotlinx.android.synthetic.main.fragment_two.image_movie
import kotlinx.android.synthetic.main.fragment_two.txt_createdby
import kotlinx.android.synthetic.main.fragment_two.txt_name
import kotlinx.android.synthetic.main.fragment_two.txt_team
import kotlinx.android.synthetic.main.layout_movie_item.*
import com.example.fragmentsviewpager.databinding.FragmentTwoBinding

/**
 * A simple [Fragment] subclass.
 */
class FragmentTwo : Fragment() {

    private lateinit var fragTwoBinding: FragmentTwoBinding

 /*   lateinit var name:String
    lateinit var realname:String
    lateinit var firstappearance:String
    lateinit var createdby:String
    lateinit var publisher:String
    lateinit var imageurl:String
    lateinit var bio:String
*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // val view  = inflater.inflate(R.layout.fragment_two, container, false)

        fragTwoBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_two, container, false)

        val view = fragTwoBinding.root

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
     // tv_fragment_name.text = "Fragment Two"
    }
   fun setValues(movie: Movie){
 /*       Glide.with(this)
            .load(movie.imageurl)
            .into(fragTwoBinding.image_movie.imageurl)
       fragTwoBinding.txtName.text = movie.name
       fragTwoBinding.txtRealname.text = movie.realname
       fragTwoBinding.txtTeam.text = movie.team
       fragTwoBinding.txtFirstappearance.text = movie.firstappearance
       fragTwoBinding.txtCreatedby.text = movie.createdby
       fragTwoBinding.txtPublisher.text = movie.publisher
       fragTwoBinding.txtBio.text = movie.bio
*/

       Glide.with(this)
           .load(movie.imageurl)
           .into(fragTwoBinding.imageMovie)

       fragTwoBinding.premovie = movie


       Toast.makeText(context, "setValues: MovieName= ${movie.name}", Toast.LENGTH_SHORT).show()

    }



}
