fun testaWith() {
    with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3285
        bairro = "Vila Mariana"
        cidade = "são paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }
}