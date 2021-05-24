package com.example.shemajamebeli3


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shemajamebeli3.databinding.ItemsLayoutBinding



class RecyclerViewAdapter(private val users:MutableList<Model>,private val usersOnclick: usersOnClick):RecyclerView.Adapter<RecyclerViewAdapter.ItemsViewHolder>() {






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder  {
        val exampleView = ItemsLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val  holder = ItemsViewHolder(exampleView)
        return holder

    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.bind()

    }
    override fun getItemCount(): Int = users.size


    inner class ItemsViewHolder(private val binding : ItemsLayoutBinding):RecyclerView.ViewHolder(binding.root),View.OnClickListener{
        private lateinit var item : Model

        fun bind(){
            item = users[adapterPosition]
            binding.saxeli.text = item.name
            binding.gvari.text = item.gvari
            binding.email.text = item.email
            binding.imgBtnDelete.setOnClickListener(this)
            binding.imgBtnEdit.setOnClickListener(){
                users.removeAt(adapterPosition)
                notifyItemRemoved(adapterPosition)
            }


        }

        override fun onClick(v: View?) {

            usersOnclick.onClickListener(adapterPosition)

        }




    }




}