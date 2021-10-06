fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(25, 6))

    val calculaBonificacaoAnonimo: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000) {
            return salario + 500
        }
        return salario + 1000
    }
    println(calculaBonificacaoAnonimo(1000.9))
}