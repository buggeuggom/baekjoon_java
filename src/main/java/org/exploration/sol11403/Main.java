package org.exploration.sol11403;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static class Node implements Comparable<Node>{
        int weight;
        int endNode;

        Node(int weight, int endNode) {
            this.weight = weight;
            this.endNode = endNode;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<List<Node>> graph = new ArrayList<>();
        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Node(c, b));
            graph.get(b).add(new Node(c, a));
        }

        var visited = new boolean[N + 1];

        var priorityQueue = new PriorityQueue<Node>();
        priorityQueue.add(new Node(0,1));
        int totalWeight = 0;

        while (!priorityQueue.isEmpty()){
            Node current = priorityQueue.poll();
            int currentWeight = current.weight;
            int currentNode = current.endNode;

            if (visited[currentNode]) continue;

            totalWeight += currentWeight;
            visited[currentNode] = true;

            for (Node neighbor : graph.get(currentNode)) {
                if (!visited[neighbor.endNode]) {
                    priorityQueue.add(neighbor);
                }
            }
        }
        System.out.println(totalWeight);
        sc.close();
    }
}
