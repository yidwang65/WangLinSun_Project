package com.example.cs501finalproject

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.cs501finalproject.ui.BlogView
import com.example.cs501finalproject.ui.CalendarPage
import com.example.cs501finalproject.ui.HomePage
import com.example.cs501finalproject.ui.MemoriesPage
import com.example.cs501finalproject.ui.NavigationBar
import com.example.cs501finalproject.ui.Profile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import java.util.UUID


class MainActivity : AppCompatActivity() {

    private val coroutineScope: CoroutineScope = GlobalScope


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BlogRepository.initialize(this)
        setContent {

            MainApp()
        }
    }

    @Composable
    fun MainApp() {
        val navController = rememberNavController()
        Scaffold(
            bottomBar = { NavigationBar(navController, Modifier) }
        ) { innerPadding ->
            // 设置 NavHost 与 NavController，并应用由 Scaffold 提供的内边距
            NavHost(
                navController = navController,
                startDestination = "home",
                modifier = Modifier.padding(innerPadding)  // 应用内边距确保 NavHost 不与底部栏重叠
            ) {
                composable("home") { HomeScreen(navController) }
                composable("calendar") { CalendarScreen(navController) }
                composable("memories") { MemoriesScreen(navController) }
                composable("settings") { SettingsScreen(navController) }
                composable(
                    "blog/{blogID}",
                    arguments = listOf(navArgument("blogId") { type = NavType.IntType })
                ) {backStackEntry ->
                    val blogId = backStackEntry.arguments?.getInt("blogId") ?: -1  // Use -1 or another default value as a fallback

                    // Pass the blogId to your BlogView
                    BlogView(navController, blogId)
                }
            }
        }
    }


    @Composable
    fun HomeScreen(navController: NavController) {
        HomePage(navController)
    }

    @Composable
    fun CalendarScreen(navController: NavController) {
        CalendarPage(navController)
    }

    @Composable
    fun MemoriesScreen(navController: NavController) {
        MemoriesPage(navController)
    }

    @Composable
    fun SettingsScreen(navController: NavController) {
        Profile(navController)
    }


}