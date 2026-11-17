

package com.example.museointeractivodeartedelantiguoegipto.ui_kit.components

import com.example.museointeractivodeartedelantiguoegipto.R


enum class UserProfile(val title: String, val description: String) {
    NINOS("🧒 Niños", "Aventuras sencillas y datos divertidos"),
    ADOLESCENTES("🧑 Adolescentes", "Historia interactiva y misterios del Nilo"),
    ADULTOS("👨‍🏫 Adultos / Académico", "Investigación profunda y rigor histórico")
}

data class DetailedArticle(
    val title: String,
    val description: String,
    val imageResId: Int,
    //val audioResId: Int
)

data class Article(val title: String, val content: String)
object EducationalContentProvider {

    fun getVidaCotidianaArticles(profile: UserProfile): List<DetailedArticle> {
        return when (profile) {
            UserProfile.NINOS -> listOf(
                DetailedArticle(
                    "1. ¡Las pirámides gigantes!",
                    "¡Imagínate! Muchos trabajadores pasaban años construyéndolas. Por dentro están llenas de túneles y pasadizos secretos, y las más famosas se llaman Keops, Kefrén y Micerino.",
                    R.drawable.piramides,
                    
                ),
                DetailedArticle(
                    "2. Las momias y los sarcófagos",
                    "Después los metían en cajas muy lujosas llamadas sarcófagos. Como creían que había vida después de la muerte, ¡les guardaban comida, muebles y juguetes para que los usaran allá!",
                    R.drawable.momia,
                ),
                DetailedArticle(
                    "3. ¿Cuándo y Dónde? (Hace 5,000 años)",
                    "Empezó hace nada menos que 5,000 años y duró 3,000 años enteros! Es una historia súper antigua de nuestro planeta.",
                    R.drawable.donde,
                    
                ),
                DetailedArticle(
                    "4. El súper río Nilo",
                    "Como Egipto está rodeado de desierto, la tierra buena para sembrar y cultivar estaba cerquita del río. Además, lo usaban para pescar y como si fuera una autopista de agua para viajar en barco.",
                    R.drawable.rio_nilo,
                    
                ),
                DetailedArticle(
                    "5. ¡Los faraones (¡Reyes y reinas poderosos!",
                    "Cleopatra, que fue una reina súper lista y escritora, y a Tutankamón, ¡que se convirtió en faraón cuando solo tenía 9 años.",
                    R.drawable.celopatra,
                    
                )
            )

            UserProfile.ADOLESCENTES -> listOf(
                DetailedArticle(
                    "1. Una civilización de 3,000 años",
                    "El Antiguo Egipto floreció a lo largo del río Nilo durante más de tres milenios, desde el 3100 a. C. hasta la llegada del Imperio Romano.",
                    R.drawable.civilizacion,
                    
                ),
                DetailedArticle(
                    "2. El poder de los faraones",
                    "Eran considerados reyes y dioses vivos en la tierra. Figuras como Ramsés II, Cleopatra y el joven Tutankamón marcaron la historia.",
                    R.drawable.podefaraon,
                    
                ),
                DetailedArticle(
                    "3. Vida y transporte en el río Nilo",
                    "El Nilo no solo permitía cultivar tierras fértiles y pescar, sino que funcionaba como la gran autopista fluvial para transportar mercancías y personas.",
                    R.drawable.vida,
                    
                ),
                DetailedArticle(
                    "4. Las tumbas y el más allá",
                    "Los faraones y la élite construían monumentales tumbas y preparaban sus cuerpos momificados creyendo en un viaje seguro hacia la otra vida.",
                    R.drawable.tumba,
                    
                ),
                DetailedArticle(
                    "5. Comunicación y jeroglíficos",
                    "Crearon una de las escrituras más fascinantes de la historia con símbolos y dibujos tallados en templos y papiros para registrar sus creencias.",
                    R.drawable.comunicacion,
                    
                )
            )

            UserProfile.ADULTOS -> listOf(
                DetailedArticle(
                    "1. Cronología y marco histórico",
                    "Evolución geopolítica de una de las civilizaciones más influyentes, estructurada en imperios y gobernada por monarquías teocráticas.",
                    R.drawable.marco,
                    
                ),
                DetailedArticle(
                    "2. Soberanía y liderazgo dinástico",
                    "El rol de los faraones como articuladores políticos, religiosos y militares, destacando legados históricos como el de Cleopatra y Tutankamón.",
                    R.drawable.liderazgo,
                    
                ),
                DetailedArticle(
                    "3. Ecosistema fluvial y desarrollo socioeconómico",
                    "Importancia estratégica del río Nilo como eje vertebrador de la agricultura, el comercio y la expansión demográfica en el desierto.",
                    R.drawable.desarrollo,
                    
                ),
                DetailedArticle(
                    "4. Prácticas funerarias y cosmovisión",
                    "Sistemas de preservación corporal, ajuares y arquitectura funeraria fundamentados en la profunda creencia del tránsito al más allá.",
                    R.drawable.funerarias,
                    
                ),
                DetailedArticle(
                    "5. Sistemas de registro y epigrafía",
                    "Desarrollo institucional de la escritura jeroglífica como herramienta de administración estatal, registro histórico y transmisión cultural.",
                    R.drawable.epigrafia,
                    
                )
            )
        }
    }

