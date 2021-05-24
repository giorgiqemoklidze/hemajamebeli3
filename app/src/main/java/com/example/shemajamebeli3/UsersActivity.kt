package com.example.shemajamebeli3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shemajamebeli3.databinding.ActivityUsersBinding
import java.net.InterfaceAddress

class UsersActivity : AppCompatActivity()  {

    private lateinit var binding : ActivityUsersBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsersBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }




}