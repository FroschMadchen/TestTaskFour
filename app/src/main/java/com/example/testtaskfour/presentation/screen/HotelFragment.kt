package com.example.testtaskfour.presentation.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.testtaskfour.databinding.FragmentHotelBinding

class HotelFragment : Fragment() {
    private var _binding: FragmentHotelBinding? = null
    private val binding get() = _binding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentHotelBinding.inflate(inflater).also { _binding = it }.root

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        binding?.apply {
            val pagerAdapter = ViewPagerAdapter(requireActivity())
            viewPager.adapter = pagerAdapter
            springDotsIndicator.attachTo(viewPager)
        }
    }
}
