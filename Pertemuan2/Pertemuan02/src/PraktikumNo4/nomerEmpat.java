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
public class nomerEmpat {

    int x, y, width, height;

    nomerEmpat(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        if (x > 0) {
            x -= 1;
            System.out.println("Bergerak ke kiri");
        } else {
            System.out.println("Ada tembok");
        }
    }

    void moveRight() {
        if (x <this.width) {
            x += 1;
            System.out.println("Bergerak ke kanan");
        } else {
            System.out.println("Ada tembok");
        }
    }

    void moveDown() {
        if (y > 0) {
            y -= 1;
            System.out.println("Bergerak ke bawah");
        } else {
            System.out.println("Ada tembok");
        }
    }

    void moveUp() {
        if (y < this.height) {
            y += 1;
            System.out.println("Bergerak ke atas");
        } else {
            System.out.println("Ada tembok");
        }
    }

    void printPosition() {
        System.out.println("!!Posisi saat ini adalah (" + x + "," + y + ")!!");
    }
}
