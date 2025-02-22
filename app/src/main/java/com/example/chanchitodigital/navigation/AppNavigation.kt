package com.example.chanchitodigital.navigation

import android.view.View
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chanchitodigital.AddIncomeScreen
import com.example.chanchitodigital.AddPaymentScreen
import com.example.chanchitodigital.LandingScreen
import com.example.chanchitodigital.LoginScreen
import com.example.chanchitodigital.MainScreen
import com.example.chanchitodigital.SignupScreen
import com.example.chanchitodigital.SplashScreen
import com.example.chanchitodigital.ViewIncomeScreen
import com.example.chanchitodigital.ViewPaymentScreen

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
        composable(AppScreens.LoginScreen.route) {
            LoginScreen()
        }
        composable(AppScreens.SignupScreen.route) {
            SignupScreen()
        }
        composable(AppScreens.MainScreen.route) {
            MainScreen(navController)
        }
        composable(AppScreens.AddIncomeScreen.route) {
            AddIncomeScreen()
        }
        composable(AppScreens.ViewIncomeScreen.route) {
            ViewIncomeScreen()
        }
        composable(AppScreens.AddPaymentScreen.route) {
            AddPaymentScreen()
        }
        composable(AppScreens.ViewPaymentScreen.route) {
            ViewPaymentScreen()
        }
    }
}