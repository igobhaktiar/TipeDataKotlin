fun main(){
    val nilai = 100L
    val umur = 12
    val apakahbenar = 100 == 80

    val carriageReturn = "Contoh penggunaan \rMengabaikan nilai sebelum nya, dan mengambil nilai setelahnya"
    println(carriageReturn)

    val petikTiga = """
                Satu
        Dua
Tiga
        
    Empat
                Lima
    """
    println(petikTiga)
    println(petikTiga.trimIndent())
    println(petikTiga.trim()) // memotong whitespace di depan dan di belakang

    val contohTrim = "   bla bla    "
    println(contohTrim)
    println(contohTrim.trim())

    // apabila variable char atau string diisi dengan angka, apakah variable tersebut bisa di compare atau di operasikan dengan variable dengan tipe number?
    val contohZain = '0'
    val contohNumberZain = 0
    // contohZain == contohNumberZain // tidak bisa, harus di compare dengan tipe data yang sama
    println("Contoh compare ${contohZain.toString().toInt() == contohNumberZain}")
}