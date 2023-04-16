package dev.skkzsh.dsa.linkedlist

class HeadLinkedListNode(private val value: Int) : LinkedListNode {
    private var next: HeadLinkedListNode? = null

    // O(1)
    override fun append(value: Int) {  // TODO
        val new = HeadLinkedListNode(value)

        new.next = this
        // this = new

        throw UnsupportedOperationException("未実装")
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
            print(n.value.toString() + " ")
            n = n.next!!
        }
        println(n.value)
    }
}
