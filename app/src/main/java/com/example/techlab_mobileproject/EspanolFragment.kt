package com.example.techlab_mobileproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.techlab_mobileproject.databinding.FragmentEspanolBinding
import com.example.techlab_mobileproject.databinding.FragmentSumaBinding


class EspanolFragment : Fragment() {

private lateinit var binding: FragmentEspanolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEspanolBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        binding.imgVocal.setOnClickListener{
            it.findNavController().navigate(R.id.vocalesFragment)
        }

        binding.imgAbc.setOnClickListener{
            it.findNavController().navigate(R.id.abecedarioFragment)
        }

        binding.imgOrac.setOnClickListener{
            it.findNavController().navigate(R.id.oracionInFragment)
        }




    }
    }