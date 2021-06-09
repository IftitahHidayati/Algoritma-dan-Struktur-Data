/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet15;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class MainGraph {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(6);
        
//      0 Malang        3 Bandung
//      1 Surabaya      4 Sidoarjo
//      2 Gresik        
        graph.addEdge(0, 1, "Malang", "Surabaya");
        graph.addEdge(0, 4, "Malang", "Sidoarjo");
        graph.addEdge(1, 2, "Surabaya", "Gresik");
        graph.addEdge(1, 3, "Surabaya", "Bandung");
        graph.addEdge(1, 4, "Surabaya", "Sidoarjo");
        graph.addEdge(2, 3, "Gresik", "Bandung");
        graph.addEdge(3, 4, "Bandung", "Sidoarjo");
        graph.addEdge(3, 0, "Bandung", "Malang");
        System.out.println("");
        graph.printGraph();
        graph.degree(2);
    //  Memanggil method removeEdge
        graph.removeEdge(1, 2);
        graph.printGraph();
        
//        int count = 1, to, from, pilih;
//        boolean jenis;
//        
//        System.out.println("Pilih jenis Graph");
//        System.out.println("1. Direct");
//        System.out.println("2.Undirect");
//        System.out.print("pilih : ");
//        pilih = sc.nextInt();
//        if (pilih == 1) {
//            System.out.println("Menggunakan Directed");
//            jenis = true;
//        } else {
//            System.out.println("Menggunakan Undirected");
//            jenis = false;
//        }
//        System.out.println("");
//        Graph graph = new Graph(6, jenis);
////        menginputkan jumlah lintasan yang diinginkan
//        System.out.print("Masukkan jumlah inputan lintasan :");
//        int jumlah = sc.nextInt();
//        System.out.println("------------------------------------");
////        memasukkan edges yang dibutuhkan;
//        System.out.println("Masukkan edges: ");
//        while (count <= jumlah) {
//            to = sc.nextInt();
//            from = sc.nextInt();
//            graph.addEdge(to, from);
//            count++;
//        }
//        System.out.println("");
//        graph.printGraph(); //memanggil method printGraph
//        graph.degree(2); //memanggil method degree
////        memanggil method removeEdge;
//        graph.removeEdge(3, 4);
//        graph.printGraph();
        
//  ============== No 1 & 2================
//        String status;
//        Graph graph = new Graph(6);
//        System.out.println("Pilih tipe Graph");
//        System.out.println("1. Direct");
//        System.out.println("2.Undirect");
//        System.out.print("pilih : ");
//        int pilih=sc.nextInt();
////        graph.graphType(pilih);
//        
//        do {
//            System.out.print("Masukkan Source: ");
//            int source = sc.nextInt();
//            System.out.print("Masukkan Destination: ");
//            int desti = sc.nextInt();
//            graph.addEdge(source, desti);
//            sc.nextLine();
//            System.out.print("Ingin berhenti? (Y/T) : ");
//            status = sc.nextLine();
//
//        } while ("T".equals(status));
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);
//        graph.addEdge(3, 0);
//        graph.printGraph();
//        graph.degree(2);
//
//        System.out.println("");
//        graph.removeEdge(1, 4);
//        graph.printGraph();
    }
}
