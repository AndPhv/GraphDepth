package com.company;

public class GraphStack<T> implements Stack<T> {
    private int size = 10;
    private int top;
    private int[] array;

    public GraphStack() {
        array = new int[size];
        top = -1;
    }

    @Override
    public void push(int T) {
        array[++top] = T;
    }

    @Override
    public int pop() {
        return array[top--];
    }

    @Override
    public int peek() {
        return array[top];
    }

    @Override
    public boolean isEmpty() {
        if (top == -1)
            return true;
            else
                return false;
    }
}
