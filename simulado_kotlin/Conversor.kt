fun main() {

    val taxaRealParaDolar = 4.95
    val taxaRealParaEuro = 5.38
    val taxaDolarParaEuro = 1.10


    println("Moedas Existentes:")
    println("BRL - Real R$")
    println("USD - Dólar $")
    println("EUR - Euro  ?")

    print("Informe a moeda origem (BRL, USD, EUR): ")
    var moedaInicial = readLine()!!.uppercase()

    print("Informe a moeda destino (BRL, USD, EUR): ")
    var moedaFinal = readLine()!!.uppercase()

    print("Informe  a quantia em USD: ")
    val quantidade = readLine()!!.toDouble()

    val valorConvertido = when {
        moedaInicial == "BRL" && moedaFinal == "USD" -> quantidade / taxaRealParaDolar
        moedaInicial == "BRL" && moedaFinal == "EUR" -> quantidade / taxaRealParaEuro
        moedaInicial == "USD" && moedaFinal == "BRL" -> quantidade * taxaRealParaDolar
        moedaInicial == "USD" && moedaFinal == "EUR" -> quantidade * (1 / taxaDolarParaEuro)
        moedaInicial == "EUR" && moedaFinal == "BRL" -> quantidade * taxaRealParaEuro
        moedaInicial == "EUR" && moedaFinal == "USD" -> quantidade * taxaDolarParaEuro
        else -> quantidade
    }

println("O valor em BRL é: %.2f".format(valorConvertido))
}