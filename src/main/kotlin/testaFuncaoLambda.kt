fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { _: Int, b: Int -> 20 + b }
    println(minhaFuncaoLambda(15, 10))

    val calculaBonificao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        return@lambda salario + 100.0
    }
    println(calculaBonificao(1100.0))
}