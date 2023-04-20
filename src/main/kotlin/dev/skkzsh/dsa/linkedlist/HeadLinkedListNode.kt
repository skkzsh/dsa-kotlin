package dev.skkzsh.dsa.linkedlist

// 単方向連結リスト
// 先頭に追加していく
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
        var n: HeadLinkedListNode? = this
        while (n != null) {
            print("${n.value} ")
            n = n.next
        }
        println()
    }
}
