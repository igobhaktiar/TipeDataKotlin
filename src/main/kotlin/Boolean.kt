fun  main (){
    val benar = true
    val salah = false

    val kondisi = 12 * 3 == 6*4
    println(kondisi)

    val  genderChar = 'L'
    println(genderChar is Char)

    val genderString = "L"
    println(genderString is String)

    val perbedaanChartoString = genderChar.toString() == genderString
    val perbedaanStringtoChar = genderChar == genderString.toCharArray()[0]

    println(perbedaanChartoString)
    println(perbedaanStringtoChar)

}