/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo3;

/**
 *
 * @author USER
 */
//Nama        : Iftitah Hidayati
//Kelas       : TI 1H
//NIM         : 2041720006
//No. Present : 14
public class nomerTiga {

    String nama;
    int hargaSatuan, jumlah;

    nomerTiga(String nama, int hargaSatuan, int jumlah) {
       this.nama = nama;
       this.hargaSatuan = hargaSatuan;
       this.jumlah = jumlah;

    }

    int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    int hitungHargaDiskon() {
        if (hitungHargaTotal() > 100000) {
            return (int) (0.1 * hitungHargaTotal());
        } else if (hitungHargaTotal() > 50000 && hitungHargaTotal() < 100001) {
            return (int) (0.05 * hitungHargaTotal());
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        return this.hitungHargaTotal() - this.hitungHargaDiskon();
    }
}
