package com.example.cs501finalproject.ui

import androidx.compose.material.Colors
import androidx.compose.material.lightColors
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

// Material Design : Color System11
// https://m2.material.io/design/color/the-color-system.html#color-usage-and-palettes

// Four themes
enum class ThemeState { Pink, Amber, Green, Blue}

// default theme: pink
var currThemeState by mutableStateOf(ThemeState.Amber)

fun getAppThemeColors(theme: ThemeState): Colors = when (theme) {
    ThemeState.Pink -> PinkThemeColors
    ThemeState.Amber -> AmberThemeColors
    ThemeState.Green -> GreenThemeColors
    ThemeState.Blue -> BlueThemeColors
}

val exampleThemeColors = lightColors(
    primary = Color(0xFF6200EE), // navigationBar normal;
    primaryVariant = Color(0xFF3700B3), // navigationBar selected;
    secondary = Color(0xFF03DAC6), // topBar;
    secondaryVariant = Color(0xFF018786), // top bar button;
    background = Color(0xFFFFFFFF), // background for pages;
    surface = Color(0xFFFFFFFF), // background for card; menu
    error = Color(0xFFB00020),
    onPrimary = Color(0xFF000000),
    onSecondary = Color(0xFF000000),
    onBackground = Color(0xFF000000),
    onSurface = Color(0xFF000000),
    onError = Color(0xFFFFFFFF),
)

val PinkThemeColors = lightColors(
    primary = Color(0xFFF3E5F5),
    primaryVariant = Color(0xFFE1BEE7),
    secondary = Color(0xFFCE93D8),
    secondaryVariant = Color(0xFFBA68C8),
    background = Color(0xFFEDEBF4),
    surface = Color(0xFFFFFFFF),
    error = Color(0xFFB00020),
    onPrimary = Color(0xFF000000),
    onSecondary = Color(0xFF000000),
    onBackground = Color(0xFF000000),
    onSurface = Color(0xFF000000),
    onError = Color(0xFFFFFFFF),
)

val AmberThemeColors = lightColors(
    primary = Color(0xFFFFF8E1),
    primaryVariant = Color(0xFFFFECB3),
    secondary = Color(0xFFFFE082),
    secondaryVariant = Color(0xFFFFD54F),
    background = Color(0xFFFFFDED),
    surface = Color(0xFFFFFFFF),
    error = Color(0xFFB00020),
    onPrimary = Color(0xFF000000),
    onSecondary = Color(0xFF000000),
    onBackground = Color(0xFF000000),
    onSurface = Color(0xFF000000),
    onError = Color(0xFFFFFFFF),
)

val GreenThemeColors = lightColors(
    primary = Color(0xFFE8F5E9),
    primaryVariant = Color(0xFFC8E6C9),
    secondary = Color(0xFFA5D6A7),
    secondaryVariant = Color(0xFF81C784),
    background = Color(0xFFDCECDE),
    surface = Color(0xFFFFFFFF),
    error = Color(0xFFB00020),
    onPrimary = Color(0xFF000000),
    onSecondary = Color(0xFF000000),
    onBackground = Color(0xFF000000),
    onSurface = Color(0xFF000000),
    onError = Color(0xFFFFFFFF),
)

val BlueThemeColors = lightColors(
    primary = Color(0xFFE3F2FD),
    primaryVariant = Color(0xFFBBDEFB),
    secondary = Color(0xFF90CAF9),
    secondaryVariant = Color(0xFF64B5F6),
    background = Color(0xFFDFFDFA),
    surface = Color(0xFFFFFFFF),
    error = Color(0xFFB00020),
    onPrimary = Color(0xFF000000),
    onSecondary = Color(0xFF000000),
    onBackground = Color(0xFF000000),
    onSurface = Color(0xFF000000),
    onError = Color(0xFFFFFFFF),
)