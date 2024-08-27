data class Llamada(val id: Int, val tipo: TipoLlamada, val duracion: Int, val costo: Int)

class Cabina(val id: Int) {
    private var llamadaIdCounter = 1
    private val llamadas = mutableListOf<Llamada>()
    var tiempoLlamadas = 0
        private set
    var costoLlamadas = 0
        private set
    var numLlamadas = 0
        private set

    fun registrarLlamada(tipo: TipoLlamada, duracion: Int) {
        val costo = tipo.costoPorMinuto * duracion
        val llamada = Llamada(llamadaIdCounter++, tipo, duracion, costo)
        llamadas.add(llamada)
        tiempoLlamadas += duracion
        costoLlamadas += costo
        numLlamadas += 1
    }

    fun mostrarInformacion() {
        println("Cabina $id:")
        println("Llamadas realizadas: $numLlamadas")
        println("Duración de las llamadas: $tiempoLlamadas minutos")
        println("Costo de las llamadas: $costoLlamadas pesos")
        if (llamadas.isEmpty()) {
            println("Llamadas: N/A")
        } else {
            println("Llamadas:")
            llamadas.forEachIndexed { index, llamada ->
                println("  Llamada ${index + 1}: ID: ${llamada.id}, Tipo: ${llamada.tipo}, Duración: ${llamada.duracion} minutos, Costo: ${llamada.costo} pesos")
            }
        }
    }

    fun reiniciar() {
        llamadaIdCounter = 1
        llamadas.clear()
        tiempoLlamadas = 0
        costoLlamadas = 0
        numLlamadas = 0
    }
}

enum class TipoLlamada(val costoPorMinuto: Int) {
    LOCAL(50),
    LARGA_DISTANCIA(350),
    CELULAR(150)
}

