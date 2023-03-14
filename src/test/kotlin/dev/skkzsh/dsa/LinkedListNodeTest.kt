package dev.skkzsh.dsa

import org.junit.jupiter.api.Test
import kotlin.test.Ignore
import kotlin.test.assertEquals

class LinkedListNodeTest {

    @Ignore
    @Test
    fun appendToHead() {
        val n = LinkedListNode(100)
        n.appendToHead(101)
        n.appendToHead(102)
        n.appendToHead(103)

        // n.print() // debug

        assertEquals(103, n.get(0))
        assertEquals(102, n.get(1))
        assertEquals(101, n.get(2))
        assertEquals(100, n.get(3))
    }
    @Test
    fun appendToTail() {
        val n = LinkedListNode(100)
        n.appendToTail(101)
        n.appendToTail(102)
        n.appendToTail(103)

        // n.print() // debug

        assertEquals(100, n.get(0))
        assertEquals(101, n.get(1))
        assertEquals(102, n.get(2))
        assertEquals(103, n.get(3))
    }
}
