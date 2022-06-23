package com.silvacomp.twitter_mirroring.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.silvacomp.twitter_mirroring.ui.theme.TwitterMirroringTheme

@Composable
fun HomeScreen() {
    Text(text = "This a home screen")
}

@Preview
@Composable
fun HomeScreenPrev() {
    TwitterMirroringTheme {
        HomeScreen()
    }
}