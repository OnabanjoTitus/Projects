package com.ArrayAndListsManipulation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNewStackTest {
    MyNewStack myNewStack;

    @BeforeEach
    void setUp() {
        myNewStack= new MyNewStack();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatWeCanPushElementIntoAStack(){
        myNewStack.push(5);
        assertEquals(5,myNewStack.peek());
    }
    @Test
    void testThatWeCanPushElementsIntoAStack(){
        myNewStack.push(8);
        myNewStack.push(6);
        assertEquals(6,myNewStack.peek());
    }
    @Test
    void PushTwoElementsPopOneTest(){
        myNewStack.push(3);
        myNewStack.push(20);
        assertEquals(20,myNewStack.pop());
        assertEquals(3,myNewStack.peek());
        assertEquals(3,myNewStack.pop());
        assertTrue(myNewStack.isEmpty());

    }
    @Test
    void testThatStackShouldBeFull(){
        myNewStack.push(3);
        myNewStack.push(20);
        myNewStack.push(3);
        myNewStack.push(20);
        myNewStack.push(3);
        assertTrue(myNewStack.isFull());
    }
    @Test
    void pushOneElement_afterStackIsFull_ThrowsStackOverFlowException(){
        myNewStack.push(3);
        myNewStack.push(20);
        myNewStack.push(3);
        myNewStack.push(20);
        myNewStack.push(3);
        assertThrows(MyNewStack.StackOverFlowException.class,()->myNewStack.push(30));
    }
    @Test
    void removeLastElement_WhenStackIsEmpty(){
        assertTrue(myNewStack.isEmpty());
        assertThrows(MyNewStack.StackUnderFlowException.class,()->myNewStack.pop());


    }
    @Test
    void testThrowsExceptionForUnderFlowPeek(){
        assertTrue(myNewStack.isEmpty());
        assertThrows(MyNewStack.StackUnderFlowException.class,()->myNewStack.peek());
    }
}