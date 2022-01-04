import java.math.BigDecimal

abstract class Funcionario(nome: String, cpf: String, conta: Conta, idade: Int, salario: Double): Comparable<Funcionario> {
    val nome = nome
    val salario = salario
    val conta: Conta = conta
    override fun compareTo(other: Funcionario): Int {
      return  this.salario.compareTo(other.salario)
    }
}