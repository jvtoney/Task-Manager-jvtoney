package com.example.taskmanager

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import task.Task

@Composable
fun MainScreen() {

    //stores user-input text
    var taskText by remember { mutableStateOf("") }

    //stores list of tasks
    val taskList = remember { mutableStateListOf<Task>() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        //input section
        TaskInputField(
            text = taskText,
            onTextChange = { taskText = it },
            onAddTask = {
                if (taskText.isNotBlank()) {
                    taskList.add(Task(taskText))
                    taskText = ""
                }
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        //list of tasks
        TaskList(
            tasks = taskList,
            onToggleComplete = { task ->
                task.isCompleted = !task.isCompleted
            },
            onDeleteTask = { task ->
                taskList.remove(task)
            }
        )
    }
}