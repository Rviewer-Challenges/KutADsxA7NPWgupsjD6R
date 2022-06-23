package com.silvacomp.twitter_mirroring

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.silvacomp.twitter_mirroring.ui.components.BottomNavItem
import com.silvacomp.twitter_mirroring.ui.screens.DirectMessagesScreen
import com.silvacomp.twitter_mirroring.ui.screens.HomeScreen
import com.silvacomp.twitter_mirroring.ui.screens.NotificationScreen
import com.silvacomp.twitter_mirroring.ui.screens.SearchScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.ScreenRoute
    ) {
        composable(BottomNavItem.Home.ScreenRoute) { HomeScreen() }
        composable(BottomNavItem.Search.ScreenRoute) { SearchScreen() }
        composable(BottomNavItem.Notifications.ScreenRoute) { NotificationScreen() }
        composable(BottomNavItem.DirectMessages.ScreenRoute) { DirectMessagesScreen() }
    }


}


