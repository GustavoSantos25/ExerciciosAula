fun main(){
    val pessoa1 = Pessoa("Gustavo", 1)
    val pessoa2 = Pessoa("Camila", 1)

    println("Resultado 1: ${pessoa1.equals(pessoa2)}")

    val coca1 = Coca(350, 4.50)
    val coca2 = Coca(350, 5.30)

    println("Resultado 1: ${coca1.equals(coca2)}")

    val aluno1 = Aluno("Gustavo", 1)
    val aluno2 = Aluno("Camila", 2)
    val aluno3 = Aluno("Michelle", 3)
    val aluno4 = Aluno("Vitor", 4)
    val aluno5 = Aluno("João", 4)

    var listAlunos = listOf(aluno1, aluno2, aluno3, aluno4)

    println("Contém aluno: ${ listAlunos.contains(aluno5)}")

}
