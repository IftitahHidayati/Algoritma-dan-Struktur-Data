/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumNo4;

/**
 *
 * @author USER
 */
//Nama        : Iftitah Hidayati
//Kelas       : TI 1H
//NIM         : 2041720006
//No. Present : 14
public class nomerEmpatMain {

    public static void main(String[] args) {
        nomerEmpat Pac = new nomerEmpat(3, 4, 10, 10);
        System.out.println("--------------------------------");
        Pac.printPosition();
        System.out.println("--------------------------------");
        Pac.moveLeft();
        System.out.println("--------------------------------");
        Pac.printPosition();
        System.out.println("--------------------------------");
        Pac.moveLeft();
        Pac.moveLeft();
        Pac.moveLeft();
        System.out.println("--------------------------------");
        Pac.printPosition();
        System.out.println("--------------------------------");
        Pac.moveDown();
        Pac.moveDown();
        Pac.moveDown();
        Pac.moveDown();
        Pac.moveDown();
        System.out.println("--------------------------------");
        Pac.printPosition();
        System.out.println("--------------------------------");
        }
}
