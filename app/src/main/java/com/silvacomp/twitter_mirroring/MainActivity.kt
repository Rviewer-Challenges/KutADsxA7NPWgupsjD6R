package com.silvacomp.twitter_mirroring

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import com.silvacomp.twitter_mirroring.ui.components.*
import com.silvacomp.twitter_mirroring.ui.theme.TwitterMirroringTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwitterMirroringTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                val scope = rememberCoroutineScope()
                Scaffold(
                    scaffoldState = scaffoldState,
                    topBar = {
                        TwitterTopAppBar(
                            navController = navController,
                            onNavigationOnClick = {
                                scope.launch {
                                    scaffoldState.drawerState.open()
                                }
                            }
                        ) },
                    drawerContent = {
                        DrawerHeader()
                        DrawerBody()
                    },
                    bottomBar = { TwitterBottomBar(navController = navController) }
                ) {
                    NavigationGraph(navController = navController)
                }
            }
        }
    }
}

