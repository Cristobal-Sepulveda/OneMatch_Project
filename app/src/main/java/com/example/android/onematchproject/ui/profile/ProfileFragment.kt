package com.example.android.onematchproject.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.annotation.MenuRes
import androidx.databinding.DataBindingUtil
import com.example.android.onematchproject.R
import com.example.android.onematchproject.base.BaseFragment
import com.example.android.onematchproject.databinding.FragmentProfileBinding
import com.example.android.onematchproject.utils.CommonVariables
import com.example.android.onematchproject.utils.CommonVariables.firebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import org.koin.android.ext.android.inject


class ProfileFragment: BaseFragment() {

    //use Koin to retrieve the ViewModel instance
    override val _viewModel: ProfileViewModel by inject()
    private lateinit var binding: FragmentProfileBinding
    private val cloudDB = FirebaseFirestore.getInstance()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)
        binding.viewModel = _viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mainPositionButton.setOnClickListener { v: View ->
            showMenu(v, R.menu.popup_position_button_menu)
        }

        binding.secondaryPositionButton.setOnClickListener { v: View ->
            showMenu(v, R.menu.popup_position_button_menu)
        }
    }

    private fun showMenu(v: View, @MenuRes menuRes: Int) {
        val popup = PopupMenu(requireContext(), v)
        popup.menuInflater.inflate(menuRes, popup.menu)

        popup.setOnMenuItemClickListener { menuItem: MenuItem ->
            println(firebaseAuth.currentUser.email)
            cloudDB.collection("users")
                .document(firebaseAuth.currentUser.email)
                .set(hashMapOf("provider" to CommonVariables.ProviderType.BASIC.name,
                    "name" to firebaseAuth.currentUser.displayName,
                    "photo" to firebaseAuth.currentUser.photoUrl,
                    "position" to menuItem.title,
                    "uid" to firebaseAuth.currentUser.uid))
            true
        }

        popup.setOnDismissListener {
            // Respond to popup being dismissed.
        }
        // Show the popup menu.
        popup.show()
    }
}