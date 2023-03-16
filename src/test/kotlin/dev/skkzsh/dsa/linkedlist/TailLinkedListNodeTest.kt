package dev.skkzsh.dsa.linkedlist

import dev.skkzsh.dsa.linkedlist.TailLinkedListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TailLinkedListNodeTest {

    @Test
    fun append() {
        val n = TailLinkedListNode(100)
        n.append(101)
        n.append(102)
        n.append(103)

        // n.print() // debug

        assertEquals(100, n.at(0))
        assertEquals(101, n.at(1))
        assertEquals(102, n.at(2))
        assertEquals(103, n.at(3))
    }
}
