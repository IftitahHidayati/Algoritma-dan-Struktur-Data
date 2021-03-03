/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer2_3;

/**
 *
 * @author USER
 */
public class tanah {

    public int panjang;
    public int lebar;

    tanah(){
        
    }
    public tanah(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public int hitungLuasTanah() {
        return panjang * lebar;
    }

    public int terluas(int[] Tanah) {
        int temp = Tanah[0];
        int hasil=0;
        for (int i = 1; i < Tanah.length; i++) {
            if (temp < Tanah[i]) {
                temp = Tanah[i];
                hasil = i;
            }
        }
        return hasil+1;
    }
}
