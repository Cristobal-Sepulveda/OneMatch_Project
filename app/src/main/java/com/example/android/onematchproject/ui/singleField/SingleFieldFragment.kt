package com.example.android.onematchproject.ui.singleField

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.android.onematchproject.R
import com.example.android.onematchproject.base.BaseFragment
import com.example.android.onematchproject.databinding.FragmentProfileBinding
import com.example.android.onematchproject.databinding.FragmentSingleFieldBinding
import com.example.android.onematchproject.ui.profile.ProfileViewModel
import com.google.firebase.firestore.FirebaseFirestore
import org.koin.android.ext.android.inject
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class SingleFieldFragment: BaseFragment() {

    //use Koin to retrieve the ViewModel instance
    override val _viewModel: ProfileViewModel by inject()
    private lateinit var binding: FragmentSingleFieldBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_single_field, container, false)
        binding.viewModel = _viewModel
        binding.lifecycleOwner = this

        val days = resources.getStringArray(R.array.days)
        var i = 0

        while(i < getNextFourteenDaysFormattedDates().size) {
            println(getNextFourteenDaysFormattedDates()[i])
            days[i] = getNextFourteenDaysFormattedDates()[i]
            i++
        }

        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, days)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

        return binding.root
    }

    private fun getNextFourteenDaysFormattedDates(): ArrayList<String> {
        val formattedDateList = ArrayList<String>()
        val calendar = Calendar.getInstance()
        for (i in 0..13) {
            val currentTime = calendar.time
            val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            formattedDateList.add(dateFormat.format(currentTime))
            calendar.add(Calendar.DAY_OF_YEAR, 1)
        }
        return formattedDateList
    }
}