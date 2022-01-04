class ContaCorrente(titular: String, numero: Int) : ContaComum(titular, numero) {

    override fun sacar(valor: Double) {
        val finalValue = valor + 0.10
        super.sacar(finalValue)
    }
}