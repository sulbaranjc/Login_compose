package com.sulbaranjc.login_compose.ui.theme

import androidx.compose.material3.Typography

// Tipografía de la app.
// En Figma usamos la escala de Material 3 con la fuente Roboto:
//   Headline Medium 28/36 · Body Large 16/24 · Body Medium 14/20
//   Body Small 12/16 · Label Large 14/20 (Medium)
// "Typography()" ya trae justo esos valores por defecto, y en Android la
// fuente del sistema es Roboto, así que no hay que personalizar nada.
// Si algún día quieres cambiar un estilo, se hace así:
//   Typography().copy(headlineMedium = TextStyle(fontSize = 30.sp, ...))
val Typography = Typography()
