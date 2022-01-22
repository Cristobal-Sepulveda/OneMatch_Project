 package com.example.android.onematchproject.ui.singleField

import android.app.Activity
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
import com.example.android.onematchproject.utils.PaymentsUtil
import com.example.android.onematchproject.utils.microsToString
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.wallet.*
import org.json.JSONArray
import org.json.JSONObject
import org.koin.android.ext.android.inject
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.roundToLong

 class SingleFieldFragment: BaseFragment() {

    //use Koin to retrieve the ViewModel instance
    override val _viewModel: SingleFieldViewModel by inject()
    private lateinit var binding: FragmentSingleFieldBinding
    private lateinit var paymentsClient: PaymentsClient
    private val shippingCost = (90 * 1000000).toLong()
    private lateinit var selectedGarment: JSONObject

     /**
      * Arbitrarily-picked constant integer you define to track a request for payment data activity.
      *
      * @value #LOAD_PAYMENT_DATA_REQUEST_CODE
      */
     private val LOAD_PAYMENT_DATA_REQUEST_CODE = 991

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

        // Initialize a Google Pay API client for an environment suitable for testing.
        // It's recommended to create the PaymentsClient object inside of the onCreate method.
        paymentsClient = PaymentsUtil.createPaymentsClient(requireActivity())
        possiblyShowGooglePayButton()

        binding.googlePayButton.root.setOnClickListener{
            requestPayment()
        }


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

    /**
     * Determine the viewer's ability to pay with a payment method supported by your app and display a
     * Google Pay payment button.
     *
     * @see [](https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentsClient.html.isReadyToPay
    ) */
    private fun possiblyShowGooglePayButton() {

        val isReadyToPayJson = PaymentsUtil.isReadyToPayRequest() ?: return
        val request = IsReadyToPayRequest.fromJson(isReadyToPayJson.toString()) ?: return

        // The call to isReadyToPay is asynchronous and returns a Task. We need to provide an
        // OnCompleteListener to be triggered when the result of the call is known.
        val task = paymentsClient.isReadyToPay(request)
        task.addOnCompleteListener { completedTask ->
            try {
                completedTask.getResult(ApiException::class.java)?.let(::setGooglePayAvailable)
            } catch (exception: ApiException) {
                // Process error
                Log.w("isReadyToPay failed", exception)
            }
        }
    }

    private fun setGooglePayAvailable(available: Boolean) {
        if (available) {
            binding.googlePayButton.root.visibility = View.VISIBLE
            binding.googlePayButton.root.setOnClickListener { requestPayment() }
        } else {
            // Unable to pay using Google Pay. Update your UI accordingly
        }
    }

    private fun requestPayment() {
        // Disables the button to prevent multiple clicks.
        binding.googlePayButton.root.isClickable = false

        // The price provided to the API should include taxes and shipping.
        // This price is not displayed to the user.
        val garmentPriceMicros = (selectedGarment.getDouble("price") * 1000000).roundToLong()
        val price = (garmentPriceMicros + shippingCost).microsToString()

        val paymentDataRequestJson = PaymentsUtil.getPaymentDataRequest(price)
        if (paymentDataRequestJson == null) {
            Log.e("RequestPayment", "Can't fetch payment data request")
            return
        }
        val request = PaymentDataRequest.fromJson(paymentDataRequestJson.toString())

        // Since loadPaymentData may show the UI asking the user to select a payment method, we use
        // AutoResolveHelper to wait for the user interacting with it. Once completed,
        // onActivityResult will be called with the result.
        if (request != null) {
            AutoResolveHelper.resolveTask(
                paymentsClient.loadPaymentData(request), requireActivity(), LOAD_PAYMENT_DATA_REQUEST_CODE)
        }
    }
}