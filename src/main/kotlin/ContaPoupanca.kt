class ContaPoupanca(
    titular: String,
    numero: Int
) : ContaComum(titular, numero) {
    override fun depositar(valor: Double) {
        super.depositar(valor + (valor * 0.1))
    }
}