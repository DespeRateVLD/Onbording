package com.example.figmaman

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.figmaman.ui.theme.FigmamanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FigmamanTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Users")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Image(

        painter = painterResource(id = R.mipmap.my_image_foreground),
        contentDescription = "Background Image",
        modifier = Modifier

            .fillMaxSize() // Заполнить всю доступную область
            .alpha(1f) // Прозрачность (по желанию)

    )

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
            text = "Hello $name!",
            modifier = modifier
        )
        Button(onClick = {
            val intent = Intent(context, FiveActivity::class.java)
            context.startActivity(intent)
        }) {
            Text("Skip to page 5")
        }
        Button(onClick = {
            val intent = Intent(context, TwoActivity::class.java)
            context.startActivity(intent)
        }) {
            Text("Go to page 2")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FigmamanTheme {
        Greeting("Users")
    }
}
