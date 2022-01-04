abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    conta: Conta,
    private val senha: String,
    idade: Int,
    salario: Double,
) :
    Funcionario(nome, cpf, conta,idade,salario) {
    fun autentica(senha: String) {
        if (this.senha == senha) {
            println("Bem vindo Admin")
        } else {
            println("Falha na autenticação")
        }
    }
}