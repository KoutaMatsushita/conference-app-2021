package io.github.droidkaigi.feeder.core.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets

private val DarkColorPalette = darkColors(
    primary = blue200,
    primaryVariant = blue700,
    secondary = green200
)

private val LightColorPalette = lightColors(
    primary = blue200,
    primaryVariant = blue700,
    secondary = green200

    /* Other default colors to override
background = Color.White,
surface = Color.White,
onPrimary = Color.White,
onSecondary = Color.Black,
onBackground = Color.Black,
onSurface = Color.Black,
*/
)

@Composable
fun ConferenceAppFeederTheme(
    // Currently dark mode is not supported
    // Please fix this https://github.com/DroidKaigi/conference-app-2021/issues/38
    darkTheme: Boolean = false,
    content: @Composable
    () -> Unit,
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    ProvideWindowInsets {
        MaterialTheme(
            colors = colors,
            typography = typography,
            shapes = shapes,
            content = content
        )
    }
}
