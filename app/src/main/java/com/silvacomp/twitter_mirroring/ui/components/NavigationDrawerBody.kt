package com.silvacomp.twitter_mirroring.ui.components

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.silvacomp.twitter_mirroring.data.OptionsMenuTwitter


@Composable
fun DrawerBody() {
    Column(modifier = Modifier
        .fillMaxSize()
    ){
        OptionsMenuTwitter.returnOptions().forEach{ item ->
            TwitterMenuOption(icon = item.icon, title = item.title) {
                Log.d("Twitter", item.icon.toString())
            }

        }
        DrawerFooter()


    }
}