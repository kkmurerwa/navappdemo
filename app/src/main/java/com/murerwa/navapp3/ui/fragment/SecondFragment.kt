package com.murerwa.navapp3.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.murerwa.navapp3.R
import com.murerwa.navapp3.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    // Get data passed with safe args
    private val args: SecondFragmentArgs by navArgs()
    private val altArgs by navArgs<SecondFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentSecondBinding.bind(view)

        initViews()
    }

    private fun initViews() {
        val navigationSource: String = args.navSource

        binding.textViewShowSource.text = "Navigation source is $navigationSource"

        binding.textViewShowSource.text = getString(
            R.string.navigation_source_template,
            navigationSource
        )
    }

    override fun onDestroy() {
        super.onDestroy()

        _binding = null
    }
}