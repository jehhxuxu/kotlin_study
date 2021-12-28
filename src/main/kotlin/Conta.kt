abstract class Conta : IConta {
    var saldo = 0.0
        protected set

    override fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    override fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}