package com.example.recyclerview.adapter

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.EcPlayer
import com.example.recyclerview.R

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val ecPlayerName = view.findViewById<TextView>(R.id.tvEcPlayerName)
    val ecPlayerPosition = view.findViewById<TextView>(R.id.tvEcPlayerPosition)
    val ecPlayerTeam = view.findViewById<TextView>(R.id.tvEcPlayerTeam)
    val ecPlayerAge = view.findViewById<TextView>(R.id.tvEcPlayerAge)
    val photo = view.findViewById<ImageView>(R.id.ivEcPlayer)

    @SuppressLint("SetTextI18n")
    fun render(ecPlayer: EcPlayer){
        ecPlayerName.text = ecPlayer.playerName
        ecPlayerAge.text = "Age: " + ecPlayer.age.toString()
        ecPlayerTeam.text = "Team: " + ecPlayer.team
        ecPlayerPosition.text = ecPlayer.position
        Glide.with(photo.context).load(ecPlayer.photo).into(photo)
    }
}