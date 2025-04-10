package com.ruzibekov.sab_test

import android.R.attr.padding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ruzibekov.sab_test.screens.address.MyAddressesScreen
import com.ruzibekov.sab_test.screens.map.MapScreen
import com.ruzibekov.sab_test.ui.theme.SAB_TestTheme

object MainScreen {

    @Composable
    fun Default() {
        val navController = rememberNavController()

        Scaffold(
            bottomBar = {
                MainBottomNavigationView()
            }
        ) { paddingValues ->
            NavHost(
                navController = navController,
                startDestination = Screen.Addresses.route,
                modifier = Modifier.padding(paddingValues)
            ) {
                composable(Screen.Addresses.route) { MyAddressesScreen() }
                composable(Screen.Favorites.route) { MapScreen() }
                composable(Screen.Profile.route) {  }
            }
        }
    }

    @Composable
    private fun MainBottomNavigationView() {

    }
}

@Preview
@Composable
private fun MainContentPreview() {
    SAB_TestTheme { MainScreen.Default() }
}