package com.silvacomp.twitter_mirroring.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.silvacomp.twitter_mirroring.MainViewModel
import com.silvacomp.twitter_mirroring.data.Tweets
import com.silvacomp.twitter_mirroring.ui.components.Tweet
import com.silvacomp.twitter_mirroring.ui.theme.TwitterMirroringTheme

@Composable
fun HomeScreen(viewModel: MainViewModel = viewModel()) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
       val tweets = viewModel.tweets.value
        itemsIndexed(items = tweets, itemContent = { index,tweet ->
            Tweet(
                profile = tweet.profile,
                name = tweet.name,
                user = tweet.user,
                time = tweet.time,
                textTwit = tweet.textTwit,
                comments = tweet.comments,
                retweet = tweet.retweet,
                likes = tweet.likes,
                photos = tweet.photos,
                isCommented = tweet.isCommented,
                isRetweet = tweet.isRetweeted,
                isLiked = tweet.isLiked,
                isShared = tweet.isShared,

            ){
                viewModel.like(it, index)
            }
        })


    }
}

@Preview
@Composable
fun HomeScreenPrev() {
    TwitterMirroringTheme {
        HomeScreen()
    }
}