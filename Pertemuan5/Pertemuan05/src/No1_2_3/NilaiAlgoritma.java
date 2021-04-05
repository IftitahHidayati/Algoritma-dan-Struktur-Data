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
public class NilaiAlgoritma {

    String namaMhs;
    int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

    NilaiAlgoritma() {
    }

    NilaiAlgoritma(String nam, int t, int k, int uts, int uas) {
        namaMhs = nam;
        nilaiTugas = t;
        this.nilaiKuis = k;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }
    double hitungTotalNilai() {
        return 0.2 * this.nilaiTugas + 0.3 * this.nilaiKuis + 0.2 * this.nilaiUTS + 0.3 * this.nilaiUAS;
    }
    String getNama(){
        return this.namaMhs;
    }
    double rerata(double data[]) {
        double temp = 0;
        for (int i = 0; i < data.length; i++) {
            temp += data[i];
        }
        return temp / data.length;
    }
}
