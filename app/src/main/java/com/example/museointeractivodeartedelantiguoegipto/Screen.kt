package com.example.museointeractivodeartedelantiguoegipto

//sealed class Screen(val route: String) {
    sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object VidaCotidiana : Screen("vida_cotidiana_screen")
    object Arquitectura : Screen("arquitectura_screen")
    object Arte : Screen("arte_screen")

    // Pantallas de Gestos requeridas
    object ClickableScreen : Screen("clickable_screen")
    object DraggableScreen : Screen("draggable_screen")
    object RotationScreen : Screen("rotation_screen")
    object CombinedClickableScreen : Screen("combined_clickable_screen")
    object DraggableFullScreen : Screen("draggable_full_screen")
    object TransformationScreen : Screen("transformation_screen")
    object HorizontalScrollScreen : Screen("horizontal_scroll_screen")
    object VerticalScrollScreen : Screen("vertical_scroll_screen")
    object ScrollableScreen : Screen("scrollable_screen")
    object NestedScrollScreen : Screen("nested_scroll_screen")
    object SwipeableScreen : Screen("swipeable_screen")
}