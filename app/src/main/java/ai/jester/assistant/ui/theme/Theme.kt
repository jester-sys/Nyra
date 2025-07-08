package ai.jester.assistant.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Green,
    secondary = StrokeColorDark,
    background = BackgroundDark,
    surface = TextColorDark,
    error = Red,
    onPrimary = CardBorderDark,
    onSecondary = CapabilitiesBackgroundDark,
    onSurface = InactiveInputDark,
    onBackground = MessageBackgroundDark
)

private val LightColorScheme = lightColorScheme(
    primary = Green,
    secondary = StrokeColor,
    background = Background,
    surface = TextColor,
    error = Red,
    onPrimary = CardBorder,
    onSecondary = CapabilitiesBackground,
    onSurface = InactiveInput,
    onBackground = MessageBackground
)

@Composable
fun BotTalkAITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            if (darkTheme) dynamicDarkColorScheme(context)
            else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val typography = if (darkTheme) TypographyDark else Typography

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
