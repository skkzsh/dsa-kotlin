package dev.skkzsh.dsa.linkedlist

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TailLinkedListNodeTest {

    private val n = TailLinkedListNode(100)

    @BeforeEach
    fun setUp() {
        n.append(101)
        n.append(102)
        n.append(103)

        // n.print() // debug
    }

    @Test
    fun append() {
        assertEquals(4, n.length())
        assertEquals(100, n.at(0))
        assertEquals(101, n.at(1))
        assertEquals(102, n.at(2))
        assertEquals(103, n.at(3))
    }

    // @Test
    // fun delete() {
    //     n.delete(n.at(2))

    //     // n.print() // debug

    //     assertEquals(3, n.length())
    //     assertEquals(100, n.at(0))
    //     assertEquals(101, n.at(1))
    //     assertEquals(103, n.at(2))
    // }
}
