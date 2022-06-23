package com.silvacomp.twitter_mirroring.data

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

    fun returnOptions(): List<NavigationDrawerItem>{
        return  listItems
    }
}