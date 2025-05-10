package com.example.universitycourses

data class Course(
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String,
    val year: Int,
    val semester: Int
)