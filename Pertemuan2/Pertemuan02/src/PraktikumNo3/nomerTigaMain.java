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
public class nomerTigaMain {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        nomerTiga barang = new nomerTiga("tita", 5, 25000);
        System.out.println("Total bayar \t   : "+barang.hitungHargaTotal());
        System.out.println("Diskon \t\t   : "+barang.hitungHargaDiskon());
        System.out.println("Harga yang dibayar : "+barang.hitungHargaBayar());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
