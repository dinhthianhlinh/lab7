package com.example.lab7_kotlin_dinhthianhlinh

import android.annotation.SuppressLint
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
import com.example.lab7_kotlin_dinhthianhlinh.ui.theme.Lab7_kotlin_dinhthianhlinhTheme

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab7_kotlin_dinhthianhlinhTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {  innerPadding ->
                    //MovieScreen(movies = Movie.getSampleMovies())

                    ScreenNavigation()
//                    val mainViewModel = MainViewModel()
//                    val moviesState =
//                        mainViewModel.movies.observeAsState(initial = emptyList())
//                    MovieScreen(moviesState.value)
                }
            }
        }
    }
}