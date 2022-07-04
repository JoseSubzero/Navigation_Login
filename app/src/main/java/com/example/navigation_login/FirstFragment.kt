package com.example.navigation_login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigation_login.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private val args: FirstFragmentArgs by navArgs()
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mail = args.myMail
        binding.tvDatosMail.text = mail

        val tlf = args.myTlf
        binding.tvDatosTlf.text = tlf.toString()

        val name = args.myName
        binding.tvDatosName.text = name


        binding.btnVolver.setOnClickListener {
            view.findNavController().navigate(R.id.action_firstFragment_to_initFragment,null)

        }


    }
}