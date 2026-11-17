package com.example.museointeractivodeartedelantiguoegipto


import com.example.museointeractivodeartedelantiguoegipto.ui.theme.MuseoInteractivoDeArteDelAntiguoEgiptoTheme


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.museointeractivodeartedelantiguoegipto.ui.theme.MuseoInteractivoDeArteDelAntiguoEgiptoTheme
import com.example.museointeractivodeartedelantiguoegipto.ui_kit.composition.MainComposer // Importa tu compositor principal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MuseoInteractivoDeArteDelAntiguoEgiptoTheme {
                // Aquí reemplazamos el Scaffold de ejemplo por tu MainComposer que controla todo el flujo
                MainComposer()
            }
        }
    }
}