package com.example.figmaman

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.figmaman.ui.theme.FigmamanTheme
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


class FiveActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FigmamanTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting4("Users")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow) // Замените на свой цвет или ресурс изображения
    )
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello  $name !",
            modifier = modifier
        )
        Button(onClick = {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }) {
            Text("Next to page 1")
        }

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    FigmamanTheme {
        Greeting4("Users")
    }
}