package com.silvacomp.twitter_mirroring

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.silvacomp.twitter_mirroring.data.DataTweet

class MainViewModel : ViewModel() {

    private val _tweets = mutableStateOf(
        listOf(
            DataTweet(
                profile = 1,
                name = "Carlos Gutierrez de la garza y garza",
                user = "@carlosG",
                time = "1h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 1,
                retweet = 2,
                likes = 3,
                photos = null
            ),
            DataTweet(
                profile = 2,
                name = "Ricardo",
                user = "@Cholo",
                time = "30 min",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos = listOf(
                    "https://loremflickr.com/840/580"
                )
            ),
            DataTweet(
                profile = 3,
                name = "MOuredev",
                user = "@mouredev",
                time = "14h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos = null,
                isLiked = true
            ),

            DataTweet(
                profile = 3,
                name = "Jose luis",
                user = "@jlnoticias",
                time = "12h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos = null
            ),
            DataTweet(
                profile = 3,
                name = "Jose luis",
                user = "@jlnoticias",
                time = "12h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos =  listOf(
                    "https://loremflickr.com/840/580",
                    "https://loremflickr.com/840/580",
                    "https://loremflickr.com/840/580",
                    "https://loremflickr.com/840/580"
                )
            ),
            DataTweet(
                profile = 3,
                name = "Jose luis",
                user = "@jlnoticias",
                time = "12h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos = null
            ),
            DataTweet(
                profile = 3,
                name = "Jose luis",
                user = "@jlnoticias",
                time = "12h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos = null
            ),
            DataTweet(
                profile = 3,
                name = "Jose luis",
                user = "@jlnoticias",
                time = "12h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos = listOf(
                    "https://loremflickr.com/840/1024",
                    "https://loremflickr.com/840/1024",
                )
            ),
            DataTweet(
                profile = 3,
                name = "Jose luis",
                user = "@jlnoticias",
                time = "12h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos = null
            ),
            DataTweet(
                profile = 3,
                name = "Jose luis",
                user = "@jlnoticias",
                time = "12h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos = null
            ),DataTweet(
                profile = 3,
                name = "Jose luis",
                user = "@jlnoticias",
                time = "12h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos =  listOf(
                    "https://loremflickr.com/840/1200",
                    "https://loremflickr.com/840/580",
                    "https://loremflickr.com/840/580"
                )
            ),DataTweet(
                profile = 3,
                name = "Jose luis",
                user = "@jlnoticias",
                time = "12h",
                textTwit = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nec commodo eros. Proin ac tempor sapien. Fusce in te",
                comments = 0,
                retweet = 2,
                likes = 3,
                photos = null
            ),
        )
    )
    val tweets: State<List<DataTweet>> =_tweets



    fun like(liked: Boolean, position: Int){
        _tweets.value[position].isLiked = liked
    }
}