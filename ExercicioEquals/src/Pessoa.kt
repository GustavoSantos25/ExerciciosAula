class Pessoa(var nome: String, var RG: Int){

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Pessoa) return false
        return RG == other.RG
    }
}
