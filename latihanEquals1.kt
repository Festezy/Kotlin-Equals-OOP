package app.equals

import data.Equals.MahasiswaEquals

fun main() {
    /** MahasiswaEquals Class */
    val mahasiswa1 = MahasiswaEquals("Ariq", 2312, "TIK")
    val mahasiswa2 = MahasiswaEquals("Ariq", 2312, "TIK")

    println(mahasiswa1  == mahasiswa2)
    println(mahasiswa2 == mahasiswa1)

}

