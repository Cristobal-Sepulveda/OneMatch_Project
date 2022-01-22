package com.example.android.onematchproject.ui.home

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import com.example.android.onematchproject.R
import com.example.android.onematchproject.base.BaseFragment
import com.example.android.onematchproject.databinding.FragmentHomeBinding
import com.example.android.onematchproject.ui.map.MapViewModel
import com.google.android.gms.wallet.Wallet
import com.google.android.gms.wallet.WalletConstants
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList



class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding
    override val _viewModel: MapViewModel by inject()
    val cloudDB = FirebaseFirestore.getInstance()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_home,
            container,
            false)

        val firebaseAuth = FirebaseAuth.getInstance()





        return binding.root
    }

}