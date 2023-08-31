package com.example.emtn_bubble.ui.screens.feeling_screens

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.emtn_bubble.R
import com.example.emtn_bubble.databinding.PopupWindowAddEmotionBinding

class AddFeelingDialog : DialogFragment() {
    private var _binding: PopupWindowAddEmotionBinding? = null
    private val binding get() = _binding!!
//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        return activity?.let {
//            val builder = AlertDialog.Builder(it)
//            builder.setMessage("AAAAAA").setPositiveButton("TEXTO") { dialog, id ->
//                Toast.makeText(requireActivity(), "POSITIVO", Toast.LENGTH_SHORT).show()
//                dialog.dismiss()
//            }.setNegativeButton("TEXTO CANCELAR") { dialog, id ->
//                Toast.makeText(requireActivity(), "NEGATIVO", Toast.LENGTH_SHORT).show()
//                dialog.dismiss()
//            }
//            builder.create()
//        } ?: throw IllegalStateException("Activity cannot be null")
//    }
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let{
            _binding = PopupWindowAddEmotionBinding.inflate(layoutInflater)
            binding.btAddEmotion.setOnClickListener {
                Toast.makeText(requireContext(), "Emotion added!", Toast.LENGTH_SHORT).show()
                dialog?.dismiss()
            }
            val builder = AlertDialog.Builder(it)
            builder.setView(binding.root)
            builder.create()
        }?: throw IllegalStateException("Activity cannot be null")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}