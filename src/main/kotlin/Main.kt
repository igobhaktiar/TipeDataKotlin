fun main() {
        val bilanganBulat = 0 // secara default integer
        val bilanganDecimal = 0.0 // secara default double

        println(bilanganBulat is Int)
        println(bilanganDecimal is Double)

        val bilanganByte: Byte = 0
        println(bilanganByte is Byte)

        val bilanganShort: Short = 0
        println(bilanganShort is Short)

        // untuk membedakan nilai init antara integer dengan long
        // diperlukan nilai 'L' setelah bilangan bulat untuk tipe data Long
        var bilanganBulatLong = 0L

        bilanganBulatLong = 10L  // kita kasih nilai long??
        // tidak bisa kalau init variable pertama bukan long

        println(bilanganBulatLong is Long)

        /*
        Umur Manusia
        0 - 80 ....
        Byte
         */
    }