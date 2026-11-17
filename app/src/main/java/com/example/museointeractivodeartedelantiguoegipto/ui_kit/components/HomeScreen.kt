package com.example.museointeractivodeartedelantiguoegipto.ui_kit.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    selectedProfile: UserProfile,
    onProfileSelected: (UserProfile) -> Unit,
    onNavigateToSection: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Museo Interactivo de Arte del Antiguo Egipto",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Selecciona tu perfil de visitante:", style = MaterialTheme.typography.titleMedium)

        UserProfile.entries.forEach { profile ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = (profile == selectedProfile),
                        onClick = { onProfileSelected(profile) }
                    )
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (profile == selectedProfile),
                    onClick = { onProfileSelected(profile) }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(text = profile.title, style = MaterialTheme.typography.bodyLarge)
                    Text(text = profile.description, style = MaterialTheme.typography.bodySmall)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Exhibiciones Temáticas", style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { onNavigateToSection("vida_cotidiana") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Vida Cotidiana")
        }

        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { onNavigateToSection("arquitectura") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Arquitectura y Pirámides")
        }

        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { onNavigateToSection("arte") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Arte Egipcio")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Exploración por Gestos", style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(8.dp))

        // Botón añadido para la sección de gestos
        Button(
            onClick = { onNavigateToSection("transformation") },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
        ) {
            Text(text = "Zoom en Jeroglíficos (Transformación)")
        }
    }
}