    fun getArquitecturaArticles(profile: UserProfile): List<DetailedArticle> {
        return when (profile) {
            UserProfile.NINOS -> listOf(
                DetailedArticle(
                    "1. ¿Para qué servían las pirámides?",
                    "¡Imagínate! Como creían que después de morir los faraones se convertirían en dioses, necesitaban una \"casa\" grandísima y muy especial para su viaje al más allá.",
                    R.drawable.piramidesnino,
                    
                ),
                DetailedArticle(
                    "2. ¡Piedras pesadas como elefantes!",
                    "Lo más impresionante es que ¡no tenían grúas ni camiones modernos para moverlas! Eran súper ingeniosos y tenían que ingeniárselas de otra manera.",
                    R.drawable.piedras,
                    
                ),
                DetailedArticle(
                    "3. El truco de la arena mojada",
                    "¡Mojar la arena hacía que los bloques resbalaran mucho mejor! Era exactamente igual a cuando te deslizas por un tobogán en el parque después de llover.",
                    R.drawable.arena,
                    
                ),
                DetailedArticle(
                    "4. El mayor trabajo en equipo de la historia",
                    "Todos colaboraban! Era como el proyecto en equipo más grande del mundo antiguo, y lo lograron coordinar sin teléfonos ni WhatsApp.",
                    R.drawable.trabajadores,
                    
                ),
                DetailedArticle(
                    "5. Pasadizos secretos y misterios",
                    "Parece un videojuego de aventuras en la vida real! Tienen tantos secretos que siguen sorprendiendo a todo el mundo después de más de 4,500 años.",
                    R.drawable.pasadisos,
                    
                )
            )

            UserProfile.ADOLESCENTES -> listOf(
                DetailedArticle(
                    "1. Gigantes de piedra para los faraones",
                    "Las pirámides fueron diseñadas como monumentales tumbas reales con túneles y cámaras secretas para proteger a los faraones en la eternidad.",
                    R.drawable.gigante_piedra,
                    
                ),
                DetailedArticle(
                    "2. Ingeniería sin grúas ni tecnología moderna",
                    "Movían bloques de piedra que pesaban tanto como elefantes utilizando la fuerza colectiva, rampas de tierra y el truco de mojar la arena.",
                    R.drawable.ingenieria,
                    
                ),
                DetailedArticle(
                    "3. El gran proyecto en equipo de la historia",
                    "Miles de personas entre agricultores, albañiles y carpinteros coordinaban sus esfuerzos de manera magistral sin herramientas digitales.",
                    R.drawable.equipo,
                    
                ),
                DetailedArticle(
                    "4. Las maravillas de Guiza",
                    "Complejos arquitectónicos legendarios como la Gran Pirámide construida para Keops, una de las grandes maravillas del mundo antiguo.",
                    R.drawable.guiza,
                    
                ),
                DetailedArticle(
                    "5. Templos y columnas monumentales",
                    "Templos imponentes como Karnak y Abu Simbel decorados con columnas inspiradas en la naturaleza, como flores de loto y hojas de palmera.",
                    R.drawable.monumentales,
                    
                )
            )

            UserProfile.ADULTOS -> listOf(
                DetailedArticle(
                    "1. Tipología y función monumental de las pirámides",
                    "Análisis de las estructuras funerarias reales como expresiones arquitectónicas del poder teocrático y la transición al inframundo.",
                    R.drawable.tipologia,
                    
                ),
                DetailedArticle(
                    "2. Logística e ingeniería de construcción",
                    "Métodos de transporte de grandes volúmenes pétreos mediante el aprovechamiento físico de la fricción y rampas de arrastre.",
                    R.drawable.logistica,
                    
                ),
                DetailedArticle(
                    "3. Organización laboral y movilización social",
                    "Modelos de cooperación y gestión de mano de obra a gran escala necesarios para la ejecución de obras públicas faraónicas.",
                    R.drawable.laboral,
                    
                ),
                DetailedArticle(
                    "4. Legado patrimonial en la meseta de Guiza",
                    "Estudio estructural de las pirámides principales y su perdurabilidad como referentes universales de la arquitectura antigua.",
                    R.drawable.legado,
                    
                ),
                DetailedArticle(
                    "5. Arquitectura templaria y elementos decorativos",
                    "Configuración espacial de complejos religiosos y uso pionero de elementos sustentantes como capiteles estilizados.",
                    R.drawable.templaria,
                    
                )
            )
        }
    }

