/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer2_3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class mainTanah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah, p, l;

        System.out.print("Jumlah tanah: ");
        jumlah = sc.nextInt();
        tanah[] Tanah = new tanah[jumlah];
        tanah PTanah = new tanah();
        System.out.println("");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Tanah " + (i + 1));
            System.out.print("Panjang: ");
            p = sc.nextInt();
            System.out.print("Lebar: ");
            l = sc.nextInt();
            Tanah[i] = new tanah(p, l);
        }
        System.out.println("");

        int[] temp = new int[Tanah.length];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Luas Tanah " + (i + 1) + ": " + Tanah[i].hitungLuasTanah());
            temp[i]= Tanah[i].hitungLuasTanah();
        }
        System.out.println("");
        System.out.println("Tanah terluas: " + PTanah.terluas(temp));
    }
}
