
package com.example.museointeractivodeartedelantiguoegipto.ui_kit.components



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AccessibilityBar(
    onFontSizeChange: (Float) -> Unit,
    onHighContrastToggle: (Boolean) -> Unit
) {
    var textSizeMultiplier by remember { mutableFloatStateOf(1f) }
    var highContrast by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = {
                textSizeMultiplier = if (textSizeMultiplier >= 1.5f) 1.0f else textSizeMultiplier + 0.2f
                onFontSizeChange(textSizeMultiplier)
            }) {
                Text(text = "Texto A+")
            }

            Row {
                Text(text = "Alto Contraste", modifier = Modifier.padding(end = 8.dp))
                Switch(
                    checked = highContrast,
                    onCheckedChange = {
                        highContrast = it
                        onHighContrastToggle(it)
                    }
                )
            }
        }
    }
}