    fun getArteArticles(profile: UserProfile): List<DetailedArticle> {
        return when (profile) {
            UserProfile.NINOS -> listOf(
                DetailedArticle(
                    "1. Dioses con cabezas de animales",
                    "Imagínate a Anubis con cabeza de chacal protegiendo el más allá, o a Horus con cabeza de halcón! Sus cabezas de animales simbolizaban las superpoderes que cada dios tenía..",
                    R.drawable.dioses,
                    
                ),
                DetailedArticle(
                    "2. Los jeroglíficos y la mágica Piedra Rosetta",
                    "Eran dibujos misteriosos tallados en las paredes! Y como si fuera un código secreto de un videojuego, la Piedra Rosetta ayudó a los historiadores a leerlos porque tenía el mismo texto en tres idiomas diferentes.",
                    R.drawable.geroglificos,
                    
                ),
                DetailedArticle(
                    "3. Las pirámides gigantes y columnas con formas de plantas",
                    "Además de las pirámides gigantescas hechas de bloques pesadísimos, a los egipcios les encantaba decorar sus templos con columnas que tenían formas de plantas reales, ¡como flores de loto o hojas de palmera!",
                    R.drawable.columna,
                    
                ),
                DetailedArticle(
                    "4. Esculturas gigantes y la misteriosa Esfinge",
                    "Tallaban estatuas enormes! Como la Gran Esfinge, que tiene cuerpo de león y cabeza de faraón (aunque... ¡le falta la nariz!). También hacían bustos súper detallados como el de la famosa reina Nefertiti.",
                    R.drawable.leon,
                    
                ),
                DetailedArticle(
                    "5. Pinturas con reglas muy divertidas",
                    "Los egipcios pintaban de una forma muy graciosa! Dibujaban las cabezas de ladito, pero el cuerpo de frente. Además, para que se supiera quién era el jefe, al rey o al faraón lo dibujaban gigantesco y a los sirvientes chiquititos.",
                    R.drawable.pintura,
                    
                )
            )

            UserProfile.ADOLESCENTES -> listOf(
                DetailedArticle(
                    "1. Dioses con atributos animales",
                    "Representaban a sus deidades combinando cuerpos humanos con cabezas de animales (como Anubis o Horus) para simbolizar sus extraordinarios poderes.",
                    R.drawable.diosesanimales,
                    
                ),
                DetailedArticle(
                    "2. El misterio de los jeroglíficos y la Piedra Rosetta",
                    "Un sistema de escritura mediante símbolos y pictogramas que pudo ser descifrado gracias a la famosa Piedra Rosetta y sus textos multilingües.",
                    R.drawable.rosetta,
                    
                ),
                DetailedArticle(
                    "3. Estatuas colosales y la Gran Esfinge",
                    "Esculturas monumentales esculpidas en piedra, destacando la enigmática Esfinge con cuerpo de león y cabeza de faraón, junto a finos bustos como el de Nefertiti.",
                    R.drawable.esfinge,
                    
                ),
                DetailedArticle(
                    "4. El tesoro de Tutankamón",
                    "El impresionante descubrimiento arqueológico de la tumba intacta de Tutankamón, repleta de joyas, oro puro y su icónica máscara funeraria.",
                    R.drawable.tesoro,
                    
                ),
                DetailedArticle(
                    "5. Reglas únicas en la pintura egipcia",
                    "Estilo pictórico caracterizado por dibujar cabezas de perfil y torsos de frente, utilizando además la escala de tamaño para destacar la importancia de los faraones.",
                    R.drawable.pintura2,
                    
                )
            )

            UserProfile.ADULTOS -> listOf(
                DetailedArticle(
                    "1. Iconografía divina y simbolismo zoomorfo",
                    "Representación plástica de la mitología mediante la hibridación de formas humanas y animales para manifestar la naturaleza de las deidades.",
                    R.drawable.simbolismo,
                    
                ),
                DetailedArticle(
                    "2. Epigrafía y desciframiento histórico",
                    "Evolución del sistema de escritura pictográfica y el impacto científico del hallazgo epigráfico de la Piedra Rosetta.",
                    R.drawable.epigrafia2,
                    
                ),
                DetailedArticle(
                    "3. Estatuaria monumental y relieve escultórico",
                    "Creación de obras exentas y conmemorativas de gran formato, exemplifiedas por la Esfinge y retratos reales de alta finura estética.",
                    R.drawable.monumental2,
                    
                ),
                DetailedArticle(
                    "4. Arqueología funeraria y orfebrería dinástica",
                    "Análisis del ajuar funerario y los tesoros áureos descubiertos en la tumba de Tutankamón como testimonio de las prácticas rituales.",
                    R.drawable.orfebreria,
                    
                ),
                DetailedArticle(
                    "5. Cánones compositivos y perspectiva tradicional",
                    "Estudio de las convenciones estéticas en la bidimensionalidad, destacando la ley de la frontalidad y la jerarquía de proporciones.",
                    R.drawable.perspectiva,
                    
                )
            )
        }
    }
}
