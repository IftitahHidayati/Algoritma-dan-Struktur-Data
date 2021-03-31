/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1_Prak;


import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class MahasiswaMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumMhs = s.nextInt();
        PencarianMhs data = new PencarianMhs(jumMhs);

        System.out.println("=====================================================");
        System.out.println("Masukkan Data Mahasiswa secara Urut dari NIM Terkecil");
        System.out.println("=====================================================");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("------------------");
            System.out.print("NIM\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("=====================================================");
        System.out.println("        Data keseluruhan Mahasiswa Ascending : ");
        System.out.println("=====================================================");
        data.SelectionSearch();
        data.tampil();

        System.out.println("=====================================================");
        System.out.println("                Pencarian Data");
        System.out.println("=====================================================");
        System.out.println("Masukkan NIM Mahasiswa yang dicari ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("---------------------------------");
        System.out.println("  Menggunakan Sequential Search");
        System.out.println("---------------------------------");
        int posisi = data.FindSeqSearch(cari);

        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        
        System.out.println("---------------------------------");
        System.out.println("    Menggunakan Binary Search");
        System.out.println("---------------------------------");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        s.nextLine();
    }
}
