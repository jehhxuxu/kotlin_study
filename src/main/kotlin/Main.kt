fun main() {
    ivan.autentica("kkk")
    contaBia.depositar(1000.0)
    contaXuxu.depositar(100.0)

    println(contaBia.saldo)
    println(contaXuxu.saldo)
    contaBia.transferir(contaXuxu, 100.0)
    println(contaBia.saldo)
    println(contaXuxu.saldo)
    contaXuxu.sacar(10.0)
    println(contaXuxu.saldo)

    val contaSalario = ContaSalario("Bwolf", 5000)
    println(contaSalario is IConta)
}


