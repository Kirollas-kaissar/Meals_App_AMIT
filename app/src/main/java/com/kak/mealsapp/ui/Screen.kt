package com.kak.mealsapp.ui

sealed class Screen(val route: String) {
    object MealsScreen : Screen("mealsScreen")
    object MealsDetailsScreen : Screen("mealsDetailsScreen")
}