package com.ramanie.bottomnavwithbadges

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun ChatsFragment(navController: NavController){
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
            Text(text = "CHATS FRAGMENT")
    }
}