package com.hitanshudhawan.circularprogressbar.sample.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val themeColors = lightColors(
    primary = Color(0xFF757575),
    primaryVariant = Color(0xFF757575),
    secondary = Color(0xFF757575),
    secondaryVariant = Color(0xFF757575),
)

@Composable
fun CircularProgressBarSampleTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = themeColors,
        content = content
    )
}
