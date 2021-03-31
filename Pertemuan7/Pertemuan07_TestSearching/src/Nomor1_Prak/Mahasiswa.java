/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1_Prak;



/**
 *
 * @author Iftitah Hidayati
 */
public class Mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;
    
    Mahasiswa(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }
    
    void tampil(){
        System.out.println("NIM\t :  " + nim);
        System.out.println("Nama\t : " + nama);
        System.out.println("Umur\t : " + umur);
        System.out.println("IPK\t : " + ipk);
    }
}
