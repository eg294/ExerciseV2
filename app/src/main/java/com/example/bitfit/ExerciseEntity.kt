package com.example.bitfit

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "food_table")
data class ExerciseEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "food_name") val food_name: String?,
    @ColumnInfo(name = "calorie_amount") val calorie_amount: String?,
    //@ColumnInfo(name = "rep_num") val repnum: String?,
)