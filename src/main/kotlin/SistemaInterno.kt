class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank")
            autenticado()
        } else {
            println("Falha na autenticacao")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank")
            autenticado()
        } else {
            println("Falha na autenticacao")
        }
    }

    fun pagamento() {
        println("Pagamento efetuado com sucesso!")
    }
}

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}
