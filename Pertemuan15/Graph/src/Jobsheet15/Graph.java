/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet15;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class Graph<T> {

    int vertex;
//    boolean typegraph;
    LinkedLists<T> list[];

    public Graph(int vertex) {
        this.vertex = vertex;
//        this.typegraph = typegraph;
        list = new LinkedLists[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedLists();
        }
    }

    public void addEdge(int index, int index2, String source, String destination) {
//        if (graphType(typegraph)) {
//            list[source].addFirst(destination);
//        } else {
//        add edge
            list[index].addFirst(destination);
//        add back edge (for undirected)
            list[index2].addFirst(source);
//        }
    }

    public void degree(int source) throws Exception {
//        degree undirected graph
        System.out.println("degree vertex " + source + " : " + list[source].size());
//        if (graphType(typegraph)) {
//          degree directed graph
//          inDegree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j).equals(source)) {
                        ++totalIn;
                    }
                }
//          outDegree
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
//        } else {
//            degree undirected graph
//            System.out.println("degree vertex " + source + " : " + list[source].size());
//        }
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    boolean graphType(boolean pilih) {
        return pilih;
    }
}
