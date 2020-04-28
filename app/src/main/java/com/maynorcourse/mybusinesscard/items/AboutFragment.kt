package com.maynorcourse.mybusinesscard.items

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import com.maynorcourse.mybusinesscard.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_about.*

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_about, container, false)
        val avatar = root.findViewById<ImageView>(R.id.avatar)
        Picasso.get()//.with(context)
            .load("https://avatars.mds.yandex.net/get-pdb/1572252/8a917ce0-ad46-406e-9618-cc0c3c81d181/s1200")
            /*.placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_local_phone_black_24dp)*/
            //.fit()
            .into(avatar);
        return root
    }

}
