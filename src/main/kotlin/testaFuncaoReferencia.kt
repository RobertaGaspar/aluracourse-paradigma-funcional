fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(10, 5))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}
