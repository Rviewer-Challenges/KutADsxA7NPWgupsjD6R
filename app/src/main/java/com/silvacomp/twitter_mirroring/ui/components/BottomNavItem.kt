package com.silvacomp.twitter_mirroring.ui.components

import com.silvacomp.twitter_mirroring.R

sealed class BottomNavItem(
    var Icon: Int,
    var ScreenRoute: String
){
    object Home: BottomNavItem(R.drawable.ic_home, "Home")
    object Search: BottomNavItem(R.drawable.ic_search, "Search")
    object Notifications: BottomNavItem(R.drawable.ic_notification, "Notification")
    object DirectMessages: BottomNavItem(R.drawable.ic_direct_messages, "Directs")
}
