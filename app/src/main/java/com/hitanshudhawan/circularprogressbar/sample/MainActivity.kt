package com.hitanshudhawan.circularprogressbar.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Slider
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hitanshudhawan.circularprogressbar.CircularProgressBar
import com.hitanshudhawan.circularprogressbar.sample.ui.theme.CircularProgressBarSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CircularProgressBarSampleTheme {

                var progress by remember { mutableStateOf(65f) }
                var startAngle by remember { mutableStateOf(0f) }
                var progressBarWidth by remember { mutableStateOf(20.dp) }
                var backgroundProgressBarWidth by remember { mutableStateOf(10.dp) }
                var roundBorder by remember { mutableStateOf(true) }

                Column(Modifier.padding(64.dp)) {

                    val animProgress by animateFloatAsState(progress)

                    CircularProgressBar(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1.0f),
                        progress = animProgress,
                        progressMax = 100f,
                        progressBarColor = Color.Blue,
                        progressBarWidth = progressBarWidth,
                        backgroundProgressBarColor = Color.Blue.copy(alpha = 0.15f),
                        backgroundProgressBarWidth = backgroundProgressBarWidth,
                        roundBorder = roundBorder,
                        startAngle = startAngle
                    )

                    Spacer(Modifier.height(64.dp))

                    Column(Modifier.padding(horizontal = 16.dp)) {

                        val sliderHeight = 32.dp

                        Slider(
                            value = progress,
                            onValueChange = { progress = it },
                            valueRange = 0f..100f,
                            modifier = Modifier.height(sliderHeight)
                        )

                        Slider(
                            value = startAngle,
                            onValueChange = { startAngle = it },
                            valueRange = 0f..360f,
                            modifier = Modifier.height(sliderHeight)
                        )

                        Slider(
                            value = progressBarWidth.value,
                            onValueChange = { progressBarWidth = it.dp },
                            valueRange = 2f..64f,
                            modifier = Modifier.height(sliderHeight)
                        )

                        Slider(
                            value = backgroundProgressBarWidth.value,
                            onValueChange = { backgroundProgressBarWidth = it.dp },
                            valueRange = 2f..64f,
                            modifier = Modifier.height(sliderHeight)
                        )

                        Spacer(Modifier.height(16.dp))

                        Row {
                            Text("Round Border")
                            Spacer(Modifier.weight(1f))
                            Switch(
                                checked = roundBorder,
                                onCheckedChange = { roundBorder = it }
                            )
                        }
                    }
                }
            }
        }
    }
}
