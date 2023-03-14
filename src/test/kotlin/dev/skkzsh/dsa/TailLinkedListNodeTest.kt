package dev.skkzsh.dsa

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

        assertEquals(100, n.get(0))
        assertEquals(101, n.get(1))
        assertEquals(102, n.get(2))
        assertEquals(103, n.get(3))
    }
}
