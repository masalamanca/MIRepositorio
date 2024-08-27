fun main() {
    val cabinas = mutableListOf<Cabina>()

    while (true) {
        println("Seleccione una opción:")
        println("1. Agregar cabinas")
        println("2. Registrar llamadas")
        println("3. Mostrar información de cabinas")
        println("4. Mostrar consolidado")
        println("5. Reiniciar cabina")
        println("6. Salir")
        when (readLine()?.toIntOrNull()) {
            1 -> agregarCabinas(cabinas)
            2 -> registrarLlamadas(cabinas)
            3 -> cabinas.forEach { it.mostrarInformacion() }
            4 -> mostrarConsolidado(cabinas)
            5 -> reiniciarCabina(cabinas)
            6 -> {
                println("Saliendo...")
                return
            }
            else -> println("Opción no válida.")
        }
    }
}

fun agregarCabinas(cabinas: MutableList<Cabina>) {
    println("¿Cuántas cabinas desea agregar?")
    val numCabinas = readLine()?.toIntOrNull() ?: 0
    repeat(numCabinas) {
        val nuevaCabina = Cabina(cabinas.size + 1)
        cabinas.add(nuevaCabina)
        println("Cabina ${nuevaCabina.id} agregada.")
    }
}

fun registrarLlamadas(cabinas: List<Cabina>) {
    println("Ingrese el ID de la cabina:")
    val cabinaId = readLine()?.toIntOrNull()
    val cabina = cabinas.getOrNull(cabinaId?.minus(1) ?: -1)
    if (cabina != null) {
        println("Ingrese el número de llamadas:")
        val numeroDeLlamadas = readLine()?.toIntOrNull() ?: 0
        repeat(numeroDeLlamadas) {
            println("Seleccione el tipo de llamada:")
            println("1. LOCAL")
            println("2. LARGA_DISTANCIA")
            println("3. CELULAR")
            val tipoLlamada = when (readLine()?.toIntOrNull()) {
                1 -> TipoLlamada.LOCAL
                2 -> TipoLlamada.LARGA_DISTANCIA
                3 -> TipoLlamada.CELULAR
                else -> {
                    println("Opción no válida. Se seleccionará LOCAL por defecto.")
                    TipoLlamada.LOCAL
                }
            }
            println("Ingrese la duración de la llamada en minutos:")
            val duracion = readLine()?.toIntOrNull() ?: 0
            cabina.registrarLlamada(tipoLlamada, duracion)
        }
        println("Llamadas registradas en la cabina ${cabina.id}.")
    } else {
        println("Cabina no encontrada.")
    }
}

fun reiniciarCabina(cabinas: List<Cabina>) {
    println("Ingrese el ID de la cabina a reiniciar:")
    val cabinaId = readLine()?.toIntOrNull()
    val cabina = cabinas.getOrNull(cabinaId?.minus(1) ?: -1)
    if (cabina != null) {
        cabina.reiniciar()
        println("Cabina ${cabina.id} reiniciada.")
    } else {
        println("Cabina no encontrada.")
    }
    cabinas.forEach { it.mostrarInformacion() }
}

fun mostrarConsolidado(cabinas: List<Cabina>) {
    val totalLlamadas = cabinas.sumOf { it.numLlamadas }
    val duracionTotal = cabinas.sumOf { it.tiempoLlamadas }
    val costoTotal = cabinas.sumOf { it.costoLlamadas }
    val costoPromedioPorMinuto = if (duracionTotal > 0) costoTotal / duracionTotal else 0

    println("Consolidado de la empresa:")
    println("Total de llamadas realizadas: $totalLlamadas")
    println("Duración de las llamadas: $duracionTotal minutos")
    println("Costo de las llamadas: $costoTotal pesos")
    println("Costo por minuto: $costoPromedioPorMinuto pesos")
}