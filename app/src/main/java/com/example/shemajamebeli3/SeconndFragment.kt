package com.example.shemajamebeli3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.Navigation
import com.example.shemajamebeli3.databinding.FragmentEditInfoBinding
import com.example.shemajamebeli3.databinding.FragmentSeconndBinding


class SeconndFragment : Fragment() {

    private lateinit var binding : FragmentSeconndBinding
    private lateinit var name : String
    private lateinit var gvari : String
    private lateinit var email : String


   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentSeconndBinding.inflate(inflater,container,false)

       add()
       return binding.root
    }


    private fun add(){
        binding.btnadd.setOnClickListener(){
            val name = Model(binding.saxeli.text.toString(),binding.gvari.text.toString(),binding.gvari.text.toString())
            setFragmentResult("item", bundleOf("name" to name))


            Navigation.findNavController(it).navigateUp()

        }
    }
}