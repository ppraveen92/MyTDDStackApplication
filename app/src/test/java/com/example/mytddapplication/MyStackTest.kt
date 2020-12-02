package com.example.mytddapplication

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test
import java.util.*


class MyStackTest {
    private var stack: MyStack? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        stack = MyStack()
    }

    @Test
    fun `size Of Stack Should Be Zero`() {
        assertThat("New stack should be empty", stack?.size(), `is`(0))
    }

    @Test
    fun `pushing One Value to Stack`() {
        stack?.push(1)
        assertThat("Now size of the stack should be one", stack?.size(), `is`(1))
    }

    @Test
    fun `pushing Two Value to Stack`() {
        stack?.push(1)
        stack?.push(2)
        assertThat("Now size of the stack should be two", stack?.size(), `is`(2))
    }

    @Test
    fun `push One Pop One Value On Stack`() {
        stack?.push(1)
        val popReturnValue = stack?.pop()
        assertThat(
            "Now size should be zero, since we popped the value which we pushed before",
            stack?.size(),
            `is`(0)
        )
        assertThat(
            "The value which we pushed is one , so after pop that value assigned to this variable",
            popReturnValue,
            `is`(1)
        )
    }

    @Test
    fun `push One And Peek`() {
        stack?.push(1)
        assertThat(
            "Value 1 is pushed , when we peek then the same 1 should be returned",
            stack?.peek(),
            `is`(1)
        )
    }

    @Test(expected = EmptyStackException::class)
    fun `peek On Empty Stack`() {
        stack?.peek()
    }

    @Test(expected = EmptyStackException::class)
    fun `pop On Empty Stack`() {
        stack?.pop()
    }

    @Test
    fun `empty Stack`() {
        assertThat("checking stack is empty, returns true if it is", stack?.isEmpty(), `is`(true))
    }

    @Test
    fun `populated Stack`() {
        stack?.push(1)
        assertThat(
            "is empty will return false , if stack is with some data", stack?.isEmpty(), `is`(false)
        )
    }

}