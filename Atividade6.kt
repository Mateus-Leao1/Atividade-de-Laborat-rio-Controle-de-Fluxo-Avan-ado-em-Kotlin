fun main() {
    val entradas = listOf(1, 3, 2, 0)
    var indice = 0

    while (true) {

        val opcao = entradas[indice]
        indice++

        when (opcao) {

            1, 2 -> println("Processando...")

            3 -> {
                println("Módulo em manutenção")
                continue
            }

            0 -> {
                println("Programa encerrado")
                break
            }
        }
    }
}