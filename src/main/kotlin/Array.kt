fun main() {
    val funcionarios = arrayOf<Funcionario>(bia, ivan)
    funcionarios.forEach { funcionario -> println(funcionario.nome) }

    val salarioAlto = funcionarios.filter { funcionario -> funcionario.salario > 5000.0 }
    salarioAlto.forEach { funcionario -> println(funcionario.nome) }
    var totalSalario = 0.0
    funcionarios.forEach { funcionario -> totalSalario += funcionario.salario }
    println(totalSalario)
    println(funcionarios.take(1).first().nome)
    println(funcionarios.joinToString( separator="\n" ) {
        "- ${it.nome} ganha ${it.salario} "
    })
    println(funcionarios.sorted()) // it works because we extends comparable on funcionarios
}


