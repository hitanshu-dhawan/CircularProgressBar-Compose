package com.hitanshudhawan.circularprogressbar.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hitanshudhawan.circularprogressbar.CircularProgressBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Row(Modifier.background(Color.Red)) {
                    CircularProgressBar(
                        modifier = Modifier.weight(1f),
                        progress = 0.25f,
                        progressMax = 1.00f,
                        progressBarColor = Color.Blue,
                        progressBarWidth = 32.dp,
                        backgroundProgressBarColor = Color.White,
                        backgroundProgressBarWidth = 16.dp,
                        roundBorder = true,
                        startAngle = 90f
                    )
                    CircularProgressBar(
                        modifier = Modifier.weight(1f),
                        progress = 0.25f,
                        progressMax = 1.00f,
                        progressBarColor = Color.Blue,
                        progressBarWidth = 16.dp,
                        backgroundProgressBarColor = Color.White,
                        backgroundProgressBarWidth = 32.dp,
                        roundBorder = true,
                        startAngle = 90f
                    )
                }
            }
        }
    }
}
