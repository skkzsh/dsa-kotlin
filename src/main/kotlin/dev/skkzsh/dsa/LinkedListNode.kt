package dev.skkzsh.dsa

class LinkedListNode(private val value: Int, private var next: LinkedListNode? = null) {

    fun appendToHead(value: Int) {  // TODO
        val new = LinkedListNode(value)

        new.next = this
        // this = new

        throw UnsupportedOperationException("未実装")
    }

    fun appendToTail(value: Int) {
        val new = LinkedListNode(value)

        var n = this
        while (n.next != null) {
            n = n.next!!
        }

        n.next = new
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
