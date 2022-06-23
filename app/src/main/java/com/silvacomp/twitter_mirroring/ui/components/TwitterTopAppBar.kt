package com.silvacomp.twitter_mirroring.ui.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.silvacomp.twitter_mirroring.R
import java.util.*

@Composable
fun TwitterTopAppBar(
    navController: NavController,
    onNavigationOnClick:() -> Unit
) {
    TopAppBar(
        title = {
            Row (
                modifier = Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = R.drawable.twitter_logo),
                    contentDescription = null
                )
            }

        },
        backgroundColor = MaterialTheme.colors.primary,
        elevation = 10.dp,
        navigationIcon = {
            Image(
                painter = painterResource(id = R.drawable.twitter_profile),
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .clickable { onNavigationOnClick() },
                contentDescription = null
            )
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Add,
                    contentDescription = "Leer después"
                )
            }
        },


    )
}
