fun main() {
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 123)
//    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase()
//   println(enderecoMaiusculo)

    Endereco(logradouro = "rua vergueiro", numero = 123)
        .run {
            "$logradouro, $numero".uppercase()
        }.let(::println)

    listOf(Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento"))
        .filter (predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))

    plus(1, 5)

    val autenticavel = object : Autenticavel {
        val senha = 12345
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 12345) {
        println("realizar o pagamento")
    }
}

fun plus(a: Int, b: Int) {
    println("Antes")
    println(a + b)
    println("Depois ")
}


