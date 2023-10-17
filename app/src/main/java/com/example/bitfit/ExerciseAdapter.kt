package com.example.bitfit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExerciseAdapter(val allFoods: List<ExerciseEntity>) :
    RecyclerView.Adapter<ExerciseAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val nameTextView: TextView
        val calorieTextView: TextView
        val repTextView: TextView


        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            nameTextView = itemView.findViewById(R.id.ExerciseTV)
            calorieTextView = itemView.findViewById(R.id.setsVW)
            repTextView = itemView.findViewById(R.id.repsVW)

        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return ViewHolder(view)


    }

    override fun getItemCount() = allFoods.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = allFoods[position].food_name
        holder.calorieTextView.text = allFoods[position].calorie_amount
        //holder.repTextView.text = allFoods[position].repnum
    }

}
