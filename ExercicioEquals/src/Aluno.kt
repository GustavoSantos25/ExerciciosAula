class Aluno(var nome: String, var numeroDeAluno: Int) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Aluno) return false
        return numeroDeAluno == other.numeroDeAluno
    }
}