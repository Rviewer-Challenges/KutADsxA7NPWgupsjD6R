package com.silvacomp.twitter_mirroring.ui.components

import android.service.quicksettings.Tile
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TwitterMenuOption(
    icon: Int?,
    title: String,
    onClickOption: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp)
            .clickable { onClickOption() }
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        if(icon != null){
            Image(
                modifier = Modifier.padding(start = 5.dp),
                painter = painterResource(id = icon),
                contentDescription = title
            )
        }

        Spacer(modifier = Modifier.width(10.dp))
        Text(text = title, color = Color.Black, fontSize = 20.sp)

    }

}