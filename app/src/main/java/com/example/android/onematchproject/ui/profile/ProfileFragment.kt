package com.example.android.onematchproject.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.android.onematchproject.R

class ProfileFragment : Fragment() {

    private lateinit var viewModel: ProfileViewModel


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {

        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        return root
    }
}