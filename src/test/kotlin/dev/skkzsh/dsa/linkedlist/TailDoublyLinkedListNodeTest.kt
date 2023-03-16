package dev.skkzsh.dsa.linkedlist

import dev.skkzsh.dsa.linkedlist.TailDoublyLinkedListNode
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TailDoublyLinkedListNodeTest {

    private val n = TailDoublyLinkedListNode(100)

    @BeforeEach
    fun setUp() {
        n.append(TailDoublyLinkedListNode(101))
        n.append(TailDoublyLinkedListNode(102))
        n.append(TailDoublyLinkedListNode(103))

        // n.print() // debug
    }

    @Test
    fun append() {
        assertEquals(100, n.at(0).value)
        assertEquals(101, n.at(1).value)
        assertEquals(102, n.at(2).value)
        assertEquals(103, n.at(3).value)
    }

    @Test
    fun delete() {
        n.delete(n.at(2))

        // n.print() // debug

        assertEquals(100, n.at(0).value)
        assertEquals(101, n.at(1).value)
        assertEquals(103, n.at(2).value)
    }
}
