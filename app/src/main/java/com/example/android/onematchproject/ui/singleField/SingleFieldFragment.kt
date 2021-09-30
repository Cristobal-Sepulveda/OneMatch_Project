 package com.example.android.onematchproject.ui.singleField

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.android.onematchproject.R
import com.example.android.onematchproject.base.BaseFragment
import com.example.android.onematchproject.databinding.FragmentSingleFieldBinding
import org.koin.android.ext.android.inject
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class SingleFieldFragment: BaseFragment() {

    //use Koin to retrieve the ViewModel instance
    override val _viewModel: SingleFieldViewModel by inject()
    private lateinit var binding: FragmentSingleFieldBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_single_field, container, false)
        binding.viewModel = _viewModel
        binding.lifecycleOwner = this
        val days = resources.getStringArray(R.array.days)
        var i = 0
        while (i < getFourteenDaysDatesFromToday().size) {
            days[i] = getFourteenDaysDatesFromToday()[i]
            i++
        }
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, days)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

        return binding.root
    }

    override fun onResume() {
        super.onResume()

        /** Method that sets the date as the one the user select*/
        binding.autoCompleteTextView.setOnItemClickListener { parent, view, position, id ->
            val selectedDate = parent.getItemAtPosition(position) as String
            Log.i("ITEM CLICKED", "$position")
            Log.i("ITEM CLICKED", selectedDate)
        }

        /**
         * function's that send the consult to cloudFirestore and draw the registered players in
         * that field at that time & date
         * */
        binding.fiveToSix.setOnClickListener {
            /**
             * function that send the consult to cloudFirestore and draw the registered players in
             * that field at that time & date
             * */
            _viewModel.gettingListOfPlayersToHourAndDateSelected_FromCloudFirestore(
                _viewModel.selectedDate.value!!, "FIVETOSIX"
            )
            displayingDatainTheLayoutXML()
        }
        binding.sixToSeven.setOnClickListener {
            _viewModel.gettingListOfPlayersToHourAndDateSelected_FromCloudFirestore(
                _viewModel.selectedDate.value!!, "SIXTOSEVEN"
            )
            displayingDatainTheLayoutXML()
        }
        binding.sevenToEight.setOnClickListener {
            _viewModel.gettingListOfPlayersToHourAndDateSelected_FromCloudFirestore(
                _viewModel.selectedDate.value!!, "SEVENTOEIGHT"
            )
            displayingDatainTheLayoutXML()
        }
        binding.eightToNine.setOnClickListener {
            _viewModel.gettingListOfPlayersToHourAndDateSelected_FromCloudFirestore(
                _viewModel.selectedDate.value!!, "EIGHTTONINE"
            )
            displayingDatainTheLayoutXML()
        }
        binding.nineToTen.setOnClickListener {
            _viewModel.gettingListOfPlayersToHourAndDateSelected_FromCloudFirestore(
                _viewModel.selectedDate.value!!, "NINETOTEN"
            )
            displayingDatainTheLayoutXML()
        }
    }

    /**
     * This method give us dates, today, and the next 13 days.
     */
    fun getFourteenDaysDatesFromToday(): ArrayList<String> {
        val formattedDateList = ArrayList<String>()
        val calendar = Calendar.getInstance()
        for (i in 0..13) {
            val currentTime = calendar.time
            /*val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())*/
            val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
            formattedDateList.add(dateFormat.format(currentTime))
            calendar.add(Calendar.DAY_OF_YEAR, 1)
        }
        return formattedDateList
    }

    /**
     * This method gets the registered players in the field at that date and time and display them
     * in the layout
     */
    fun displayingDatainTheLayoutXML() {
        if(!_viewModel.listOfPlayers.value.isNullOrEmpty()) {
            Log.i("launched", "DisplayingDataInTheLayoutXML")
            binding.player0.text = "1) ${_viewModel.listOfPlayers.value!![0].name}"
            binding.player1.text = "2) ${_viewModel.listOfPlayers.value!![1].name}"
            binding.player2.text = "3) ${_viewModel.listOfPlayers.value!![2].name}"
            binding.player3.text = "4) ${_viewModel.listOfPlayers.value!![3].name}"
            binding.player4.text = "5) ${_viewModel.listOfPlayers.value!![4].name}"
            binding.player5.text = "6) ${_viewModel.listOfPlayers.value!![5].name}"
            binding.player6.text = "7) ${_viewModel.listOfPlayers.value!![6].name}"
            binding.player7.text = "8) ${_viewModel.listOfPlayers.value!![7].name}"
            binding.player8.text = "9) ${_viewModel.listOfPlayers.value!![8].name}"
            binding.player9.text = "10) ${_viewModel.listOfPlayers.value!![9].name}"
        }
    }
}