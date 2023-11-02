package com.example.listadoparques.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadoparques.Park
import com.example.listadoparques.databinding.ItemParkBinding

class ParkViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding= ItemParkBinding.bind(view)

    fun render(filModel: Park){
        binding.ParkName.text = filModel.nombre
        binding.ParkDescription.text = filModel.descripcion

        Glide.with(binding.ParkPhoto.context).load(filModel.photo).into(binding.ParkPhoto)

        // evento de hacer click sobre la imagen de la pelicula
        binding.ParkPhoto.setOnClickListener{
            Toast.makeText(binding.ParkPhoto.context, filModel.descripcion, Toast.LENGTH_LONG).show()
        }

        // evento de hacer click sobre toda la pelicula
        itemView.setOnClickListener {
            Toast.makeText(binding.ParkPhoto.context, filModel.nombre, Toast.LENGTH_LONG).show()
        }
    }

}