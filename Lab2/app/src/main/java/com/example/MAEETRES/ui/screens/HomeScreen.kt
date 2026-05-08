    package com.example.MAEETRES.ui.screens

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
    fun homeScreen(
        onGoToList: () -> Unit,
        onGoToSensor: () -> Unit
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = onGoToList,
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text("Lista")
            }

            Button(
                onClick = onGoToSensor,
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text("Giroscopio")
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun HomeScreenPreview() {
        homeScreen(
            onGoToList = {},
            onGoToSensor = {}
        )
    }