/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author USER
 */
public class Faktorial {

    public int nilai;
    public double waktuBF;

    public int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        double a = System.currentTimeMillis();
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        double b = System.currentTimeMillis();
        waktuBF= b-a;
        
//        for (int i = 1; i <= n; i++) {
//            fakto = fakto*i;
//        }
        return fakto;
    }

    public double getTimeBF(){
        return this.waktuBF;
    }
    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
