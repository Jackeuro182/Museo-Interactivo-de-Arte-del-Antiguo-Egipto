package com.example.museointeractivodeartedelantiguoegipto.ui_kit.components

import com.example.museointeractivodeartedelantiguoegipto.R

data class SectionMedia(
    val videoUrl: String,
    val audioResId: Int,
    val audioDescription: String
)

object MediaByProfileProvider {

    fun getMediaForSection(section: String, profile: UserProfile): SectionMedia {
        return when (section) {
            "vida" -> when (profile) {
                UserProfile.NINOS -> SectionMedia(
                    videoUrl = "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8",
                    audioResId = R.raw.audio1, 
                    audioDescription = "Narración infantil: Un día divertido en el Nilo"
                )
                UserProfile.ADOLESCENTES -> SectionMedia(
                    videoUrl = "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8",
                    audioResId = R.raw.audio2,
                    audioDescription = "Audio interactivo: Secretos de la vida cotidiana"
                )
                UserProfile.ADULTOS -> SectionMedia(
                    videoUrl = "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8",
                    audioResId = R.raw.audio3,
                    audioDescription = "Documental académico: Economía y sociedad en el Imperio Antiguo"
                )
            }
            "arquitectura" -> when (profile) {
                UserProfile.NINOS -> SectionMedia(
                    videoUrl = "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8",
                    audioResId = R.raw.audio1,
                    audioDescription = "Cuento sonoro: ¿Cómo se construyeron las montañas de piedra?"
                )
                UserProfile.ADOLESCENTES -> SectionMedia(
                    videoUrl = "https://tu-servidor.com/hls/arq_ados/playlist.m3u8",
                    audioResId = R.raw.audio2,
                    audioDescription = "Audioguía: El misterio de las rampas y los faraones"
                )
                UserProfile.ADULTOS -> SectionMedia(
                    videoUrl = "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8",
                    audioResId = R.raw.audio3,
                    audioDescription = "Análisis técnico: Ingeniería métrica y astronómica de Guiza"
                )
            }
            else -> /* Arte */ when (profile) {
                UserProfile.NINOS -> SectionMedia(
                    videoUrl = "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8",
                    audioResId = R.raw.audio1,
                    audioDescription = "Audio cuento: El misterio de los jeroglíficos mágicos"
                )
                UserProfile.ADOLESCENTES -> SectionMedia(
                    videoUrl = "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8",
                    audioResId = R.raw.audio2,
                    audioDescription = "Audioguía: Tesoros de oro y la máscara de Tutankamón"
                )
                UserProfile.ADULTOS -> SectionMedia(
                    videoUrl = "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8",
                    audioResId = R.raw.audio3,
                    audioDescription = "Conferencia magistral: Canon artístico y química del azul egipcio"
                )
            }
        }
    }
}