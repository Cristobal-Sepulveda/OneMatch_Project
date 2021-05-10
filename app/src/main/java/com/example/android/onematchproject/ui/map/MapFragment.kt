package com.example.android.onematchproject.ui.map

import android.Manifest
import android.annotation.TargetApi
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Resources
import android.location.Location
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import com.example.android.onematchproject.base.BaseFragment
import com.example.android.onematchproject.R
import com.example.android.onematchproject.databinding.FragmentMapBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.snackbar.Snackbar
import java.util.*



class MapFragment : BaseFragment(), OnMapReadyCallback {

    //Use Koin to get the view model of the SaveReminder

    private lateinit var binding: FragmentMapBinding
    private val defaultLocation = LatLng(-33.8523341, 151.2106085)
    private lateinit var map: GoogleMap
    private val DEFAULT_ZOOM = 15
    private val runningQOrLater = Build.VERSION.SDK_INT >=
            Build.VERSION_CODES.Q
    private var locationPermissionGranted = false
    private val REQUEST_FOREGROUND_AND_BACKGROUND_PERMISSION_RESULT_CODE = 33
    private val REQUEST_FOREGROUND_ONLY_PERMISSIONS_REQUEST_CODE = 34
    private val LOCATION_PERMISSION_INDEX = 0
    private val BACKGROUND_LOCATION_PERMISSION_INDEX = 1

    // The entry point to the Fused Location Provider.
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private var lastKnownLocation: Location? = null


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_map,
            container, false)

