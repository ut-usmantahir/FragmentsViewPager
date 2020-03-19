package com.example.fragmentsviewpager

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fragmentsviewpager.fragment.FragmentFour
import com.example.fragmentsviewpager.fragment.FragmentOne
import com.example.fragmentsviewpager.fragment.FragmentThree
import com.example.fragmentsviewpager.fragment.FragmentTwo
import com.example.fragmentsviewpager.listener.MovieFragmentOneHandler
import com.example.fragmentsviewpager.model.Movie
//import com.example.fragmentsviewpager.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity(), MovieFragmentOneHandler{

    lateinit var fragmentTwo: FragmentTwo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPagerAdapter = MyViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.addFragment(FragmentOne(this),"Frag1")
        fragmentTwo = FragmentTwo()
        viewPagerAdapter.addFragment(fragmentTwo,"Frag2")
        viewPagerAdapter.addFragment(FragmentThree(),"Frag3")
        viewPagerAdapter.addFragment(FragmentFour(),"Frag4")

        viewPager.adapter = viewPagerAdapter
        tabs.setupWithViewPager(viewPager)


    }
    class MyViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

        private val fragmentList : MutableList<Fragment> = ArrayList()
        private val titleList : MutableList<String> = ArrayList()

        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }

        override fun getCount(): Int {
            return fragmentList.size
        }
        fun addFragment (fragment: Fragment, title: String){
            fragmentList.add(fragment)
            titleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }


    }


    override fun onMovieAdapter(position: Int, movie: Movie) {
        Toast.makeText(this, "moviefragment $position" + movie.toString(), Toast.LENGTH_SHORT).show()
        Log.d("MovieFragment", movie.toString())

        tabs.getTabAt(1)?.select()
            fragmentTwo.setValues(movie)


    }




}
