/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class tugas2 {

    public static void main(String[] args) {
        int saldoAwal = 1000000;
        int saldoAkhir = 1500000;
        int bulan = 1;
        double bunga = 0.02;
        while (saldoAwal < saldoAkhir) {

            double temp = saldoAwal;
          //  System.out.println(saldoAwal);
            temp = temp * bunga;
            saldoAwal += temp;
            bulan++;
        }
        
        System.out.println("Saldo Akhir : "+saldoAwal);
        System.out.println("Bulan : " + bulan);
    }
}
