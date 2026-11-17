package com.example.museointeractivodeartedelantiguoegipto.ui_kit.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp



@Composable
fun ArquitecturaScreen(
    currentProfile: UserProfile,
    onBackClick: () -> Unit
) {
    val scrollState = rememberScrollState()

    val mediaData = MediaByProfileProvider.getMediaForSection("arquitectura", currentProfile)
    val articles = EducationalContentProvider.getArquitecturaArticles(currentProfile)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState)
    ) {
        Button(onClick = onBackClick) {
            Text(text = "← Volver al Menú")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Arquitectura y Construcción de Pirámides",
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = "Modo activo: ${currentProfile.title}",
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(16.dp))

        MultimediaSectionScreen(
            sectionTitle = mediaData.audioDescription,
            videoUrl = mediaData.videoUrl,
            audioResId = mediaData.audioResId
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Artículos de la Sección (${currentProfile.title})",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(8.dp))


        articles.forEach { article ->
            ArticleItem(
                title = article.title,
                description = article.description,
                imageResId = article.imageResId
            )
        }

    }
}