package dev.skkzsh.dsa

class HeadLinkedListNode(private val value: Int, private var next: HeadLinkedListNode? = null) {

    // O(1)
    fun append(value: Int) {  // TODO
        val new = HeadLinkedListNode(value)

        new.next = this
        // this = new

        throw UnsupportedOperationException("未実装")
    }

    fun get(num: Int): Int {
        var n = this
        for (i in 0 until num) {
            n = n.next!!
        }
        return n.value
    }

    fun print() {  // FIXME
        var n = this
        while (n.next != null) {
            println(n.value)
            n = n.next!!
        }
    }
}