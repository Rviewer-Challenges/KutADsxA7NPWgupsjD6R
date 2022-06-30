package com.silvacomp.twitter_mirroring.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.silvacomp.twitter_mirroring.R

@Composable
fun DrawerFooter() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .shadow(1.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 15.dp),
                painter = painterResource(id = R.drawable.ic_idea),
                contentDescription = null,
                alignment = Alignment.CenterStart

            )
            Image(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 15.dp),
                painter = painterResource(id = R.drawable.ic_qr),
                contentDescription = null,
                alignment = Alignment.CenterEnd,

            )
        }
    }

}