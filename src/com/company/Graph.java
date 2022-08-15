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

    public void addVertex(String name) {
        vertexList[currentV++] = new Vertex(name);
    }

    public void addEdge(int start, int end, int value) {
        matrix[start][end] = 1;
        matrix[end][start] = value;
    }
}
