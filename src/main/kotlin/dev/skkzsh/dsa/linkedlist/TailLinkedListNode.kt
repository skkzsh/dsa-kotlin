package dev.skkzsh.dsa.linkedlist

open class TailLinkedListNode(private val value: Int) : LinkedListNode {
    private var next: TailLinkedListNode? = null

    // O(n)
    override fun append(value: Int) {
        val new = TailLinkedListNode(value)

        var n = this
        while (n.next != null) {
            n = n.next!!
        }

        n.next = new
    }

    override fun at(num: Int): Int {
        var n = this
        for (i in 0 until num) {
            n = n.next!!
        }
        return n.value
    }

    override fun print() {
        var n = this
        while (n.next != null) {
            println(n.value)
            n = n.next!!
        }
        println(n.value)
    }
}
