/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class tabung {

    public double phi = 3.14;
    public int jarijari;
    public int tinggi;

    public tabung(int r, int t) {
        jarijari = r;
        tinggi = t;
    }

    public double hitungVolume() {
        if (jarijari % 7 == 0) {
            return (22 * jarijari * jarijari * tinggi) / 7;
        }
        return phi * jarijari * jarijari * tinggi;
    }

    public double hitungLuasPermukaan() {
        if (jarijari % 7 == 0) {
            return ((2 * 22 * jarijari * jarijari) / 7) + ((2 * 22 * jarijari * tinggi) / 7);
        }
        return (2 * phi * jarijari * jarijari) + (2 * phi * jarijari * tinggi);
    }

}
