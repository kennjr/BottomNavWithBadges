package com.ramanie.bottomnavwithbadges

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavBar( items: List<BottomNavItem>,
                  // we'll need the navController for us to highlight the current fragment and navigate to another if the user wishes to do so
                  navController: NavController,
                  modifier: Modifier = Modifier,
                  itemClickEvent: (BottomNavItem) -> Unit
){

    //we need the current destination as a state so that we can be able to update the currently selected icon whenever the destination changes
    val backStackEntry = navController.currentBackStackEntryAsState()

    BottomNavigation(modifier = modifier, backgroundColor = Color.LightGray, elevation = 5.dp) {
        items.forEach {
            // the var. below will check whether the current route is the selected route through the backStackEntry state that gets updated whenever the backstack changes
            val selected = it.route == backStackEntry.value?.destination?.route
            // this will display a single nav item
            BottomNavigationItem(selected = selected,
                onClick = { itemClickEvent(it) },
                selectedContentColor = Color.DarkGray,
                unselectedContentColor = Color.Gray,
                // the icon param will allow us to specify how an item's icon looks like
                icon = {
                    // since the icon will have the title right below it we're gonna use the column so as to show both
                    Column(horizontalAlignment = CenterHorizontally) {
                        // if we'd like to show the user that there's some new content in the current nav item then we run the code in the if, it'll add the badge icon
                        if (it.badgeCount > 0){
                            BadgedBox(badge = {
                                Badge{ Text(text = it.badgeCount.toString()) }
                            }) {
                                Icon(imageVector = it.icon, contentDescription = it.title)
                            }
                        }else{
                            Icon(imageVector = it.icon, contentDescription = it.title)
                        }

                        // show the title of the the current nav item if it's selected
//                        if( selected ){
                            Text(text = it.title, textAlign = TextAlign.Center, fontSize = 10.sp)
//                        }
                    }
                })
        }
    }

}