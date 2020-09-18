class Pessoa(var nome: String, var RG: Int){
    override fun equals(other: Pessoa): Boolean {
        if (this.RG == other.RG) return true
        return true
    }
}
