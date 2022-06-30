package com.silvacomp.twitter_mirroring.data

data class DataTweet(
    val profile: Int,
    val name: String,
    val user: String,
    val time: String,
    val textTwit: String,
    val comments: Int,
    val retweet: Int,
    val likes: Int,
    val photos: List<String>?,
    var isCommented: Boolean = false,
    var isRetweeted: Boolean = false,
    var isLiked: Boolean = false,
    var isShared: Boolean = false

)
