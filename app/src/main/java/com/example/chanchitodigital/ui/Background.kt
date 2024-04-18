package com.example.chanchitodigital.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color


@Composable
fun GradientBackgroundBrush(
    isVerticalGradient: Boolean,
    colors: List<Color> ): Brush {
    val endOffset = if (isVerticalGradient) {
        Offset(0.0f, Float.POSITIVE_INFINITY)
    } else {
        Offset(Float.POSITIVE_INFINITY, 0.0f)
    }

    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = endOffset
    )
}


@Composable
fun Background(gradientColors: List<Color>) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = GradientBackgroundBrush(
                        isVerticalGradient = false,
                        colors = gradientColors
                    ),
                )
        )
    }
}