package com.example.labo9.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lab9.data.model.Meals
import com.example.lab9.viewmodel.MealViewModel


@Composable
fun MealScreen(
    viewModel: MealViewModel = viewModel()
) {
    LaunchedEffect(Unit) {
        viewModel.loadMeals()
    }

    when {
        viewModel.isLoading -> {
            CircularProgressIndicator()
        }

        viewModel.errorMessage != null -> {
            Text(
                text = viewModel.errorMessage ?: "Error desconocido",
                color = MaterialTheme.colorScheme.error,
                modifier = Modifier.padding(16.dp)
            )
        }

        else -> {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                items(viewModel.meals) { meal ->
                    MealCard(meal = meal)
                }
            }
        }
    }
}

@Composable
fun MealCard(meal: Meals) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column {
            AsyncImage(
                model = meal.strMealThumb,
                contentDescription = meal.strMeal,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = meal.strMeal,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = "Categoría: ${meal.strCategory}",
                    style = MaterialTheme.typography.bodyMedium
                )

                Text(
                    text = "País de origen: ${meal.strArea}",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
fun AsyncImage(
    model: String,
    contentDescription: String,
    modifier: Modifier,
    contentScale: ContentScale
) {
    TODO("Not yet implemented")
}