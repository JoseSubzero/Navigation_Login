package com.example.navigation_login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navigation_login.databinding.FragmentInitBinding


class InitFragment : Fragment() {
    private var _binding: FragmentInitBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInitBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val mail = binding.etMail.text.toString()
            val tlf = binding.etTlf.text.toString()
            val name = binding.etNombre.text.toString()

        val action = InitFragmentDirections.actionInitFragmentToFirstFragment(mail, tlf, name)
        view.findNavController().navigate(action)


        }

    }


}