/**
 * Rodríguez Díaz Yarah Adonai
 */
fun calcularPendiente (x1: Double, y1: Double, x2: Double, y2: Double): Double { 
    val pendiente = (y2 - y1) / (x2 - x1) 
    return pendiente
}

fun main() {
    val x1 = 4.0 
    val y1 = 3.0
    val x2 = -3.0 
    val y2 = -2.0

    val pendiente = calcularPendiente (x1, y1, x2, y2)
    println("La pendiente entre los puntos ($x1, $y1) y ($x2, $y2) es: $pendiente")
}
