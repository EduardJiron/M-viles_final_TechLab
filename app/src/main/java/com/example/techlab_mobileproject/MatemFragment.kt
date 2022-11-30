package com.example.techlab_mobileproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.techlab_mobileproject.databinding.FragmentMatemBinding
import com.example.techlab_mobileproject.databinding.FragmentMenuBinding


/**
 * A simple [Fragment] subclass.
 * Use the [MatemFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MatemFragment : Fragment() {

private lateinit var binding: FragmentMatemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMatemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        binding.imgNum.setOnClickListener{
            it.findNavController().navigate(R.id.activityContarFragment)
        }

       binding.imgSuma.setOnClickListener{
            it.findNavController().navigate(R.id.sumaFragment)
        }

        binding.imgResta.setOnClickListener{
            it.findNavController().navigate(R.id.restaFragment)
        }



    }
}