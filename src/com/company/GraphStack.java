package com.company;

public class GraphStack {
    private int size = 10;
    private int top;
    private int[] array;

    public GraphStack() {
        array = new int[size];
        top = -1;
    }
}
