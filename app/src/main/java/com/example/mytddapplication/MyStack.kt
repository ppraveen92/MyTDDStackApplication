package com.example.mytddapplication

import java.util.*
import kotlin.collections.ArrayList

class MyStack {
    val stack = ArrayList<Int>()

    fun size(): Int {
        return stack.size
    }

    fun push(i: Int) {
        stack.add(i)
    }

    fun pop(): Int {
        validateStackIsNotEmpty()
        return stack.removeAt(stack.size - 1)
    }

    private fun validateStackIsNotEmpty() {
        if (stack.size == 0) throw EmptyStackException()
    }

    fun peek(): Int {
        validateStackIsNotEmpty()
        return stack[stack.size - 1]
    }

    fun isEmpty(): Boolean {
        return stack.size == 0
    }

}