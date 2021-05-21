package com.example.shemajamebeli3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shemajamebeli3.databinding.ActivityUsersBinding
import java.net.InterfaceAddress

class UsersActivity : AppCompatActivity() {

    private lateinit var binding : ActivityUsersBinding

    var items = mutableListOf<Model>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }


    private fun init(){
        addOnCLickListener()
        setdata()
        var adapter = RecyclerViewAdapter(items, object : usersOnClick {
            override fun onClickListener() {

            }


        })
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }


    fun addOnCLickListener (){
        val button:ImageButton = findViewById(R.id.imgBtnAdd)
        button.setOnClickListener{

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

    }
}