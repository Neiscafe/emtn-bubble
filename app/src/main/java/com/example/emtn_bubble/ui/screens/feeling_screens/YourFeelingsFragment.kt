package com.example.emtn_bubble.ui.screens.feeling_screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.emtn_bubble.R
import com.example.emtn_bubble.databinding.FragmentYourFeelingsBinding

class YourFeelingsFragment : Fragment() {

    private var _binding: FragmentYourFeelingsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentYourFeelingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.action_add_to_screen -> {
                    Toast.makeText(requireContext(), "Adicionando à tela!", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_YourFeelings_to_PartnerFeelings)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}