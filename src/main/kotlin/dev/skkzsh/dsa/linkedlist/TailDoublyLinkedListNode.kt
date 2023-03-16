package dev.skkzsh.dsa.linkedlist

class TailDoublyLinkedListNode(val value: Int) {
    private var next: TailDoublyLinkedListNode? = null
    private var prev: TailDoublyLinkedListNode? = null

    // O(n)
    fun append(new: TailDoublyLinkedListNode) {
        var n = this
        while (n.next != null) {
            n = n.next!!
        }

        n.next = new
        new.prev = n
    }

    fun delete(n: TailDoublyLinkedListNode) {
        n.prev?.next = n.next
        n.next?.prev = n.prev
    }

    fun at(num: Int): TailDoublyLinkedListNode {
        var n = this
        for (i in 0 until num) {
            n = n.next!!
        }
        return n
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
