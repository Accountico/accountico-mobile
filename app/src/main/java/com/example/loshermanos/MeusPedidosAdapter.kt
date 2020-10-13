package com.example.loshermanos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MeusPedidosAdapter (
        val pedidos: List<MeusPedidos>,
        val onClick: (MeusPedidos) -> Unit
): RecyclerView.Adapter<MeusPedidosAdapter.PedidosViewHolder>() {

    class PedidosViewHolder(view: View): RecyclerView.ViewHolder(view){
        val cardNome: TextView
        val cardImg: ImageView
        val cardProgress: ProgressBar

        init{

            cardNome = view.findViewById(R.id.cardNome)
            cardImg = view.findViewById(R.id.cardImage)
            cardProgress = view.findViewById(R.id.cardProgress)
        }
    }

    override fun getItemCount() = this.pedidos.size
    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int): PedidosViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_pedido, parent, false)

        val holder =  PedidosViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: PedidosViewHolder, position: Int) {
        val pedido = this.pedidos[position]

        holder.cardNome.text = pedido.nome
        holder.cardProgress.visibility = View.VISIBLE
        Picasso.with(holder.itemView.context).load(pedido.foto).fit().into(holder.cardImg,
        object: com.squareup.picasso.Callback{
            override fun onSuccess() {
                holder.cardProgress.visibility = View.GONE
            }

            override fun onError() {
                holder.cardProgress.visibility = View.GONE
            }

        })
        holder.itemView.setOnClickListener{onClick(pedido)}

    }
    }
