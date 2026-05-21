package com.example.labtemplate.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.labtemplate.ui.routes.HomeRoute
import com.example.labtemplate.ui.routes.TaskRoute
import com.example.labtemplate.ui.view.Greeting
import com.example.labtemplate.ui.view.HomeScreen.HomeScreen


@Composable
fun AppNavHost(
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = HomeRoute
    ) {
        composable<HomeRoute> {
            HomeScreen(
                onGoToTask = {
                    navController.navigate(TaskRoute)
                }
            )
        }
        composable<TaskRoute> {
            Greeting()
        }

    }
}