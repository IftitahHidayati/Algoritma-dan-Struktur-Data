/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3_Prak;

/**
 *
 * @author Iftitah Hidayati
 */
public class No3 {
//    int array2D [][] = new int [3][5];

    public int[] FindSeqSearch(int array[][], int cari) {
        int[] hasil = {-1,-1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == cari) {
                    hasil[0] = i;
                    hasil[1] = j;
                    break;
                }
            }
        }
        return hasil;
    }
}
