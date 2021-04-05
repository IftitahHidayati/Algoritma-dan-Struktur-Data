/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1_2_3;

/**
 *
 * @author Iftitah Hidayati
 */
public class NilaiAlgoMain {

    public static void main(String[] args) {
        int total;
//        double [] temp;
double jumlah=0;

        System.out.println("|=============|======================|");
        NilaiAlgoritma[] mhs = new NilaiAlgoritma[3];
        mhs[0] = new NilaiAlgoritma("|Rani         |", 50, 60, 50, 70);
        mhs[1] = new NilaiAlgoritma("|Dani         |", 50, 90, 80, 60);
        mhs[2] = new NilaiAlgoritma("|Saraswati    |", 70, 80, 60, 90);
        System.out.println("|    NAMA     |   NILAI MAHASISWA    |");
        System.out.println("|=============|======================|");
        for (int i = 0; i < mhs.length; i++) {
            jumlah+=mhs[i].hitungTotalNilai();
            System.out.println(mhs[i].getNama()+" "+mhs[i].hitungTotalNilai()+"                 |");
        }
        System.out.println("|-------------|----------------------|");
        System.out.println("|Nilai Rata-Rata Mahasiswa : "+(jumlah/mhs.length)+"    |");

//        temp = new double[mhs.length];
//        for (int i = 0; i < mhs.length; i++) {
//            temp[i]=mhs[i].hitungTotalNilai();
//            System.out.println(temp[i]);
//        }
//        NilaiAlgoritma dataMHS = new NilaiAlgoritma();
//        System.out.println("Nilai Rerata Mahasiswa : "+dataMHS.rerata(temp));
        
        System.out.println("|=============|======================|");
    }
}
