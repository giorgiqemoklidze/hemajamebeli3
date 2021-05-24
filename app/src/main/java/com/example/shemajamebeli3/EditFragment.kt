package com.example.shemajamebeli3

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.Navigation
import com.example.shemajamebeli3.databinding.FragmentEditBinding
import com.example.shemajamebeli3.databinding.FragmentEditInfoBinding


class EditFragment : Fragment() {

    private lateinit var binding : FragmentEditBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditBinding.inflate(inflater,container,false)


        edit()


        return binding.root
    }

    private  fun edit(){

        binding.btnEdit.setOnClickListener(){
            val user = Model(binding.saxeli.text.toString(),binding.gvari.text.toString(),binding.gvari.text.toString())
            setFragmentResult("itemslist", bundleOf("list" to user))

            Navigation.findNavController(it).navigateUp()
        }
    }

}