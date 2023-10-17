package com.example.bitfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var ExerciseRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addButton = findViewById<Button>(R.id.AddNewFood)

        ExerciseRecyclerView = findViewById(R.id.recyclerView)

        val db = AppDatabase.getInstance(this)

        val allFoods = db.foodDAO().getAll()

        ExerciseRecyclerView.apply{
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ExerciseAdapter(allFoods)

        }

        addButton.setOnClickListener{
            val intent = Intent(this@MainActivity, AddActivity::class.java)
            startActivity(intent)

        }
    }




}