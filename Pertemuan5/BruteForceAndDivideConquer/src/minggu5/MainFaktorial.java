/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MainFaktorial {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial time = new Faktorial();
        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("==============================================");
        double a = System.currentTimeMillis();
        System.out.println("Hasil Faktorial dengan Bruce Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorialdari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        double b = System.currentTimeMillis();
        System.out.println("Waktu eksekusi (milisecond): " + (b-a));
        System.out.println("==============================================");
        System.out.println("Hasil faktorial dengan Divide Conquer");
        double c = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorialdari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
        double d = System.currentTimeMillis();
        System.out.println("Waktu eksekusi (milisecond): " + (d-c));
        System.out.println("==============================================");
        

    }
}
