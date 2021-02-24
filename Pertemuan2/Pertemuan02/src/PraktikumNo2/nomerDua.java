/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo2;

/**
 *
 * @author USER
 */
//Nama        : Iftitah Hidayati
//Kelas       : TI 1H
//NIM         : 2041720006
//No. Present : 14
public class nomerDua {
    String namaMember, namaGame;
    int id,lamaPeminjaman,hargaSewa;
    
    nomerDua(){ 
    }
    nomerDua (String namaMember, String namaGame, int id, int lamaPeminjaman,int hargaSewa){
        this.namaMember = namaMember ;
        this.namaGame = namaGame;
        this.id = id;
        this.lamaPeminjaman = lamaPeminjaman;
        this.hargaSewa = hargaSewa;
    }
    
    int hargaYangDibayar() {
        return lamaPeminjaman*hargaSewa;
    }

    void dataHasilPeminjaman() {
        System.out.println("---------------------------------------------");
        System.out.println("ID \t\t\t : " +id);
        System.out.println("Nama member \t\t : " + namaMember);
        System.out.println("Nama Game \t\t : " + namaGame);
        System.out.println("Lama Pinjam \t\t : " + lamaPeminjaman);
        System.out.println("Harga yang harus dibayar : " + hargaYangDibayar());
        System.out.println("---------------------------------------------");
    }
}
