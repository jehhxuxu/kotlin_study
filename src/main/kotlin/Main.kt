fun main() {
    val contaBia = ContaPoupanca("Bia", 1000)
    val bia = Funcionario(nome = "bia", cpf = "222.222.222-22", contaBia)
    println(bia.conta.saldo)
    val contaXuxu = ContaCorrente("Xuxu", 1001)

    contaBia.depositar(1000.0)
    contaXuxu.depositar(100.0)

    println(contaBia.titular)
    println(contaBia.saldo)
    println(contaXuxu.saldo)
    contaBia.transferir(contaXuxu, 100.0)
    println(contaBia.saldo)
    println(contaXuxu.saldo)
}

open class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        private set


    open fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun transferir(contaDestino: Conta, valor: Double) {
        if (this.saldo >= valor) {
            contaDestino.depositar(valor)
            this.saldo -= valor
        }
    }

    fun saque(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(titular, numero) {
    override fun depositar(valor: Double) {
        super.depositar(valor + (valor * 0.1))
    }

}

class ContaCorrente : Conta {
    constructor(titular: String, numero: Int) : super(titular, numero)
}

class Funcionario(nome: String, cpf: String, conta: Conta) {
    val nome = nome
    val cpf = cpf
    val conta = conta
}