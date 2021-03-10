package data.Equals

class PerusahaanEquals (val name: String){
    override fun equals(other: Any?): Boolean {
        return when (other){
            is PerusahaanEquals -> other.name == this.name
            else -> false
        }
    }



}