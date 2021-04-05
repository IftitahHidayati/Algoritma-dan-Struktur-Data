/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class PemilihanMain {

    public static void main(String[] args) {
        Scanner iftitah = new Scanner(System.in);
        Pemilihan pem = new Pemilihan();
        String kandidat = null;
        System.out.println("=====================================================");
        System.out.println("           PEMILIHAN KETUA BEM TAHUN 2020");
        System.out.println("=====================================================");
        System.out.println("----------------- Daftar Kandidat -------------------");
        System.out.println(" 1. Haris");
        System.out.println(" 2. Dian");
        System.out.println(" 3. Rani");
        System.out.println(" 4. Bisma");
        System.out.println("-----------------------------------------------------");
        System.out.println("=====================================================");
        System.out.print(" Masukkan jumlah pemilih : ");
        int elemen = iftitah.nextInt();
        System.out.println("-----------------------------------------------------");
        System.out.println("                  PEMUNGUTAN SUARA");
        System.out.println("-----------------------------------------------------");
        int pilih[] = new int[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print(" Masukkan nomor kandidat yang anda pilih : ");
            pilih[i] = iftitah.nextInt();
        }
        System.out.println("-----------------------------------------------------");
        int proses = pem.voting(pilih, 0, pilih.length);
        int suara = pem.pemenang();
        if (suara == 1) {
            kandidat = "Harris";
        } else if (suara == 2) {
            kandidat = "Dian";
        } else if (suara == 3) {
            kandidat = "Rani";
        } else if (suara == 4) {
            kandidat = "Bisma";
        } else {
            kandidat = "Belum bisa ditentukan";
        }
        System.out.println("*****************************************************");
        System.out.println("                  HASIL PEMILIHAN");
        System.out.println("*****************************************************");
        System.out.println(" o> Kandidat Terpilih adalah : " + kandidat);
        System.out.println("-----------------------------------------------------");
        System.out.println(" o> Rekapitulasi suara :");
        pem.tampil();
        System.out.println("*****************************************************");
    }
}
