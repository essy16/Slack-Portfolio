package com.essycynthia.slackportfolio

sealed class Screen(val route : String){
    object MainScreen : Screen("main_screen")
    object WebViewScreen : Screen("web_screen")
}
