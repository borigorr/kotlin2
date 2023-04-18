fun main(args: Array<String>) {
    val amount = 100
    if (amount < 35) {
        println("Минимальная сумма перевода 35 рублей.")
        return
    }
    var commission = amount * 0.0075
    if (commission < 35) {
        commission = 35.0
    }
    println("Комиссия - $commission")
}