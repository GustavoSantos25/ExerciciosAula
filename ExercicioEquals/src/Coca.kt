class Coca(var tamanho: Int, var preco: Double) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Coca) return false
        return tamanho == other.tamanho
    }

}