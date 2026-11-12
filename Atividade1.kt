fun main() {
    val palavra = "Universidade"

    for (letra in palavra) {

        if (letra.lowercaseChar() in "aeiou") {
            continue
        }

        print(letra)
    }
}