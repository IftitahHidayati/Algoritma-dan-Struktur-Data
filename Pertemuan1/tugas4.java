
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class tugas4 {
    static void luasSegitiga(){
        Scanner input = new Scanner(System.in);
        float alas, tinggi, luas;
        System.out.println("|-----------Luas Segitiga-----------|");
        System.out.print("  Masukkan nilai alas   : ");
        alas = input.nextFloat();
        System.out.print("  Masukkan nilai tinggi : ");
        tinggi = input.nextFloat();
        luas = (alas*tinggi)/2;
        System.out.println("  Luas Segitiga\t\t: " + luas);
        System.out.println("|-----------------------------------|\n");
    }
    static void luasPersegiPanjang(){
        Scanner input = new Scanner(System.in);
        float panjang, lebar, luas;
        System.out.println("|--------Luas Persegi Panjang-------|");
        System.out.print("  Masukkan nilai panjang : ");
        panjang = input.nextFloat();
        System.out.print("  Masukkan nilai lebar   : ");
        lebar = input.nextFloat();
        luas = panjang*lebar;
        System.out.println("  Luas Persegi Panjang   : " + luas);
        System.out.println("|-----------------------------------|\n");
    }
    static void luasLingkaran(){
        Scanner input = new Scanner(System.in);
        double jari, luas;
        System.out.println("|-----------Luas Lingkaran----------|");
        System.out.print("  Masukkan nilai jari-jari : ");
        jari = input.nextFloat();
        luas = 3.14*jari*jari;
        System.out.println("  Luas Lingkaran\t   : " + luas);
        System.out.println("|-----------------------------------|\n");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan= 9;
        do {
            System.out.println("|===================================|");
            System.out.println("|  \t\tMenu\t\t    |");
            System.out.println("|      \t Pilih Bangun Datar\t    |");
            System.out.println("|===================================|");
            System.out.println("| 1. Menghitung luas segitiga\t    |");
            System.out.println("| 2. Menghitung luas persegi panjang|");
            System.out.println("| 3. Menghitung luas lingkaran\t    |");
            System.out.println("| 0. Keluar\t\t\t    |");
            System.out.println("|===================================|");
            System.out.print("| Masukkan Pilihan Anda : ");
            pilihan = input.nextInt();
            System.out.println("");
            switch(pilihan){
                case 1 : luasSegitiga();break;
                case 2 : luasPersegiPanjang();break;
                case 3 : luasLingkaran();break;
            }
        } while (pilihan != 0);
    }
}
    