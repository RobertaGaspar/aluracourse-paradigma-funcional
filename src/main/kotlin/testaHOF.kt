fun testaHOF() {
    plus(1, 5)
    somaReciver(1, 5, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 12345
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 12345, autenticado = {
        println("realizar o pagamento")
    })
    sistema.entraReceiver(autenticavel, 12345, autenticado = {
        pagamento()
    })
}

fun plus(a: Int, b: Int) {
    println("Antes")
    println(a + b)
    println("Depois ")
}

fun somaReciver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("Antes da soma")
    val total = a + b
    total.resultado()
    println("Depois da soma")
}

