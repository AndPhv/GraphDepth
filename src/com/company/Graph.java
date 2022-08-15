package com.company;

public class Graph {
    public int amountV = 10;
    private int[][] matrix;
    Vertex[] vertexList;
    private int currentV;


    public Graph() {
        vertexList = new Vertex[amountV];
        matrix = new int[amountV][amountV];
        currentV = 0;
    }
}
