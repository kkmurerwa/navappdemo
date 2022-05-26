package com.murerwa.navapp3.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.murerwa.navapp3.R
import com.murerwa.navapp3.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentFirstBinding.bind(view)

        initViews()
    }

    private fun initViews() {
        // Navigation via id
        binding.textViewWithId.setOnClickListener {
//            findNavController().navigate(R.id.secondFragment)
            findNavController().navigate(
                FirstFragmentDirections.toSecondFragment(
                    "ID"
                )
            )
        }

        // Navigation with safe args
        binding.textViewWithSafeArgs.setOnClickListener {
            findNavController().navigate(
                FirstFragmentDirections.toSecondFragment(
                    "Safe Args"
                )
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        // Destroy binding instance to prevent memory leaks
        _binding = null
    }
}