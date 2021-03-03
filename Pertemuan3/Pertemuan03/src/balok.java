/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class balok {

    public int panjang;
    public int lebar;
    public int tinggi;

    public balok() {

    }

    public balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
    public int hitungLuasPermukaan() {
        return 2*(panjang*lebar +lebar*tinggi + panjang*tinggi);
    }
}
