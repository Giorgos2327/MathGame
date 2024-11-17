package com.aliric.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.aliric.myapplication.ui.theme.Math_GameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Math_GameTheme {
                MyNavigation()

            }
        }
    }
}

@Composable
fun MyNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "MathGame") {
        composable(route = "MathGame") {
            FirstPage(navController)

        }
        composable(
            route = "SecondPage/{category}",
            arguments = listOf(
                navArgument("category") { type = NavType.StringType }
            )
        ) { easy ->

            val selectedCategory = easy.arguments?.getString("category")

            selectedCategory?.let { category ->
                SecondPage(navController = navController, category =category)
            }
        }
        composable(
            route = "ResultPage/{score}",
            arguments = listOf(
                navArgument("score") { type = NavType.IntType}
            )
        ) { easy ->

            val userScore = easy.arguments?.getInt("score")

            userScore?.let { score ->
                ResultPage(navController = navController, score =score)
            }
        }
    }
}

