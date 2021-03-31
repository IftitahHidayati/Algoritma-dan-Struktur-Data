/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3_Prak;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class No3Main {

    public static void main(String[] args) {
        int array2D[][] = {{45, 78, 7, 200, 80}, {90, 1, 17, 100, 50}, {21, 2, 40, 18, 65}};
        Scanner input = new Scanner(System.in);
        No3 arr = new No3();
        int cari;
        
        System.out.print("Data yang dicari : ");
        cari = input.nextInt();
        int hasil[] = arr.FindSeqSearch(array2D, cari);
        if (hasil[0] == -1) {
            System.out.println("data tidak ditemukan");
        } else {
            System.out.println("Lokasi ada di indeks (" + hasil[0] + "," + hasil[1] + ")");
        }
    }
}
