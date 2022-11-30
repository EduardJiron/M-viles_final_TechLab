package com.example.techlab_mobileproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.techlab_mobileproject.databinding.FragmentActivityContarBinding
import com.example.techlab_mobileproject.databinding.FragmentLoginBinding


class ActivityContarFragment : Fragment() {

    private lateinit var binding: FragmentActivityContarBinding
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
        binding =FragmentActivityContarBinding.inflate(inflater,container, false)
        return  binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        binding.imgStarEsp.setOnClickListener{
            it.findNavController().navigate(R.id.comceptoNumFragment)
        }

    }


}