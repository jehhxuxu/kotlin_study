fun main() {
    val funcionarios = mutableListOf<Funcionario>(bia, ivan)
    funcionarios.add(
        Desenvolvedor(
            "Xuxu",
            "123.321.123-22",
            contaXuxu,
            31,
            7500.0
        )
    )

    val maisFuncionario = listOf<Funcionario>(bia,ivan)

    println(funcionarios.filter { funcionario -> funcionario.salario > 5000.0 }.joinToString { it.nome })

    println(funcionarios.take(1).first().nome)
    println(funcionarios.joinToString(separator = "\n") {
        "- ${it.nome} ganha ${it.salario} "
    })
    println(funcionarios.sorted().joinToString { it.nome }) // it works because we extends comparable on funcionarios
    val salarios = funcionarios.map { it.salario }
    println(salarios.soma())
    funcionarios.add(ivan)
    println(funcionarios.toSet())
}

fun List<Double>.soma(): Double {
    return this.reduce { acc, valor -> acc + valor }
}
