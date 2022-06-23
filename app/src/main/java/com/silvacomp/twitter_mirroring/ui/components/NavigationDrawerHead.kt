package com.silvacomp.twitter_mirroring.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.silvacomp.twitter_mirroring.R

@Composable
fun DrawerHeader() {
    Box(
        modifier = Modifier
            .height(150.dp)
            .background(MaterialTheme.colors.primary)
            .shadow(1.dp)
    ){
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .padding(top = 3.dp)
                    ,
                painter = painterResource(id = R.drawable.twitter_profile),
                contentDescription = null
            )

            Row(
                modifier = Modifier.padding(top = 5.dp)
            ) {
                Text(
                    text = "Jose de Jesús",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
            
            Text(
                text = "@JSilvaH",
                color = Color.Black,
                fontSize = 13.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "235", fontWeight = FontWeight.Bold,  color = Color.Black)
                Text(text = " Siguiendo",  color = Color.Black)
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "20", fontWeight = FontWeight.Bold,  color = Color.Black)
                Text(text = " Seguidores",  color = Color.Black)
            }
        }


    }

}
