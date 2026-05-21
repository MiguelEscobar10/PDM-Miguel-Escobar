package com.example.labtemplate.ui.view.HomeScreen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onGoToTask: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = onGoToTask,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Ir a tareas")
        }
    }}

    @Preview(showBackground = true)
    @Composable
    fun HomeScreenPreview() {
        HomeScreen(
            onGoToTask = {},
        )
    }
