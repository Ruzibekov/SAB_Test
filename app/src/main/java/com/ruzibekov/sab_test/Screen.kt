package com.ruzibekov.sab_test

sealed class Screen(val route: String) {
    object Addresses : Screen("addresses")
    object Favorites : Screen("favorites")
    object Profile : Screen("profile")
    
    companion object {
        val bottomNavItems = listOf(Addresses, Favorites, Profile)
    }
}