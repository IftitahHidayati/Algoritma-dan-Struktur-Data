/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomer2;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class SLLMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL singLL = new SLL();
        String data, data2;
        int pilih;
        do {
            System.out.println("======================================");
            System.out.println("       MENU OPERASI LINKED LIST");
            System.out.println("======================================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data setelah posisi tertentu");
            System.out.println("4. Tambah data sebelum posisi tertentu");
            System.out.println("======================================");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Data : ");
                    data = sc.nextLine();
                    System.out.println("--------------------------------------");
                    singLL.addFirst(data);
                    singLL.print();
                    System.out.println("--------------------------------------");
                    break;
                case 2:
                    System.out.print("Data : ");
                    data = sc.nextLine();
                    System.out.println("--------------------------------------");
                    singLL.addLast(data);
                    singLL.print();
                    System.out.println("--------------------------------------");
                    break;
                case 3:
                    System.out.print("Data : ");
                    data = sc.nextLine();
                    System.out.print("Data setelah: ");
                    data2 = sc.nextLine();
                    System.out.println("--------------------------------------");
                    singLL.insertAfter(data2, data);
                    singLL.print();
                    System.out.println("--------------------------------------");
                    break;
                case 4:
                    System.out.print("Data : ");
                    data = sc.nextLine();
                    System.out.print("Data sebelum: ");
                    data2 = sc.nextLine();
                    System.out.println("--------------------------------------");
                    singLL.insertBefore(data2, data);
                    singLL.print();
                    System.out.println("--------------------------------------");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
