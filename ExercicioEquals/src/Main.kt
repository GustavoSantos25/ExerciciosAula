fun main(){
    val pessoa1 = Pessoa("Gustavo", 1)
    val pessoa2 = Pessoa("Camila", 1)

    println("Resultado 1: ${pessoa1.equals(pessoa2)}")

    val coca1 = Coca(350, 4.50)
    val coca2 = Coca(350, 5.30)

    println("Resultado 1: ${coca1.equals(coca2)}")

}
