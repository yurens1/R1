package com.example.r1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.r1.R


class FaceHome : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_face_home, container, false)


        val loguinbutton=view.findViewById<TextView>(R.id.loguin_button)
        loguinbutton.setOnClickListener{
            findNavController().navigate(R.id.action_faceHome_to_userlayout)
        }

        return view
    }
}

