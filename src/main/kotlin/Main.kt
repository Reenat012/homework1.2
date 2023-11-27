fun main() {
    val amount: Int = 1000 //сумма перевода в рублях
    val percentCommission: Double = 0.0075 //коммисия за перевод в %

    val valueCommisuon = if (amount * percentCommission < 35) 35 + amount
        else amount * percentCommission + amount //сумма перевода с коммисией в копейках

    println(valueCommisuon)
}