/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer4_5;

/**
 *
 * @author USER
 */
public class dataMahasiswa {

    String nama, Jk, nim;
    double IPK;

    dataMahasiswa(){
        
    }
    
    dataMahasiswa(String nama, String nim, String JK, double IPK) {
        this.nama = nama;
        this.nim = nim;
        this.Jk = JK;
        this.IPK = IPK;
    }

    public void Tampil() {
        System.out.println("nama: " + this.nama);
        System.out.println("nim : " + this.nim);
        System.out.println("Jenis Kelamin: " + this.Jk);
        System.out.println("IPK: " + this.IPK);
    }

    public double getIPK() {
        return this.IPK;
    }

    public double Rerata(double[] ipk) {
        double jumlah = 0;
        for (int i = 0; i < ipk.length; i++) {
            jumlah += ipk[i];
        }
        return jumlah / ipk.length;
    }
}
