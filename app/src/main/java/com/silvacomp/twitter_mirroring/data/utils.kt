package com.silvacomp.twitter_mirroring.data

import android.content.Context
import android.graphics.ImageDecoder
import android.os.Build.VERSION.SDK_INT
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import com.silvacomp.twitter_mirroring.R
import com.silvacomp.twitter_mirroring.ui.components.NavigationDrawerItem



object OptionsMenuTwitter {
    private val listItems = listOf(
        NavigationDrawerItem(R.drawable.ic_profile, "Perfil" ),
        NavigationDrawerItem(R.drawable.ic_list, "Listas"),
        NavigationDrawerItem(R.drawable.ic_comment, "Temas"),
        NavigationDrawerItem(R.drawable.ic_saved_elements, "Elementos Guardados"),
        NavigationDrawerItem(R.drawable.ic_moments, "Momentos"),
        NavigationDrawerItem(R.drawable.ic_money, "Monetizaciones"),
        NavigationDrawerItem(R.drawable.ic_twitter_profesional, "Twitter para profesionales"),
        NavigationDrawerItem(null, "Configuración y privacidad"),
        NavigationDrawerItem(null, "Centro de ayuda")
        ,
    )

    fun returnOptions(): List<NavigationDrawerItem> =  listItems

}


object Tweets {
    private val Tweets: List<DataTweet> = listOf(
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

    fun returnTweets(): List<DataTweet> = Tweets
}


object ImageLoader{
    fun getImageLoader(context: Context): ImageLoader {
        return ImageLoader.Builder(context)
            .components {
                if (SDK_INT >= 28) {
                    add(ImageDecoderDecoder.Factory())
                } else {
                    add(GifDecoder.Factory())
                }
            }
            .build()
    }
}

