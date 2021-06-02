/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet13;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class BinaryTreeArray {

    Scanner sc = new Scanner(System.in);
    int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    void populateData(int data[]) {
        this.data = data;
        this.idxLast = checkLast();
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] == 0) {
                System.out.print(idxLast + " ");
            } else {
                System.out.print(data[idxStart] + " ");
            }
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            if (data[idxStart] == 0) {
                System.out.print(idxLast + " ");
            } else {
                System.out.print(data[idxStart] + " ");
            }
        }
    }

    int checkLast() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                break;
            }
            idxLast = i;
        }
        return idxLast;
    }

    void addData(int nilai) {
        if (idxLast >= data.length - 1) {
            System.out.println("Slot penuh");
        } else {
            data[idxLast + 1] = nilai;
            populateData(data);
            System.out.println("----------------------------");
            System.out.println("Pilih Metode untuk ADD data");
            System.out.println("----------------------------");
            System.out.println("1. Preorder");
            System.out.println("2. Inorder");
            System.out.println("3. Postorder");
            System.out.println("----------------------------");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    this.traversePreOrder(0);
                    break;
                case 2:
                    this.traverseInOrder(0);
                    break;
                case 3:
                    this.traversePostOrder(0);
                    break;
            }
        }
    }
}
