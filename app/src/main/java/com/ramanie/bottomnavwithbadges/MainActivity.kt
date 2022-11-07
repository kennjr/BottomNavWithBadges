package com.ramanie.bottomnavwithbadges

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.ramanie.bottomnavwithbadges.ui.theme.BottomNavWithBadgesTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavWithBadgesTheme {
                val navController = rememberNavController()
                // THIS IS A LAYOUT THAT WE USE WHENEVER WE WANNA SHOW SOME PRE-DEFINED MATERIAL VIEWS(eg FAB, BottomNav, etc),
                // IT'LL POSITION THE VIEW ACCORDING TO THE GUIDELINES, LIKE PLACING THE BOTTOMNAV AT THE BOTTOM
                Scaffold( bottomBar = { BottomNavBar(
                    items = bottomNavItems,
                    navController = navController,
                    itemClickEvent = { navController.navigate(it.route) }
                ) } ) {
                    Navigation(navHostController = navController)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BottomNavWithBadgesTheme {
        Greeting("Android")
    }
}