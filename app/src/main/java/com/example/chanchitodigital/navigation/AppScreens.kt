package com.example.chanchitodigital.navigation

sealed class AppScreens (val route: String) {
    object SplashScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")

    object LandingScreen : AppScreens("landing_screen")
    object LoginScreen: AppScreens("login_screen")

}