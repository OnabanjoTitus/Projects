package com.ArrayAndListsManipulation;

public class MyNewStack {
    private int [] element=new int[5];
    private int lastLocationWritten=-1;

    public void push(int elementToPush) {
        try {
            element[++lastLocationWritten]=elementToPush;
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            throw new StackOverFlowException("Stack overflow");
        }

    }

    public int peek() {
        if(isEmpty()) throw new StackUnderFlowException("Stack is empty");
        return element[lastLocationWritten];
    }

    public int pop() {
        if(isEmpty())throw new StackUnderFlowException("Is empty");
        int lastElement=element[lastLocationWritten];
        element[lastLocationWritten--]=0;
        return lastElement;
    }

    public boolean isEmpty() {
    return (lastLocationWritten == -1);
    }

    public boolean isFull() {
        return (lastLocationWritten==(element.length-1));
    }
    public static class StackOverFlowException extends RuntimeException{
        public StackOverFlowException(String stack_overflow) {
            super(stack_overflow);
        }
    }
    public static class StackUnderFlowException extends RuntimeException{
        public StackUnderFlowException(String stack_overflow) {
            super(stack_overflow);
        }
    }
}

