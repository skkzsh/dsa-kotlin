package dev.skkzsh.dsa.linkedlist

class TailDoublyLinkedListNode(val value: Int) {
    private var next: TailDoublyLinkedListNode? = null
    private var prev: TailDoublyLinkedListNode? = null
    private var length: Int = 1

    // O(n)
    fun append(new: TailDoublyLinkedListNode) {
        var n = this
        while (n.next != null) {
            n = n.next!!
        }

        n.next = new
        new.prev = n

        length++
    }

    fun delete(n: TailDoublyLinkedListNode) {
        n.prev?.next = n.next
        n.next?.prev = n.prev
        length--
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
            print(n.value.toString() + " ")
            n = n.next!!
        }
        println(n.value)
    }

    fun length(): Int {
        return length
    }
}
