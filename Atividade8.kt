fun main() {
    val senhaCorreta = "1234"

    for (tentativa in 1..5) {

        print("Digite a senha: ")
        val senhaDigitada = readln()

        if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido!")
            break

        } else {
            println("Senha incorreta!")

            if (tentativa == 3) {
                println("Cofre travado administrativamente")
                break
            }
        }
    }
}