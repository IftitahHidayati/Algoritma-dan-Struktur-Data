/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2_Prak;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class MahasiswaMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.print("Masukkan jumlah data : ");
        int jumMhs = s.nextInt();
        PencarianMhs data = new PencarianMhs(jumMhs);

        System.out.println("=====================================================");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil");
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

//        System.out.println("=====================================================");
//        System.out.println("        Data keseluruhan Mahasiswa Ascending");
//        System.out.println("=====================================================");
//        data.SelectionSearch();
//        data.tampil();

        s.nextLine();
        System.out.println("=====================================================");
        System.out.println("                  Pencarian Data");
        System.out.println("=====================================================");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cari2 = s.nextLine();
        System.out.println("---------------------------------");
        System.out.println("  menggunakan Sequential Search");
        System.out.println("---------------------------------");
        int posisi2 = data.FindSeqSearch2(cari2);
        data.Tampilposisi2(cari2, posisi2);
        data.TampilData2(cari2, posisi2);

//        Jika terdapat nama yang sama dengan NIM yang berbeda pada indeks yang berbeda pula, maka output atau
//        yang muncul pada pencarian akan tampil nama pada indeks yang paling kecil daripada di indeks yang lebih besar
//        karena menggunakan sistem break pada Find Sequential Search, yang dimana akan berhenti atau keluar 
//        dari pencarian jika ada data nama yang sudah ditemukan walaupun ada nama yang sama didata berikutnya.
    }
}
