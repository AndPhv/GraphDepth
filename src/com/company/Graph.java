package com.company;

public class Graph {
    public int amountV = 10;
    private int[][] matrix;
    Vertex[] vertexList;
    private int currentV;
    private GraphStack stack = new GraphStack();

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

    public int check(int v) {
        for (int i = 0; i < currentV; i++) {
            if (matrix[v][i] == 1 && vertexList[i].isVisited == false)
                return i;
        }
        return -1;
    }

    public void passInDeep(int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true;
        stack.push(index);

        while (!stack.isEmpty()) {
            int neigh = check(stack.peek());
            if (neigh == -1)
                neigh = stack.pop();
            else {
                System.out.println(vertexList[neigh].name);
                vertexList[neigh].isVisited = true;
                stack.push(neigh);
            }
        }
        for (int i = 0; i < currentV; i++) {
            vertexList[i].isVisited = false;
        }
    }
}
