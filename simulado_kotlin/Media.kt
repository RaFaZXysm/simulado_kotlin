fun main() {

    print("Digite a quantidade de notas: ")
    var qNotas = readLine()!!.toInt()

    var notas = mutableListOf<Double>()

    for (i in 1..qNotas) {
        print("Digite a nota $i: ")
        var nota = readLine()!!.toDouble()
        notas.add(nota)
    }

    var media = notas.average()

    println("A média das notas é: $media")
}