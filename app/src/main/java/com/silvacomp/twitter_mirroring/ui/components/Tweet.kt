package com.silvacomp.twitter_mirroring.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.AsyncImage
import com.silvacomp.twitter_mirroring.R
import com.silvacomp.twitter_mirroring.ui.theme.TwitterMirroringTheme


@Composable
fun Tweet(
    profile: Int,
    name: String,
    user: String,
    time: String,
    textTwit: String,
    comments: Int,
    retweet: Int,
    likes: Int,
    photos: List<String>?,
    isCommented: Boolean,
    isRetweet: Boolean,
    isLiked: Boolean,
    isShared: Boolean,
    like: (Boolean) -> Unit,

) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.primary)
            .padding(top = 15.dp)
    ) {
        Row(
            modifier = Modifier.padding(start = 15.dp, end = 15.dp)
        ) {
            Column {
                AsyncImage(
                    imageLoader = ImageLoader(LocalContext.current),
                    model = "https://loremflickr.com/290/290",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape),
                    contentDescription = null
                )
            }

            Column(
                modifier = Modifier.padding(start = 15.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        modifier = Modifier.weight(2f),
                        text = name,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1

                    )
                    Text(
                        text = user,
                        modifier = Modifier.weight(1f),
                        color = Color.Black,
                        maxLines = 1
                    )
                    Text(
                        text = time,
                        modifier = Modifier.weight(1f),
                        color = MaterialTheme.colors.surface,
                        maxLines = 1
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_menu_options),
                        modifier = Modifier.weight(1f),
                        contentDescription = null
                    )
                }
                Text(text = textTwit, color = Color.Black)
                if (photos != null) {
                    ImagesTweets(photos)
                }

                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.ic_comment),
                        contentDescription = null
                    )
                    Text(
                        text = comments.toString(), modifier = Modifier
                            .padding(start = 3.dp)
                            .weight(1f),
                        color = Color.Black

                    )

                    Image(
                        painter = painterResource(id = R.drawable.ic_retweet),
                        contentDescription = null
                    )
                    Text(
                        text = retweet.toString(), modifier = Modifier
                            .padding(start = 3.dp)
                            .weight(1f),
                        color = Color.Black
                    )
                    if (isLiked) {
                        Image(
                            modifier = Modifier
                                .clickable { like(false) },
                            painter = painterResource(id = R.drawable.ic_liked),
                            contentDescription = null
                        )
                    } else {
                        Image(
                            modifier = Modifier
                                .clickable { like(true) },
                            painter = painterResource(id = R.drawable.ic_like),
                            contentDescription = null
                        )
                    }

                    Text(
                        text = likes.toString(), modifier = Modifier
                            .padding(start = 3.dp)
                            .weight(1f),
                        color = Color.Black
                    )

                    Image(
                        painter = painterResource(id = R.drawable.ic_share),
                        contentDescription = null
                    )
                    Text(
                        text = likes.toString(), modifier = Modifier
                            .padding(start = 3.dp)
                            .weight(1f)
                    )

                }
            }
        }


    }


}


@Preview
@Composable
fun TweetPrev() {
    TwitterMirroringTheme {
        Tweet(
            profile = R.drawable.twitter_profile,
            name = "Jose de jesus ",
            user = "@Jsilva",
            time = "10h",
            textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
            comments = 4,
            retweet = 2,
            likes = 4,
            photos = null,
            isCommented = false,
            isLiked = false,
            isRetweet = false,
            isShared = false
        ) {

        }
    }
}