/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer4_5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class mainMhs {

    public static void main(String[] args) {
        dataMahasiswa[] MHS = new dataMahasiswa[3];
        dataMahasiswa RMHS = new dataMahasiswa();
        Scanner sc = new Scanner(System.in);
        String nama, Jk, nim;
        double IPK;

        for (int i = 0; i < MHS.length; i++) {

            System.out.println("Masukkan data Mahasiswa ke- " + (i + 1));
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan nim: ");
            nim = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            Jk = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            IPK = sc.nextDouble();
            sc.nextLine();
            MHS[i] = new dataMahasiswa(nama, nim, Jk, IPK);
            System.out.println("");
        }

        double[] temp = new double[3];

        for (int i = 0; i < MHS.length; i++) {
            MHS[i].Tampil();
            temp[i]=MHS[i].getIPK();
        }
        
        System.out.println("IPK Rata-rata seluruh mahasiswa: "+RMHS.Rerata(temp));
    }

}
