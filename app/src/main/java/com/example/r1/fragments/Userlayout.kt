package com.example.r1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.r1.R
import com.example.r1.models.DataSource
import kotlinx.android.synthetic.main.fragment_userlayout.*


class userlayout : Fragment() {

   private lateinit var userAdapter: UserAdapter



       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

          return inflater.inflate(R.layout.fragment_userlayout, container, false) as Nothing



//recy

initRecycleView()
addDataSource()

    }

    private fun initRecycleView() {
        this.userAdapter = UserAdapter()

        recyclerview.layoutManager = LinearLayoutManager(context)
        recyclerview.adapter = this.userAdapter
    }




    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.userAdapter.setDataSet(dataSource)

    }
}

