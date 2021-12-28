abstract class ContaComum(val titular: String, val numero: Int) : Conta(), ITransferencia {

    override fun transferir(contaDestino: Conta, valor: Double) {
        if (this.saldo >= valor) {
            contaDestino.depositar(valor)
            this.saldo -= valor
        }
    }
}