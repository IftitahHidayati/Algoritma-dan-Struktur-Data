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
public class No4 {

    int data[];

    void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idxMin]) {
                    idxMin = j;
                }
            }
            int tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
    }

    public void tampilIndeks(int pos) {
        System.out.print("Indeks terletak pada ");
        for (int i = pos; i < data.length; i++) {
            System.out.print(i+" ");
        }
    }

    public void setData(int[] array) {
        this.data = array;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int Count(int index) {
        return data.length - index;
    }

}
