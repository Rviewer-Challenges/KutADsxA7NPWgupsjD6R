package com.silvacomp.twitter_mirroring.ui.components

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.AsyncImage

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImagesTweets(photos: List<String>) {
    when (photos.size) {
        1 -> {
            Card(
                modifier = Modifier.clip(RoundedCornerShape(10.dp))
            ) {
                AsyncImage(
                    imageLoader = ImageLoader(LocalContext.current),
                    model = photos[0],
                    modifier = Modifier.fillMaxSize(),
                    contentDescription = null,

                )
            }

        }
        2 -> {
            Row {
                photos.forEach { photo ->
                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .padding(4.dp)
                            .clip(RoundedCornerShape(10.dp))
                    ) {
                        AsyncImage(
                            model = photo,
                            contentDescription = null
                        )
                    }
                }
            }
        }
        3 -> {
            Row {
                Card(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp)
                        .clip(RoundedCornerShape(10.dp))
                ) {
                    AsyncImage(
                        model = photos[0],
                        contentDescription = null,
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    photos.forEachIndexed { index, photo ->
                        if (index > 0) {
                            Card(
                                modifier = Modifier
                                    .padding(4.dp)
                                    .clip(RoundedCornerShape(10.dp))
                            ) {
                                AsyncImage(
                                    model = photo,
                                    contentDescription = null
                                )
                            }
                        }
                    }
                }
            }

        }
        4 -> {
            LazyVerticalGrid(
                modifier = Modifier.height(250.dp),
                cells = GridCells.Fixed(2),
            )
            {
                items(photos) { photo ->
                    Card(
                        modifier = Modifier.clip(RoundedCornerShape(10.dp))
                    ) {
                        AsyncImage(
                            model = photo,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(1.dp),

                            contentDescription = null
                        )
                    }

                }
            }

        }


    }
}