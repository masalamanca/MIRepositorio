class Operaciones(var n1: Double, var n2: Double) {
    private val resultados = mutableListOf<Double>()

    fun suma() {
        val suma = n1 + n2
        resultados.add(suma)
        println("La suma es:\n$suma")
    }

    fun resta() {
        val resta = n1 - n2
        resultados.add(resta)
        println("La resta es:\n$resta")
    }

    fun multiplicacion() {
        val multiplicacion = n1 * n2
        resultados.add(multiplicacion)
        println("La multiplicación es:\n$multiplicacion")
    }

    fun division() {
        val division = n2 / n1
        resultados.add(division)
        println("La división es:\n$division")
    }

    fun elevacion() {
        val elevacion = Math.pow(n1, n2)
        resultados.add(elevacion)
        println("la elevación es:\n$elevacion")
    }

    fun Resultados() {
        println("los Resultados son:\n$resultados")
    }
}
