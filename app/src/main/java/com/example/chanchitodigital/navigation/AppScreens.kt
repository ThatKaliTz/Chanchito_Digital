package com.example.chanchitodigital.navigation

sealed class AppScreens (val route: String) {
    object SplashScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")
    object LandingScreen : AppScreens("landing_screen")
    object LoginScreen: AppScreens("login_screen")
    object SignupScreen: AppScreens("signup_screen")
    object AddIncomeScreen: AppScreens("addincome_screen")
    object ViewIncomeScreen: AppScreens("viewincome_screen")
    object AddPaymentScreen: AppScreens("addpayment_screen")
    object ViewPaymentScreen: AppScreens("viewpayment_screen")

}