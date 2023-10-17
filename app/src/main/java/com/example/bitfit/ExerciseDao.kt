package com.example.bitfit

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
@Dao
interface ExerciseDao {
    @Query("SELECT * FROM food_table")
    fun getAll(): List<ExerciseEntity>

    @Insert
    fun insert(food: ExerciseEntity)

    @Query("DELETE FROM food_table")
    fun deleteAll()
}