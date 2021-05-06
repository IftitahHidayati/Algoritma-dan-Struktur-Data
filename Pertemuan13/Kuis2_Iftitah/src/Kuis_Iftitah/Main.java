/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis_Iftitah;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        DLL dll = new DLL();

        char pilih = 0;
        int pilih2;
        do {
            int menu, idx;
            String nim, nama, jurusan, prodi;
            double ipk;
            System.out.println("====================================");
            System.out.println("  SISTEM PENGOLAHAN DATA MAHASISWA");
            System.out.println("====================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akir");
            System.out.println("3. Tambah Data Indeks Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Temukan data Mahasiswa urutan pertama");
            System.out.println("9. Cari NIM");
            System.out.println("10. Urut Data IPK");
            System.out.println("11.Keluar");
            System.out.println("====================================");
            System.out.print("Masukkan Pilihan Menu\t: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println(" Masukkan Data Mahasiswa Posisi Awal");
                    System.out.println("-------------------------------------");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("Jurusan\t: ");
                    jurusan = input.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    System.out.println("-------------------------------------");
                    Mahasiswa data = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    dll.addFirst(data);
                    System.out.println("");
                    pilih = 'y';
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("Masukkan Data Mahasiswa Posisi Akhir");
                    System.out.println("-------------------------------------");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("Jurusan\t: ");
                    jurusan = input.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    System.out.println("-------------------------------------");
                    Mahasiswa dt = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    dll.addLast(dt);
                    System.out.println("");
                    pilih = 'y';
                    break;
                case 3:
                    System.out.println("---------------------------------------------------");
                    System.out.println("     Masukkan Data Mahasiswa di Posisi Tertentu");
                    System.out.println("---------------------------------------------------");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("Jurusan\t: ");
                    jurusan = input.nextLine();
                    System.out.print("Prodi\t: ");
                    prodi = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    Mahasiswa d = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    System.out.print("Data Mahasiswa ini akan dimasukkan di indeks ke-");
                    idx = sc.nextInt();
                    System.out.println("---------------------------------------------------");
                    dll.add(d, idx);
                    System.out.println("");
                    pilih = 'y';
                    break;
                case 4:
                    dll.removeFirst();
                    System.out.println("");
                    pilih = 'y';
                    break;
                case 5:
                    dll.removeLast();
                    System.out.println("");
                    pilih = 'y';
                    break;
                case 6:
                    System.out.print("Masukkan posisi indeks : ");
                    idx = sc.nextInt();
                    dll.remove(idx);
                    System.out.println("");
                    pilih = 'y';
                    break;
                case 7:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("       Cetak Data");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
                    dll.print();
                    System.out.println("");
                    pilih = 'y';
                    break;

                case 8:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("   Cetak Data Pertama");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
                    dll.dataPertama();
                    pilih = 'y';
                    break;

                case 9:
                    System.out.println("------------------------------------");
                    System.out.println("       Cari Data dengan NIM");
                    System.out.println("------------------------------------");
                    System.out.print("Masukkan NIM yang dicari : ");
                    nim = input.nextLine();
                    System.out.println("------------------------------------");
                    dll.seqSearch(nim);
                    pilih = 'y';
                    break;

                case 10:
                    System.out.println("------------------------------------");
                    System.out.println("            Pilih Sorting");
                    System.out.println("------------------------------------");
                    System.out.println("1.) Ascending (terkecil-terbesar)");
                    System.out.println("2.) Descending (terbesar-terkecil)");
                    System.out.println("------------------------------------");
                    System.out.print("Pilih : ");
                    pilih2 = sc.nextInt();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Cetak Data setelah diSort");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
                    dll.bubbleSort(pilih2);
                    dll.print();
                    System.out.println("");
                    pilih = 'y';
                    break;
                case 11:
                    System.out.println("--------------------");
                    System.out.println("ANDA KELUAR PROGRAM!");
                    System.out.println("--------------------");
                    System.out.println("");
                    pilih = 'n';
                    break;
            }
        } while (pilih == 'y');
    }
}
