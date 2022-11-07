package com.ramanie.bottomnavwithbadges

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val title: String,
    val route: String,
    val icon: ImageVector,
    val badgeCount: Int
)
