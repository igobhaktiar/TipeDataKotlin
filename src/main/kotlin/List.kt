fun main() {
    // buat list immutable
    var listImmutable = listOf(0)
    var newListImmutable = listImmutable.plus(4)
    println(listImmutable)
    println(newListImmutable)
    listImmutable = listOf(0, 4, 5)
    println(listImmutable)

    // buat lit mutable
    val listMutable = mutableListOf(0)
    println(listMutable)
    listMutable.add(7) // menambahkan nilai pada index terakhir
    listMutable.add(6)
    listMutable.add(0, 6) // meambahkan nilai pada index 0
    println(listMutable)
    listMutable.remove(5) // untuk meremove nilai 5 di dalam list

}