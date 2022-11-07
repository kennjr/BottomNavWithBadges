package com.ramanie.bottomnavwithbadges

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings

enum class Destinations(val destination: String){
    HOME_FRAGMENT("home_frag"),
    CHATS_FRAGMENT("chats_frag"),
    SETTINGS_FRAGMENT("settings_frag")
}

val bottomNavItems = listOf(
    BottomNavItem("Home", Destinations.HOME_FRAGMENT.destination, icon = Icons.Default.Home, badgeCount = 0),
    BottomNavItem("Chats", Destinations.CHATS_FRAGMENT.destination, icon = Icons.Default.Email, badgeCount = 10),
    BottomNavItem("Settings", Destinations.SETTINGS_FRAGMENT.destination, icon = Icons.Default.Settings, badgeCount = 2)
)