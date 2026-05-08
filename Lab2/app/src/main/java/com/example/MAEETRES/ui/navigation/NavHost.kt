package com.example.MAEETRES.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.MAEETRES.ui.routes.HomeRoute
import com.example.MAEETRES.ui.routes.ListRoute
import com.example.MAEETRES.ui.routes.SensorRoute
import com.example.MAEETRES.ui.screens.GyroscopeSensor
import com.example.MAEETRES.ui.screens.Lab2
import com.example.MAEETRES.ui.screens.homeScreen
import com.example.MAEETRES.ui.screens.useSensor

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HomeRoute
    ) {
        composable<HomeRoute> {
            homeScreen(
                onGoToList = {
                    navController.navigate(ListRoute)
                },
                onGoToSensor = {
                    navController.navigate(SensorRoute)
                }
            )
        }

        composable<ListRoute> {
            Lab2()
        }

        composable<SensorRoute> {
            GyroscopeSensor()
        }
    }
}