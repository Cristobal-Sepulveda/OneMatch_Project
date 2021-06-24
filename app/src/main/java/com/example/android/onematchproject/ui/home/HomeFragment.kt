package com.example.android.onematchproject.ui.home

import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.work.ListenableWorker
import com.example.android.onematchproject.R
import com.example.android.onematchproject.databinding.FragmentHomeBinding
import com.example.android.onematchproject.utils.CommonVariablesToUseinDifferentClasses.firebaseAuth
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class HomeFragment : Fragment() {

    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding
    val cloudDB = FirebaseFirestore.getInstance()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        val user = firebaseAuth.currentUser!!.email!!

        binding.button.setOnClickListener {
            val days = getFourteenDaysDatesFromToday()
            if (user == "sepulveda.cristobal.ignacio@gmail.com") {
                GlobalScope.launch(Dispatchers.IO) {
                    var i = 0
                    //here is 2 because we only have 2 fields in db
                    while (i < 2) {
                        val request = cloudDB.collection("FIELD_S")
                            .document("$i")
                            .collection("CALENDARIO")
                            .get()
                        request.addOnSuccessListener {
                            var count = 0
                            while (count<13 && i <2) {
                                updateCalendarLastDay_fromAField(i, count, days[count], it.documents[count + 1])
                                count++
                            }
                            if(i<2){
                                updateCalendarLastDay_fromAField(i,count,days[count],it.documents[count])
                                i++
                            } else{
                                return@addOnSuccessListener
                            }
                        }
                        request.addOnFailureListener {
                            return@addOnFailureListener
                        }
                    }
                }
                Log.i("Launched", "restarting fragment")
                val ft: FragmentTransaction = requireFragmentManager().beginTransaction()
                if (Build.VERSION.SDK_INT >= 26) {
                    ft.setReorderingAllowed(false)
                }
                ft.detach(this).attach(this).commit()
            }
        }

        return binding.root
    }

    fun updateCalendarLastDay_fromAField(i: Int, count: Int, day: String, hashMap: DocumentSnapshot) {
        val rightNow = Calendar.getInstance()
        val hour = rightNow[Calendar.HOUR_OF_DAY]
        val minute = rightNow[Calendar.MINUTE]
        val seconds = rightNow[Calendar.SECOND]
        val list = hashMapOf(
            "0" to "",
            "1" to "",
            "2" to "",
            "3" to "",
            "4" to "",
            "5" to "",
            "6" to "",
            "7" to "",
            "8" to "",
            "9" to ""
        )
        Log.i("Launched", "$i $count")
        val updateRequest = cloudDB.collection("FIELD_S")
            .document("$i")
            .collection("CALENDARIO")

        if (count != 13) {
            updateRequest.document("$count").update("0", hashMap.get("0"))
            updateRequest.document("$count").update("1", hashMap.get("1"))
            updateRequest.document("$count").update("2", hashMap.get("2"))
            updateRequest.document("$count").update("3", hashMap.get("3"))
            updateRequest.document("$count").update("4", hashMap.get("4"))
            updateRequest.document("$count")
                .update("current_hour", "${hour}:${minute}:${seconds}")
            updateRequest.document("$count").update("id", day)
        }
        else{
            updateRequest.document("$count").update("0", list)
            updateRequest.document("$count").update("1", list)
            updateRequest.document("$count").update("2", list)
            updateRequest.document("$count").update("3", list)
            updateRequest.document("$count").update("4", list)
            updateRequest.document("$count").update("id", day)
            updateRequest.document("$count").update("current_hour",
                "${hour}:${minute}:${seconds}")
        }
    }

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
}