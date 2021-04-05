/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

/**
 *
 * @author Iftitah Hidayati
 */
public class Pemilihan {

    public int vt;
    int pil1 = 0, pil2 = 0, pil3 = 0, pil4 = 0;
    int max = 0;

    public int voting(int[] pilihan, int a, int b) {

        if (b > a) {
            int tengah = (b - a) / 2 + a;
            if (pilihan[tengah] == 1) {
                pil1++;
            } else if (pilihan[tengah] == 2) {
                pil2++;
            } else if (pilihan[tengah] == 3) {
                pil3++;
            } else if (pilihan[tengah] == 4) {
                pil4++;
            }
            int kiri = voting(pilihan, a, tengah);
            int kanan = voting(pilihan, tengah + 1, b);
            if (kiri != 0) {
                return kiri;
            } else if (kanan != 0) {
                return kanan;
            }
            return 0;
        }
        
        return 0;
    }

    int pemenang(){
        if (pil1 > pil2 && pil1 > pil3 && pil1 > pil4) {
            max = 1;
        } else if (pil2 > pil1 && pil2 > pil3 && pil2 > pil4) {
            max = 2;
        } else if (pil3 > pil2 && pil3 > pil1 && pil3 > pil4) {
            max = 3;
        } else if (pil4 > pil2 && pil4 > pil1 && pil4 > pil3){
            max = 4;
        }else{
            max = 5;
        }
        return max;
    }
    void tampil() {
        System.out.println(" Pilihan 1 sebanyak : " + pil1);
        System.out.println(" Pilihan 2 sebanyak : " + pil2);
        System.out.println(" Pilihan 3 sebanyak : " + pil3);
        System.out.println(" Pilihan 4 sebanyak : " + pil4);
    }
}
