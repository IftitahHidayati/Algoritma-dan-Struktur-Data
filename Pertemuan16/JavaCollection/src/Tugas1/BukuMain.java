/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Iftitah Hidayati
 */
public class BukuMain {

    static void menu() {
        System.out.println("============================");
        System.out.println("   DATA BUKU PERPUSTAKAAN");
        System.out.println("============================");
        System.out.println("1. Enrty Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("****************************");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        int pilihan;
        Stack<StackBuku> stack = new Stack<StackBuku>();
        String isbn;
        String judul;
        int terbit;
        String penerbit;
        StackBuku b1 = new StackBuku("Y1C 001", "3D Computer Vision", 2010, "Magna PC");
        StackBuku b2 = new StackBuku("Y1C 002", "Understanding Software", 2011, "Est Foundtion");
        StackBuku b3 = new StackBuku("Y1C 003", "Algoritma Notes For Professional", 2012, "Turpis Nec LLC");
        StackBuku b4 = new StackBuku("Y1C 004", "Getting Started with C++ Audio Programming for game Developer", 2013, "Est Foundaation");
        StackBuku b5 = new StackBuku("Y1C 005", "Practical digital Forencis", 2014, "Eu LLC");
        stack.push(b1);
        stack.push(b2);
        stack.push(b3);
        stack.push(b4);
        stack.push(b5);

        do {
            menu();
            System.out.print("Pilih : ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("--------------------------------");
                    System.out.print("Isbn         : ");
                    isbn = scs.nextLine();
                    System.out.print("Judul        : ");
                    sc.nextLine();
                    judul = sc.nextLine();
                    System.out.print("Terbit       : ");
                    terbit = sc.nextInt();
                    System.out.print("Penerbit     : ");
                    sc.nextLine();
                    penerbit = sc.nextLine();
                    System.out.println("--------------------------------");
                    StackBuku bNew = new StackBuku(isbn, judul, terbit, penerbit);
                    stack.push(bNew);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("-------------------------------------------------------------------------------------------");
                    StackBuku bukuPop = stack.pop();
                    System.out.println("Buku {isbn = " + bukuPop.isbn + ", judul = " + bukuPop.judul + ", terbit = "
                            + bukuPop.terbit + ", penerbit = " + bukuPop.penerbit + "}");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("-------------------------------------------------------------------------------------------");
                    StackBuku bukuPeek = stack.peek();
                    System.out.println("Buku {isbn = " + bukuPeek.isbn + ", judul = " + bukuPeek.judul + ", terbit = "
                            + bukuPeek.terbit + ", penerbit = " + bukuPeek.penerbit + "}");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    for (StackBuku buku : stack) {
                        System.out.println("Buku{isbn = " + buku.isbn + ", judul = " + buku.judul + ", terbit = " + buku.terbit
                                + ", penerbit = " + buku.penerbit + "}");
                    }
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    break;
                default:
                    break;
            }
        } while (pilihan
                != 5);
    }
}