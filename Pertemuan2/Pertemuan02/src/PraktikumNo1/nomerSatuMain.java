/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
//Nama        : Iftitah Hidayati
//Kelas       : TI 1H
//NIM         : 2041720006
//No. Present : 14
public class nomerSatuMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        
        System.out.print("Masukkan jari2 : ");
        r = input.nextDouble();
        nomerSatu lingkaran = new nomerSatu(r);
        System.out.println("=================================");
        System.out.println("Luas Lingkaran : "+lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran : "+lingkaran.hitungKeliling());
        System.out.println("=================================");
    }
}
