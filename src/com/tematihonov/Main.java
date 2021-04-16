package com.tematihonov;

public class Main {

    public static void main(String[] args) {
	// Task 7.1 Приведите пример графа.
    // Московский метрополитен
    // Task 7.2 Реализуйте базовые методы графа.
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');

        graph.addEdge(1,3);
        graph.addEdge(3,5);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(4,5);
        graph.addEdge(6,7);
        graph.addEdge(3,7);


    // Task 7.3 В программный код из задания 7.2 добавьте реализацию метода обхода в глубину.
        long startTime = System.nanoTime();
        graph.dfs();
        long endTime = System.nanoTime();
        System.out.println("Время обхода в глубину: " + (endTime - startTime));


    // Task 7.4 В базовом графе из задания 7.2 реализуйте метод обхода в ширину.
        startTime = System.nanoTime();
        graph.bfs();
        endTime = System.nanoTime();
        System.out.println("Время обхода в ширину: " + (endTime - startTime));

    }
}
