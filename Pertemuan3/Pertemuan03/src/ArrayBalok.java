
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
public class ArrayBalok {

    public static void main(String[] args) {
        balok[] blArray = new balok[3];
        tabung[] taArray = new tabung[3];
        kubus[] kuArray = new kubus[3];
        int p, l, t, r, s;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Balok ke- " + (i + 1));
            System.out.print("Masukkan nilai panjang : ");
            p = sc.nextInt();
            System.out.print("Masukkan nilai lebar : ");
            l = sc.nextInt();
            System.out.print("Masukkan nilai tinggi : ");
            t = sc.nextInt();
            blArray[i] = new balok(p, l, t);
        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Tabung ke- " + (i + 1));
//            System.out.print("Masukkan nilai jari-jari : ");
//            r = sc.nextInt();
//            System.out.print("Masukkan nilai tinggi : ");
//            t = sc.nextInt();
//            taArray[i] = new tabung(r, t);
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Kubus ke- " + i + 1);
//            System.out.print("Masukkan nilai sisi : ");
//            s = sc.nextInt();
//            kuArray[i] = new kubus(s);
//        }

        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Volume ke-" + (i + 1) + " : " + blArray[i].hitungVolume());
            System.out.println("Luas Permukaan ke-" + (i + 1) + " : " + blArray[i].hitungLuasPermukaan());
        }

//        for (int i = 0; i < blArray.length; i++) {
//            System.out.println("Volume ke-" + (i+1) + " : " + taArray[i].hitungVolume());
//            System.out.println("Luas Permukaan ke-" + (i+1) + " : " + taArray[i].hitungLuasPermukaan());
//        }
//          for (int i = 0; i < blArray.length; i++) {
//            System.out.println("Volume ke-" + (i+1) + " : " + kuArray[i].hitungVolumeKubus());
//            System.out.println("Luas Permukaan ke-" + (i+1) + " : " + kuArray[i].hitungLuasPermukaanKubus());
//        }
    }
}
