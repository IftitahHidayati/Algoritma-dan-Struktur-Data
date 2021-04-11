/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2_Stack;

/**
 *
 * @author Iftitah Hidayati
 */
public class StrukBelanja {
    int noTransaksi, jumlahBarang, totalHarga;
    String tanggalPembelian;
    
    StrukBelanja(int noTransaksi, String tanggalPembelian, int jumlahBarang, int totalHarga){
        this.noTransaksi = noTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHarga = totalHarga;
    }
}
 