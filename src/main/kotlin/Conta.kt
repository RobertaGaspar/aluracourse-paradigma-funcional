abstract class Conta(
    var titular: Cliente,
    val numero: Int,
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    class ContaPoupanca(
        titular: Cliente,
        numero: Int,
    ) : Conta(
        titular = titular,
        numero = numero
    )
}
