package com.kak.mealsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kak.mealsapp.ui.Screen
import com.kak.mealsapp.ui.screens.meals.MealsScreen
import com.kak.mealsapp.ui.screens.mealsdetails.MealsDetailsScreen
import com.kak.mealsapp.ui.theme.MealsAppTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MealsAppTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    MealsScreen()
                }
            }
        }
    }
}
@Composable
fun MealsApp(){
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Screen.MealsScreen.route) {
        composable(Screen.MealsScreen.route){ MealsScreen(navHostController)}
        composable(Screen.MealsDetailsScreen.route){ MealsDetailsScreen(navHostController) }

    }


}