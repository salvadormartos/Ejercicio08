package com.smb.ejercicio08.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController

import com.smb.ejercicio08.screens.SplashScreen
import com.smb.ejercicio08.screens.login.LoginScreen
import com.smb.ejercicio08.screens.home.Home

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.name
    )
    {
        composable(Screens.SplashScreen.name){
            SplashScreen(navController = navController)
        }
        composable(Screens.LoginScreen.name){
            LoginScreen(navController = navController)
        }
        composable(Screens.HomeScreen.name){
            Home(navController = navController)
        }
    }
}



