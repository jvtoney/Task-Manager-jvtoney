package com.example.taskmanager

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TaskInputField(
    text: String,
    onTextChange: (String) -> Unit,
    onAddTask: () -> Unit
) {
    Row(modifier = Modifier.fillMaxWidth()) {

        // TextField where the user types the task
        TextField(
            value = text,
            onValueChange = onTextChange,
            modifier = Modifier.weight(1f),
            placeholder = { Text("Enter a task") }
        )

        Spacer(modifier = Modifier.width(8.dp))

        // Button to add the task to the list
        Button(
            onClick = onAddTask,
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            )
        ) {
            Text("Add Task")
        }
    }
}