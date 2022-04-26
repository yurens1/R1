package com.example.r1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.r1.R
import com.example.r1.ui.UserAdapter


class SignHome : Fragment() {

private lateinit var userAdapter: UserAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_sign_home, container, false)


        val buttonface = view.findViewById<TextView>(R.id.button_facebook)
        buttonface.setOnClickListener {
            findNavController().navigate(R.id.action_signHome_to_faceHome)
        }
        val buttongoogle = view.findViewById<TextView>(R.id.button_google)
        buttongoogle.setOnClickListener {
            findNavController().navigate(R.id.action_signHome_to_googleHome)
        }

        return view
    }



    }










