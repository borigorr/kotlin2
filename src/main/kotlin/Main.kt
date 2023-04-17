fun main(args: Array<String>) {
    val amount = 100
    if (amount < 75) {
        println("Минимальная сумма перевода 35 рублей.")
        return
    }
    println("Комиссия - ${amount * 0.0075}")
}