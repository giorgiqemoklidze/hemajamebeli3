package com.example.shemajamebeli3

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(items:MutableList<Model>,private val usersOnClick: usersOnClick):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    val items = items



    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView),View.OnClickListener{

        val itemName : TextView = itemView.findViewById(R.id.saxeli)
        val itemLastName : TextView = itemView.findViewById(R.id.gvari)
        val itemEmail : TextView = itemView.findViewById(R.id.email)
        val deleteBtn : ImageButton = itemView.findViewById(R.id.imgBtnDelete)
        val editBtn : ImageButton = itemView.findViewById(R.id.imgBtnEdit)


        fun bind(){
            val itemsName = items[adapterPosition].name
            val itemsLastName = items[adapterPosition].gvari
            val itemsEmail =items[adapterPosition].email
           itemName.setText(itemsName)
            itemLastName.setText(itemsLastName)
            itemEmail.setText(itemsEmail)




        }

        override fun onClick(v: View?) {
            usersOnClick.onClickListener(adapterPosition)
        }


    }



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       ViewHolder.bind()
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val layout : View = LayoutInflater.from(viewGroup.context).inflate(R.layout.items_layout,viewGroup,false)
        return ViewHolder(layout)
    }


    override fun getItemCount() = items.size


}