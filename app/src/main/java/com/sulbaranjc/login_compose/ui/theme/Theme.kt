package com.sulbaranjc.login_compose.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// Un "ColorScheme" asigna cada color a su ROL dentro de Material 3.
// Los componentes (Button, OutlinedTextField...) leen estos roles solos,
// por eso no hace falta pintar cada uno a mano.
private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = OnPrimary,
    secondary = Secondary,
    tertiary = Tertiary,
    primaryContainer = PrimaryContainer,
    onPrimaryContainer = OnPrimaryContainer,
    surface = Surface,
    onSurface = OnSurface,
    onSurfaceVariant = OnSurfaceVariant,
    outline = Outline,
    outlineVariant = OutlineVariant,
    // El fondo del Scaffold usa "background": lo igualamos a "surface"
    // para que la pantalla tenga el mismo color que en Figma.
    background = Surface,
    onBackground = OnSurface,
)

@Composable
fun Login_composeTheme(content: @Composable () -> Unit) {
    // Nota didáctica: la plantilla de Android Studio traía "color dinámico"
    // (toma los colores del fondo de pantalla del usuario). Lo quitamos para
    // que la app se vea IGUAL que el diseño de Figma.
    // Siguiente paso posible: añadir un darkColorScheme para el modo oscuro.
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content,
    )
}
