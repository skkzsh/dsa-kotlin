package dev.skkzsh.dsa.linkedlist

interface LinkedListNode {
    fun append(value: Int)
    // fun delete(n: LinkedListNode)  // TODO
    fun at(num: Int): Int
    fun print()
}
