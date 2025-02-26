fun main() {
  
    val compras = mutableListOf<String>()

    while (true) {

        println("------------ Lista ---------")
        println("1. Mostrar lista")
        println("2. Adicionar item")
        println("3. Remover item")
        println("0. Sair")

        print("Escolha uma opção: ")
        when (readLine()!!.toInt()) {
            1 -> mostrarLista(compras)
            2 -> adicionarItem(compras)
            3 -> removerItem(compras)
            0 -> {
                println("---------------------")
                println("Saindo do programa...")
                return
            }
            else -> println("Opção inválida. Por favor, escolha uma opção válida.")
        }
    }
}

fun mostrarLista(lista: List<String>) {
    if (lista.isEmpty()) {
        println("A lista de compras está vazia.")
    } else {
        println("Lista de compras:")
        lista.forEachIndexed { index, item -> println("$index. $item") }
    }
}

fun adicionarItem(lista: MutableList<String>) {
    print("Digite o item que deseja adicionar: ")
    val item = readLine()!!
    if (!lista.contains(item)) {
        lista.add(item)
        println("Item '$item' adicionado à lista.")
        mostrarLista(lista)
    } else {
        println("O item '$item' já está na lista.")
    }
}

fun removerItem(lista: MutableList<String>) {
    if (lista.isEmpty()) {
        println("A lista de compras está vazia.")
        return
    }

    mostrarLista(lista)
    print("Digite o índice do item que deseja remover: ")
    val indice = readLine()!!.toInt()

    if (indice in lista.indices) {
        val itemRemovido = lista.removeAt(indice)
        println("Item '$itemRemovido' removido da lista.")
        mostrarLista(lista)
    } else {
        println("Índice inválido. Por favor, digite um índice válido.")
    }
}