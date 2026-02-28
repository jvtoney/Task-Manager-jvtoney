package com.example.taskmanager.task

data class Task(
    val description: String,
    var isCompleted: Boolean = false
)
