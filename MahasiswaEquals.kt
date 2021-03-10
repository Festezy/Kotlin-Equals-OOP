package data.Equals

class MahasiswaEquals (val Name: String, val Nim: Int, val Jurusan: String){
    override fun equals(other: Any?): Boolean {
        return when (other){
            is MahasiswaEquals -> other.Name == this.Name
            is MahasiswaEquals -> other.Nim == this.Nim
            is MahasiswaEquals -> other.Jurusan == this.Jurusan
            else -> false
        }
    }
}