fun testaScopeFunctions() {
        val endereco = Endereco(logradouro = "rua vergueiro", numero = 123)
    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase()
   println(enderecoMaiusculo)

    Endereco(logradouro = "rua vergueiro", numero = 123)
        .also { println("Adicionando uma mensagem") }
        .run {
            "$logradouro, $numero".uppercase()
        }.let(::println)

    listOf(Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento"))
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))
}

