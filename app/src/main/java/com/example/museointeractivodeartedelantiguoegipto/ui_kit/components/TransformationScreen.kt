package com.example.museointeractivodeartedelantiguoegipto.ui_kit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.museointeractivodeartedelantiguoegipto.R



//class TransformationScreen {
//}

@Composable
fun TransformationScreen() {
    var scale by remember { mutableStateOf(1f) }
    var offset by remember { mutableStateOf(Offset.Zero) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .pointerInput(Unit) {
                detectTransformGestures { _, pan, zoom, _ ->
                    scale = (scale * zoom).coerceIn(1f, 4f)
                    offset = offset + pan
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Pellizca la pantalla para explorar detalles del jeroglífico")
            Spacer(modifier = Modifier.height(16.dp))


            Image(

                painter = painterResource(id = R.drawable.jeroglifico_ejemplo),
                contentDescription = "Jeroglífico del Antiguo Egipto con zoom interactivo",
                 modifier = Modifier
                     .graphicsLayer(
                         scaleX = scale,
                         scaleY = scale,
                         translationX = offset.x,
                         translationY = offset.y
                     )
                     .size(300.dp)
             )
        }
    }
}