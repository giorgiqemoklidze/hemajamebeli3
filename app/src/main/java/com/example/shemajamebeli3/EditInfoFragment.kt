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
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shemajamebeli3.databinding.FragmentEditInfoBinding


class EditInfoFragment : Fragment() {
    private lateinit var binding : FragmentEditInfoBinding

    private lateinit var adapter: RecyclerViewAdapter


    var items = mutableListOf<Model>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setFragmentResultListener("item",){  requestKey, bundle ->
            val name: Model = bundle.getParcelable<Parcelable>("name") as Model
            items.add(name)
        }




        setdata()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentEditInfoBinding.inflate(inflater,container,false)
        addbtn()
        init()


        return binding.root




    }
    private fun init(){
        adapter=RecyclerViewAdapter(items,object : usersOnClick{
            override fun onClickListener(position: Int) {
                setFragmentResultListener("itemslist",){  requestKey, bundle ->
                    val user: Model = bundle.getParcelable<Parcelable>("list") as Model
                    items.removeAt(position)
                    items.add(position,user)

                }
                view?.let { Navigation.findNavController(it).navigate(R.id.editFragment) }
            }

        })

        binding.recyclerView.layoutManager = LinearLayoutManager(context)

        binding.recyclerView.adapter=adapter


    }


    fun addbtn(){
        binding.imgBtnAdd.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_editInfoFragment2_to_seconndFragment,)
        }
    }




    private fun setdata(){

        items.add(Model("saxeli","gvari","emaili"))
        items.add(Model("saxeli","gvari","emaili"))
        items.add(Model("saxeli","gvari","emaili"))
        items.add(Model("saxeli","gvari","emaili"))
        items.add(Model("saxeli","gvari","emaili"))
        items.add(Model("saxeli","gvari","emaili"))
        items.add(Model("saxeli","gvari","emaili"))
        items.add(Model("saxeli","gvari","emaili"))
        items.add(Model("saxeli","gvari","emaili"))
        items.add(Model("saxeli","gvari","emaili"))



    }


}

