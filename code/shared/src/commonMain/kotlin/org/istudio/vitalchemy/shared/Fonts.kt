package org.istudio.vitalchemy.shared

import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.Font
import androidx.compose.ui.text.font.FontFamily
import vitalchemy.shared.generated.resources.Res
import vitalchemy.shared.generated.resources.bebas_neue_regular
import vitalchemy.shared.generated.resources.roboto_condensed_medium

@Composable
fun BebasNeueFont() = FontFamily(
    Font(Res.font.bebas_neue_regular)
)

@Composable
fun RobotoCondensedFont() = FontFamily(
    Font(Res.font.roboto_condensed_medium)
)