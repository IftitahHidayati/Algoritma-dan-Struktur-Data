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
public class Pangkat {
    public int nilai, pangkat;
    
//    Pangkat(int nl, int pg){
//        nilai = nl;
//        pangkat = pg;
//    }
    
    public void Tampil() {
        System.out.println("Nilai : " + this.nilai);
        System.out.println("Pangkat : " + this.pangkat);
    }
    
    public int pangkatBF(int a, int n){
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil=hasil*a;
        }
        return hasil;
    }
    
    public int pangkatDC(int a, int n){
        if (n==0) {
            return 1;
        }
        else
        {
            if (n%2==1) 
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            else
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
        }
    }
}