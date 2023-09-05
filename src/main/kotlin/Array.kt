fun main (){
    val arrayOf5 = Array<Int>(5){0}
    arrayOf5[0] = 4
    arrayOf5[1] = 3
    arrayOf5[2] = 2
    arrayOf5[3] = 1
    arrayOf5[4] = 0
    println(arrayOf5[3])

    val arrayOf = arrayOf(1,3,5,7)
    val arrayOfPlus = arrayOf.plus(4)
    println(arrayOf[0])
    println(arrayOfPlus[4])

    val arrayMultiTipeData = arrayOf(1, true, 1.0, "Bisa")
    // ada tipe data Any ???

    var tipeDataAny: Any
    // penggunaan tipe data Any sangat tidak di sarakan,
    // karena akan menyebabkan error cast execption saat runtime
    tipeDataAny = 2
    tipeDataAny = "Kotlin"
    tipeDataAny = true
}