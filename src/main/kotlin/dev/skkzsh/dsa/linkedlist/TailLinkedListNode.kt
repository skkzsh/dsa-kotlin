package dev.skkzsh.dsa.linkedlist

class TailLinkedListNode(private val value: Int) {
    private var next: TailLinkedListNode? = null

    // O(n)
    fun append(value: Int) {
        val new = TailLinkedListNode(value)

        var n = this
        while (n.next != null) {
            n = n.next!!
        }

        n.next = new
    }

    fun at(num: Int): Int {
        var n = this
        for (i in 0 until num) {
            n = n.next!!
        }
        return n.value
    }

    fun print() {
        var n = this
        while (n.next != null) {
            println(n.value)
            n = n.next!!
        }
        println(n.value)
    }
}
