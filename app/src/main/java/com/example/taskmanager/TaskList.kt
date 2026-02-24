package com.example.taskmanager

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable

@Composable
fun TaskList(
    tasks: List<Task>,
    onToggleComplete: (Task) -> Unit,
    onDeleteTask: (Task) -> Unit
){
    LazyColumn {
        items(tasks) {task ->}
        TaskItem(
            task = task,
            onToggleComplete = { onToggleComplete(task) },
            onDeleteTask = { onDeleteTask(task) }
        )
    }
}