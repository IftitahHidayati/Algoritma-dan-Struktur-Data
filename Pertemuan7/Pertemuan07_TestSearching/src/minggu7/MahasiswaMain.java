/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class MahasiswaMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        
        System.out.println("Masukkan : ");
        int jumMhs = s.nextInt();
        PencarianMhs data = new PencarianMhs(jumMhs);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
//            s.nextLine();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa ASC: ");
//        data.SelectionSearch();
        data.tampil();

        System.out.println("__________________________________________________");
        System.out.println("__________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("menggunakan Sequential Search");
        //     int posisi = data.FindSeqSearch(cari);
//        
//        data.Tampilposisi(cari, posisi);
//        data.TampilData(cari, posisi);
//        
        System.out.println("===========================");
        System.out.println("menggunakan Binary Search");
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        s.nextLine();
//        System.out.println("__________________________________________________");
//        System.out.println("__________________________________________________");
//        System.out.println("Pencarian Data : ");
//        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
//        System.out.print("Nama : ");
//        String cari2 = s.nextLine();
//        
//        System.out.println("==================================================");
//        System.out.println("menggunakan Sequential Search");
//        int posisi2 = data.FindSeqSearch2(cari2);
//
//        data.Tampilposisi2(cari2, posisi2);
//        data.TampilData2(cari2, posisi2);

    }
}
