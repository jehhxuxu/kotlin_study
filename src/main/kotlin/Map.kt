import java.math.BigDecimal

fun main() {
    val mapList = listOf(
        mapOf<String, Any>(Pair("id", 10), Pair("title", "dois"), "value" to 25.50),
        mapOf<String, Any>(Pair("id", 11), Pair("title", "outro"), "value" to 17.50),
    )
    for (map in mapList) {
        println(map)
        println(map["value"])
        println(map.filterValues { valor -> valor is Double && valor > 20 })
        map.forEach { (chave, valor) -> println("$chave - $valor") }
    }

    val pedidosList = listOf(
        Pedido(1, "lanche", "22.0".toBigDecimal()),
        Pedido(2, "pizza", "49.8".toBigDecimal()),
        Pedido(3, "suco", "8.5".toBigDecimal()),
        Pedido(4, "pastel", "5.3".toBigDecimal())
    )
    val mapPedidos = pedidosList.associateBy { pedidos -> pedidos.id }
    println(mapPedidos)
    val pedidosFreteGratis = pedidosList.associateWith { pedidos -> pedidos.valor > "10".toBigDecimal() }
    println(pedidosFreteGratis.filterValues { pedido -> pedido })

    val nomes = listOf("Mae","Pai","Bia","trOO","Bwolf","Gil","Gi","isAvailable","Thi Mendes","Thiago Russia","Lele").sorted()
    val agenda = nomes.groupBy { nome -> nome.first() }
    println(agenda)
    println(agenda['G']?.size)
}

data class Pedido(val id: Int, val item: String, val valor: BigDecimal)