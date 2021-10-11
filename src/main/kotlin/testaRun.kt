fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12

    val contaPoupanca = Conta.ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 123435), 1000)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("simulação de rendimento Mensal: $rendimentoMensal")
    }

    run {
        var saldo = contaPoupanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }.let { rendimentoAnual ->
        println("simulação de rendimento Anual: $rendimentoAnual")
    }
}