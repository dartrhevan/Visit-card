package com.maynorcourse.mybusinesscard.items

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import com.maynorcourse.mybusinesscard.R
import com.squareup.picasso.Picasso

/**
 * A simple [Fragment] subclass.
 */
class StudyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_study, container, false)
        val inst_image = root.findViewById<ImageView>(R.id.inst_image)
        Picasso.get()//.with(context)
            .load("http://test.project-it.info/sites/default/files/vhod_v_zdanie_irit-rtf_urfu_-_1_1.jpg")
            /*.placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_local_phone_black_24dp)*/
            //.fit()
            .into(inst_image);
        return root
    }

}
