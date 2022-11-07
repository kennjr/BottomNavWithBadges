package com.ramanie.bottomnavwithbadges

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation (navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = Destinations.HOME_FRAGMENT.destination) {
        composable(Destinations.HOME_FRAGMENT.destination, content = {
            HomeFragment(navController = navHostController)
        })
        composable(Destinations.CHATS_FRAGMENT.destination, content = {
            ChatsFragment(navController = navHostController)
        })
        composable(Destinations.SETTINGS_FRAGMENT.destination, content = {
            SettingsFragment(navController = navHostController)
        })
    }
}