/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class Main {

    public static void isiMenu() {
        System.out.println("******************************");
        System.out.println("    DATA BUKU PERPUSTAKAAN");
        System.out.println("******************************");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("******************************");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DLL2 doubleLL = new DLL2();
        int pilih, index;
        do {
            isiMenu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("                     Masukkan Judul Buku");
                    System.out.println("---------------------------------------------------------------");
                    String head = sc.nextLine();
                    doubleLL.push(head);
                    break;
                case 2:
                    System.out.println("-----------------------------------------");
                    System.out.println("Buku pada tumpukan teratas telah terambil");
                    System.out.println("-----------------------------------------");
                    doubleLL.pop();
                    break;
                case 3:
                    doubleLL.peek();
                    break;
                case 4:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("                  Cetak Seluruh Judul Buku");
                    System.out.println("---------------------------------------------------------------");
                    doubleLL.displayStack();
                    System.out.println("---------------------------------------------------------------");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
