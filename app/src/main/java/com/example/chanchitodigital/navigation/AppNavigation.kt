package com.example.chanchitodigital.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chanchitodigital.LandingScreen
import com.example.chanchitodigital.LoginScreen
import com.example.chanchitodigital.MainScreen
import com.example.chanchitodigital.SplashScreen

@Composable
fun AppNavigation () {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route) {
        // Pantallas
        composable(AppScreens.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(AppScreens.LandingScreen.route) {
            LandingScreen()
        }
        composable(AppScreens.MainScreen.route) {
            MainScreen(navController)
        }
    }
}