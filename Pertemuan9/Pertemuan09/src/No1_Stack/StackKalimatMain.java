/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1_Stack;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class StackKalimatMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Q;

        System.out.print("Masukkan kalimat: ");
        Q = sc.nextLine();
        int panjang = Q.trim().length();
        StackKalimat stk = new StackKalimat(panjang);
        for (int i = 0; i < panjang; i++) {
            stk.push(Q.charAt(i));
        }
        System.out.println("Hasil: ");
        for (int i = 0; i < panjang; i++) {
            stk.pop();
        }
        System.out.println("");
    }
}
