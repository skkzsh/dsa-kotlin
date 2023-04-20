package dev.skkzsh.dsa.linkedlist

// 単方向連結リスト
// 末尾に追加していく
open class TailLinkedListNode(val value: Int) : LinkedListNode {
    var next: TailLinkedListNode? = null
    protected var length: Int = 1

    // O(n)
    override fun append(value: Int) {
        val new = TailLinkedListNode(value)

        var n = this
        while (n.next != null) {
            n = n.next!!
        }

        n.next = new

        length++
    }

    override fun at(num: Int): Int {
        var n = this
        for (i in 0 until num) {
            n = n.next!!
        }
        return n.value
    }

    override fun print() {
        var n: TailLinkedListNode? = this
        while (n != null) {
            print("${n.value} ")
            n = n.next
        }
        println()
    }
    
    fun length(): Int {
        return length
    }
}
