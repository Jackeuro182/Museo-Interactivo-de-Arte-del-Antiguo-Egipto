package com.example.museointeractivodeartedelantiguoegipto.ui_kit.components


import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import androidx.annotation.RawRes
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView

@Composable
fun MultimediaSectionScreen(
    sectionTitle: String,
    videoUrl: String,
    @RawRes audioResId: Int
) {
    val context = LocalContext.current

    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            val mediaItem = MediaItem.fromUri(Uri.parse(videoUrl))
            setMediaItem(mediaItem)
            prepare()
        }
    }



    DisposableEffect(Unit) {
        onDispose {
            exoPlayer.release()
        }
    }

    // Nota: Quitamos el verticalScroll de aquí para evitar el conflicto de altura infinita
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Text(text = sectionTitle, style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(8.dp))

        // Reproductor de Video (.m3u8) con altura fija controlada
        AndroidView(
            factory = { ctx ->
                PlayerView(ctx).apply {
                    player = exoPlayer
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Reproductor de Audio
        AudioPlayerControl(context = context, audioResId = audioResId)
    }
}

@Composable
fun AudioPlayerControl(context: Context, @RawRes audioResId: Int) {
    var mediaPlayer by remember { mutableStateOf<MediaPlayer?>(null) }
    var isPlaying by remember { mutableStateOf(false) }

    Button(onClick = {
        if (isPlaying) {
            mediaPlayer?.pause()
            isPlaying = false
        } else {
            if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(context, audioResId).apply {
                    setOnCompletionListener { isPlaying = false }
                }
            }
            mediaPlayer?.start()
            isPlaying = true
        }
    }) {
        Text(text = if (isPlaying) "Pausar Audio Ambiental" else "Reproducir Audio Tradicional")
    }
}