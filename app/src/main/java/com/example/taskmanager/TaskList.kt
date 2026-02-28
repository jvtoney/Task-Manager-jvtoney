package com.example.taskmanager

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.taskmanager.task.Task

@Composable
fun TaskList(
    tasks: List<Task>,
    onToggleComplete: (Task) -> Unit,
    onDeleteTask: (Task) -> Unit
){
    LazyColumn {
        items(tasks) { task ->
            TaskItem(
                task = task,
                onToggleComplete = { onToggleComplete(task) },
                onDeleteTask = { onDeleteTask(task) }
            )
        }
    }
}