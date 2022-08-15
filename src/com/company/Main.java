package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Graph graph = new Graph();

        print(graph);
    }
    public static void print(Graph graph) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.println("Введите количество вершин в графе - ");
        graph.amountV = scanner.nextInt();

        for (int i = 0; i < graph.amountV; i++) {
            System.out.println("Введите вершину - ");
            graph.addVertex(scanner.next());
            System.out.println("Номер вершины равен " + i);
        }
        for (int i = 0; i < graph.amountV; i++) {
            System.out.println("Соединить вершину ");
            x = scanner.nextInt();
            System.out.println(" с вершиной ");
            y = scanner.nextInt();
            graph.addEdge(x, y, 1);
        }
        graph.passInDeep(0);
    }
}
