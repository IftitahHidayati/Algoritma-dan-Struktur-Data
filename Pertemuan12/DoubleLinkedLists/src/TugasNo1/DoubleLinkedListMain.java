/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class DoubleLinkedListMain {
    public static void isiMenu() {
        System.out.println("==================================================");
        System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLY LINKED LIST");
        System.out.println("==================================================");
        System.out.println("1. Tambah head");
        System.out.println("2. Tambah tail");
        System.out.println("3. Tambah data");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut Data");
        System.out.println("10. Keluar");
        System.out.println("==================================================");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists doubleLL = new DoubleLinkedLists();
        int pilih,index;
        do {
            isiMenu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data posisi Head");
                    int head = sc.nextInt();
                    doubleLL.addFirst(head);
                    break;
                case 2:
                    System.out.println("Masukkan data posisi Tail");
                    int tail = sc.nextInt();
                    doubleLL.addLast(tail);
                    break;
                case 3:
                    System.out.println("Masukkan Data");
                    System.out.print("Data Node      : ");
                    int data = sc.nextInt();
                    System.out.print("Alamat Pointer : ");
                    index = sc.nextInt();
                    doubleLL.add(data, index);
                    break;
                case 4:
                    doubleLL.removeFirst();
                    break;
                case 5:
                    doubleLL.removeLast();
                    break;
                case 6:
                    System.out.println("------------------------------------------");
                    System.out.print("Masukkan Index data yang ingin dihapus: ");
                    index = sc.nextInt();
                    System.out.println("------------------------------------------");
                    doubleLL.remove(index);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("------------");
                    System.out.println(" Cetak Data");
                    System.out.println("------------");
                    doubleLL.print();
                    System.out.println("------------");
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("-------------------------------");
                    System.out.println("         Cari Data");
                    System.out.println("-------------------------------");
                    System.out.print("Masukkan nilai yang dicari: ");
                    int nilai = sc.nextInt();
                    if (doubleLL.FindSeqSearch(nilai) == -1) {
                        System.out.println("-------------------------------");
                        System.out.println("      Data Tidak Ditemukan");
                        System.out.println("-------------------------------");
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("Data " + nilai + " berada di node ke-" + doubleLL.FindSeqSearch(nilai));
                        System.out.println("-------------------------------");
                    }
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("----------------");
                    System.out.println("Urut Data - Desc");
                    System.out.println("----------------");
                    doubleLL.BubbleSort();
                    System.out.println("----------------");
                    System.out.println("");
                    break;
            }
        }  while (pilih != 10);
    }
}
