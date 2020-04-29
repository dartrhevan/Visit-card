package com.maynorcourse.mybusinesscard.items

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.maynorcourse.mybusinesscard.Interest
import com.maynorcourse.mybusinesscard.InterestAdapter

import com.maynorcourse.mybusinesscard.R

/**
 * A simple [Fragment] subclass.
 */
class InterestsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_interests, container, false)
        val recyclerView = root.findViewById<RecyclerView>(R.id.interests_list)
        recyclerView.adapter = InterestAdapter(requireContext(),
            listOf(Interest("Android разработка", R.drawable.ic_android_black_24dp),
                Interest("Backend разработка", R.drawable.ic_settings_black_24dp),
                Interest("Frontend разработка", R.drawable.ic_chrome_reader_mode_black_24dp)
        ))

        return root
    }

}
