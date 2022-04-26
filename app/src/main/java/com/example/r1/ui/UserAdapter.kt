package com.example.r1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.r1.R
import com.example.r1.models.User
import kotlinx.android.synthetic.main.itemuser.view.*

class UserAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var items: List<User> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return UserViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.fragment_userlayout,parent, false
            )
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is UserViewHolder -> {
                holder.bind(items[position])
            }
        }

    }
//quantos itens o recycle view vai mostrar

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(lists: List<User>){
        this.items = lists
    }


    //View Holder - representação do nosso layout no xml

    class UserViewHolder constructor(
        itemView: View

    ):RecyclerView.ViewHolder(itemView){

        private val username = itemView.name
        private val email = itemView.email
        private val telefone = itemView.telefone
        private val cpf = itemView.cpf



//pega as informações da model e coloca no layout do item do recycle view.

        fun bind(user : User){

            username.text = user.name
            email.text = user.email
            telefone.text = user.telephone
            cpf.text = user.cpf


        }
    }


}