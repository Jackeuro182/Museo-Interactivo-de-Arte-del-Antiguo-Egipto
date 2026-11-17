/*package com.example.museointeractivodeartedelantiguoegipto.ui_kit.composition



import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.museointeractivodeartedelantiguoegipto.Screen
import com.example.museointeractivodeartedelantiguoegipto.ui_kit.components.ArquitecturaScreen
import com.example.museointeractivodeartedelantiguoegipto.ui_kit.components.ArteScreen
import com.example.museointeractivodeartedelantiguoegipto.ui_kit.components.HomeScreen
import com.example.museointeractivodeartedelantiguoegipto.ui_kit.components.TransformationScreen
import com.example.museointeractivodeartedelantiguoegipto.ui_kit.components.VidaCotidianaScreen


// Importa aquí tus demás pantallas conforme las vayas creando

@Composable
fun MainComposer() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.route) {

        // Pantalla Principal / Menú del Museo
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToSection = { route -> navController.navigate(route) },
                onNavigateToGestures = { route -> navController.navigate(route) }
            )
        }

        // Secciones Temáticas del Museo (Ejemplo: Vida Cotidiana)
        composable(Screen.VidaCotidiana.route) {
            // TODO: Crear componente DetailSectionScreen para Vida Cotidiana (Artículos, Audios, Imágenes)
            VidaCotidianaScreen()
        }

        composable(Screen.Arquitectura.route) {
            // TODO: Crear componente DetailSectionScreen para Arquitectura y Pirámides
            ArquitecturaScreen()
        }

        composable(Screen.Arte.route) {
            // TODO: Crear componente DetailSectionScreen para Arte Egipcio
            ArteScreen()
        }

        // Pantalla de Gestos (Ejemplo de Transformación / Zoom que vimos antes)
        composable(Screen.TransformationScreen.route) {
            TransformationScreen()
        }

        // Puedes añadir aquí el resto de rutas de gestos:
        // composable(Screen.ClickableScreen.route) { ClickableScreen() }
        // composable(Screen.SwipeableScreen.route) { SwipeableScreen() }
    }
}


*/
package com.example.museointeractivodeartedelantiguoegipto.ui_kit.composition

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.museointeractivodeartedelantiguoegipto.Screen
import com.example.museointeractivodeartedelantiguoegipto.ui_kit.components.*

@Composable
fun MainComposer() {
    val navController = rememberNavController()

    // Estado global del perfil del visitante
    var selectedProfile by remember { mutableStateOf(UserProfile.ADULTOS) }

    NavHost(navController = navController, startDestination = Screen.Home.route) {

        // Pantalla Principal (Menú con perfiles)
        composable(Screen.Home.route) {
            HomeScreen(
                selectedProfile = selectedProfile,
                onProfileSelected = { newProfile ->
                    selectedProfile = newProfile
                },
                onNavigateToSection = { route ->
                    navController.navigate(route)
                }
            )
        }

        // 1. Vida Cotidiana
        composable("vida_cotidiana") {
            VidaCotidianaScreen(
                currentProfile = selectedProfile,
                onBackClick = { navController.popBackStack() }
            )
        }

        // 2. Arquitectura y Pirámides (Ruta directa estandarizada)
        composable("arquitectura") {
            ArquitecturaScreen(
                currentProfile = selectedProfile,
                onBackClick = { navController.popBackStack() }
            )
        }
        // 3. Arte Egipcio (Ruta directa estandarizada)
        composable("arte") {
            ArteScreen(
                currentProfile = selectedProfile,
                onBackClick = { navController.popBackStack() }
            )
        }




        // 4. Exploración por Gestos
        composable("transformation") {
            TransformationScreen()
        }
    }
}