//        TODO: add the map setup implementation
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        // Construct a FusedLocationProviderClient.
        fusedLocationProviderClient = LocationServices
            .getFusedLocationProviderClient(requireActivity())

        binding.savePOILatLgnButton.setOnClickListener {
            onLocationSelected()
        }

        return binding.root
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        getDeviceLocation()
        checkPermissionsAndGetDeviceLocation()
        setMapStyle(map)
        setPOIOrAnyPlaceOnClick(map)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (foregroundAndBackgroundLocationPermissionApproved()) {
            val ft: FragmentTransaction = requireFragmentManager().beginTransaction()
            if (Build.VERSION.SDK_INT >= 26) {
                ft.setReorderingAllowed(false)
            }
            ft.detach(this).attach(this).commit()
        }
    }

    private fun checkPermissionsAndGetDeviceLocation() {
        if (foregroundAndBackgroundLocationPermissionApproved()) {
            locationPermissionGranted = true
            getDeviceLocation()
        } else {
            requestForegroundAndBackgroundLocationPermissions()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<String>,
                                            grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (
            grantResults.isEmpty() ||
            grantResults[LOCATION_PERMISSION_INDEX] == PackageManager.PERMISSION_DENIED ||
            (requestCode == REQUEST_FOREGROUND_AND_BACKGROUND_PERMISSION_RESULT_CODE &&
                    grantResults[BACKGROUND_LOCATION_PERMISSION_INDEX] ==
                    PackageManager.PERMISSION_DENIED)) {
            Snackbar.make(
                binding.root,
                R.string.permission_denied_explanation,
                Snackbar.LENGTH_LONG
            ).setAction(R.string.settings) {
                    startActivityForResult(Intent().apply {
                        action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                        data = Uri.fromParts("package",
                            "com.example.android.onematchproject",
                            null)
                        flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    },1001)
                }.show()
        }else{
            val ft: FragmentTransaction = requireFragmentManager().beginTransaction()
            if (Build.VERSION.SDK_INT >= 26) {
                ft.setReorderingAllowed(false)
            }
            ft.detach(this).attach(this).commit()
        }
    }

    private fun getDeviceLocation() {
        try {
            if (locationPermissionGranted) {
                Log.i("cristobal", "$locationPermissionGranted")
                val locationResult = fusedLocationProviderClient.lastLocation
                locationResult.addOnCompleteListener(requireActivity()) { task ->
                    if (task.isSuccessful) {
                        // Set the map's camera position to the current location of the device.
                        lastKnownLocation = task.result
                        println(task.result?.longitude.toString())
                        if (lastKnownLocation != null) {
                            //TODO: zoom to the user location after taking his permission
                            map.moveCamera(
                                CameraUpdateFactory.newLatLngZoom(
                                    LatLng(
                                        lastKnownLocation!!.latitude,
                                        lastKnownLocation!!.longitude
                                    ), DEFAULT_ZOOM.toFloat()))
                            map.addMarker(MarkerOptions().
                            position(LatLng(lastKnownLocation!!.latitude,
                                lastKnownLocation!!.longitude)).
                            title("Marker in your actual location")

                            )
                        }else{
                            Log.i("cristobal", "qweqweqwe")
                            //        TODO: zoom to the user location after taking his permission
                            map.moveCamera(
                                CameraUpdateFactory.newLatLngZoom(
                                    LatLng(defaultLocation.latitude,
                                        defaultLocation.longitude
                                    ), DEFAULT_ZOOM.toFloat()))
                            map.addMarker(MarkerOptions().
                            position(defaultLocation).
                            title("Marker in default location"))
                            map.uiSettings?.isMyLocationButtonEnabled = false
                        }
                    } else {
                        Log.i("cristobal", "qweqweqwe")
                        //        TODO: zoom to the user location after taking his permission
                        map.moveCamera(
                            CameraUpdateFactory.newLatLngZoom(
                                LatLng(defaultLocation.latitude,
                                    defaultLocation.longitude
                                ), DEFAULT_ZOOM.toFloat()))
                        map.addMarker(MarkerOptions().
                        position(defaultLocation).
                        title("Marker in default location"))
                        map.uiSettings?.isMyLocationButtonEnabled = false
                    }
                }
            }else{
                map.moveCamera(
                    CameraUpdateFactory.newLatLngZoom(
                        LatLng(defaultLocation.latitude,
                            defaultLocation.longitude
                        ), DEFAULT_ZOOM.toFloat()))
                map.addMarker(MarkerOptions().
                position(defaultLocation).
                title("Marker in default location"))
                map.uiSettings?.isMyLocationButtonEnabled = false
            }
        } catch (e: SecurityException) {
            Log.e("Exception: %s", e.message, e)
        }
    }

    @TargetApi(29)
    private fun requestForegroundAndBackgroundLocationPermissions() {
        if (foregroundAndBackgroundLocationPermissionApproved())
            return
        var permissionsArray = arrayOf(Manifest.permission.ACCESS_FINE_LOCATION)
        val resultCode = when {
            runningQOrLater -> {
                permissionsArray += Manifest.permission.ACCESS_BACKGROUND_LOCATION
                REQUEST_FOREGROUND_AND_BACKGROUND_PERMISSION_RESULT_CODE
            }
            else -> REQUEST_FOREGROUND_ONLY_PERMISSIONS_REQUEST_CODE
        }
        requestPermissions(
            permissionsArray,
            resultCode
        )
    }

    @TargetApi(29)
    fun foregroundAndBackgroundLocationPermissionApproved(): Boolean {
        val foregroundLocationApproved = (
                PackageManager.PERMISSION_GRANTED ==
                        ActivityCompat.checkSelfPermission(requireActivity(),
                            Manifest.permission.ACCESS_FINE_LOCATION))
        val backgroundPermissionApproved =
            if (runningQOrLater) {
                PackageManager.PERMISSION_GRANTED ==
                        ActivityCompat.checkSelfPermission(
                            requireActivity(), Manifest.permission.ACCESS_BACKGROUND_LOCATION
                        )
            } else {
                true
            }
        return foregroundLocationApproved && backgroundPermissionApproved
    }

    private fun setPOIOrAnyPlaceOnClick(map: GoogleMap) {
        map.setOnPoiClickListener { poi ->
            val snippet = String.format(
                    Locale.getDefault(),
                    "Lat: %1$.5f, Long: %2$.5f",
                    poi.latLng.latitude,
                    poi.latLng.longitude
            )
            if (_viewModel.selectedPOICount.value == null) {
                map.clear()
                val markerOnPOI = map.addMarker(
                        MarkerOptions()
                                .position(poi.latLng)
                                .title(poi.name)
                                .snippet(snippet)
                )
                markerOnPOI.showInfoWindow()
                _viewModel.selectedPOICount.value = 1
                _viewModel.latitude.value = poi.latLng.latitude
                _viewModel.longitude.value = poi.latLng.longitude
                _viewModel.reminderSelectedLocationStr.value = poi.name
            }
            else{
                map.clear()
                val markerOnPOI = map.addMarker(
                        MarkerOptions()
                                .position(poi.latLng)
                                .title(poi.name)
                                .snippet(snippet)
                )
                markerOnPOI.showInfoWindow()
                _viewModel.latitude.value = poi.latLng.latitude
                _viewModel.longitude.value = poi.latLng.longitude
                _viewModel.reminderSelectedLocationStr.value = poi.name
            }
        }

        map.setOnMapClickListener {
            val snippet = String.format(
                Locale.getDefault(),
                "Lat: %1$.5f, Long: %2$.5f",
                it.latitude,
                it.longitude
            )
            if (_viewModel.selectedPOICount.value == null) {
                map.clear()
                val mapMarker = map.addMarker(
                        MarkerOptions()
                                .position(it)
                                .title("${it.latitude} - ${it.longitude}")
                                .snippet(snippet)
                )
                mapMarker.showInfoWindow()
                _viewModel.selectedPOICount.value = 1
                _viewModel.latitude.value = it.latitude
                _viewModel.longitude.value = it.longitude
                _viewModel.reminderSelectedLocationStr.value = "${it.latitude} -- ${it.longitude}"
            }
            else{
                map.clear()
                val markerOnPlace = map.addMarker(
                        MarkerOptions()
                                .position(it)
                                .title("${it.latitude} - ${it.longitude}")
                                .snippet(snippet)
                )
                markerOnPlace.showInfoWindow()
                _viewModel.latitude.value = it.latitude
                _viewModel.longitude.value = it.longitude
                _viewModel.reminderSelectedLocationStr.value = "${it.latitude} -- ${it.longitude}"
            }
        }

    }

    private fun onLocationSelected() {
        when (_viewModel.selectedPOICount.value) {
            null -> {
                Toast.makeText(requireActivity().applicationContext,
                        "You need to select any place before to save something",
                        Toast.LENGTH_LONG).show()
            }
            //        TODO: When the user confirms on the selected location,
            //         send back the selected location details to the view model
            //         and navigate back to the previous fragment to save the reminder and add the geofence
            else -> {
                //Navigate to another fragment to get the user location
                _viewModel.navigationCommand.value =
                        NavigationCommand.To(
                                SelectLocationFragmentDirections.
                                actionSelectLocationFragmentToSaveReminderFragment()
                        )
            }
        }
    }

    private fun setMapStyle(map: GoogleMap) {
        try {
            // Customize the styling of the base map using a JSON object defined
            // in a raw resource file.
            val success = map.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            context,
                            R.raw.map_style
                    )
            )

            if (!success) {
                Log.e("SelectLocationFragment", "Style parsing failed.")
            }
        } catch (e: Resources.NotFoundException) {
            Log.e("SelectLocationFragment", "Can't find style. Error: ", e)
        }
    }
}

