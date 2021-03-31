/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor4_Prak;

/**
 *
 * @author Iftitah Hidayati
 */
public class No4Main {

    public static void main(String[] args) {
        int array[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};

        No4 sorting = new No4();
        sorting.SelectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        sorting.setData(array);
        int index = sorting.FindBinarySearch(array[array.length - 1], 0, array.length - 1);
        System.out.println("Total jumlah nilai terbesar ada " + sorting.Count(index));
        sorting.tampilIndeks(index);
        System.out.println("");
    }
}
