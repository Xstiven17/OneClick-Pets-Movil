package com.aaa.inicio11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.aaa.inicio11.databinding.FragmentConfigCuentaBinding


class ConfigCuentaFragment : Fragment() {

    private var _binding: FragmentConfigCuentaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConfigCuentaBinding.inflate(inflater, container, false)
        val view = binding.root

        // Set click listeners and add logic
        binding.rectan2.setOnClickListener {
            // Handle click for rectan1
            Toast.makeText(requireContext(), "Rectan1 clicked", Toast.LENGTH_SHORT).show()
        }

        binding.ivProfilePicture.setOnClickListener {
            // Handle click for profile picture
            Toast.makeText(requireContext(), "Profile picture clicked", Toast.LENGTH_SHORT).show()
        }

        binding.ivAccountData.setOnClickListener {
            // Handle click for account data
            Toast.makeText(requireContext(), "Account data clicked", Toast.LENGTH_SHORT).show()
        }

        binding.ivCards.setOnClickListener {
            // Handle click for cards
            Toast.makeText(requireContext(), "Cards clicked", Toast.LENGTH_SHORT).show()
        }

        binding.ivSecurity.setOnClickListener {
            // Handle click for security
            Toast.makeText(requireContext(), "Security clicked", Toast.LENGTH_SHORT).show()
        }

        binding.ivDeleteAccount.setOnClickListener {
            // Handle click for delete account
            Toast.makeText(requireContext(), "Delete account clicked", Toast.LENGTH_SHORT).show()
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}



