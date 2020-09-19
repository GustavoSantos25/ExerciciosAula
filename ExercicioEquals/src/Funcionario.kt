class Funcionario (val nome: String, val numeroDeRegistro: Int) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Funcionario) return false
        return numeroDeRegistro == other.numeroDeRegistro
    }

}