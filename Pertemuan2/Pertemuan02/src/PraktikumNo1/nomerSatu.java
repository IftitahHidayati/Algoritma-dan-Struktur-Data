/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo1;

/**
 *
 * @author USER
 */
//Nama        : Iftitah Hidayati
//Kelas       : TI 1H
//NIM         : 2041720006
//No. Present : 14
public class nomerSatu {

    double PHI = 3.14, r;

    nomerSatu(double r) {
        this.r = r;
    }

    double hitungLuas() {
        if (r%7 ==0){
            return (22*r*r)/7;
        }
        return PHI * r * r;
    }

    double hitungKeliling() {
        if (r%7 ==0){
            return (22*2*r)/7;
        }
        return 2 * PHI * r;
    }
}
