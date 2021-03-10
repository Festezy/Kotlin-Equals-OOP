package app.equals

import data.Equals.PerusahaanEquals

fun main() {
    /** Class Perusahaan */
    val perusahaan1 = PerusahaanEquals("Pertamina")
    val perusahaan2 = PerusahaanEquals("Pertamina")
    println(perusahaan1 == perusahaan2)
    println(perusahaan2 == perusahaan1)

    println()
}