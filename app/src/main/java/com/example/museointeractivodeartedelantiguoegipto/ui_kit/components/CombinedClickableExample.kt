package com.example.museointeractivodeartedelantiguoegipto.ui_kit.components


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CombinedClickableExample() {
    var gestureText by remember { mutableStateOf("Toca, haz doble clic o mantén presionado") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .size(250.dp)
                .combinedClickable(
                    onClick = { gestureText = "¡Clic simple detectado!" },
                    onDoubleClick = { gestureText = "¡Doble clic detectado (Zoom rápido)!" },
                    onLongClick = { gestureText = "¡Presión larga (Detalles guardados)!" }
                ),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = gestureText, style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}