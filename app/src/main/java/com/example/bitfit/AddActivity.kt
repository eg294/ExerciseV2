package com.example.bitfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddActivity :  AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        val recordButton = findViewById<Button>(R.id.recordButton)
        val foodNameInput = findViewById<TextView>(R.id.foodNameInput)
        val calorieCountInput = findViewById<TextView>(R.id.calorieCountInput)
        //val repetitionsInput = findViewById<TextView>(R.id.repsInput)

        val db = AppDatabase.getInstance(this)



        recordButton.setOnClickListener{
            val foodName = foodNameInput.text.toString()
            val calAmount = calorieCountInput.text.toString()
            //val repsnum = repetitionsInput.text.toString()
            val newItem = ExerciseEntity(food_name = foodName, calorie_amount = calAmount)
            //val newItem = ExerciseEntity(food_name = foodName, calorie_amount = calAmount, repnum = repsnum )
            db.foodDAO().insert(newItem)
            val intent = Intent(this@AddActivity, MainActivity::class.java)
            startActivity(intent)

        }

    }

}