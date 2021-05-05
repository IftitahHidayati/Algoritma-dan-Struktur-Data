/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;

import static java.lang.System.exit;

/**
 *
 * @author Iftitah Hidayati
 */
public class DLL2 {

    int size;
    Node2 top;

    public DLL2() {
        size = 0;
        top = null;
    }

    public boolean IsEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String item) throws Exception {
        if (IsEmpty()) {
            top = new Node2(null, item, null);
        } else {
            Node2 newNode = new Node2(top, item, top.next);
            top.next = newNode;
            top = newNode;
        }
        size++;
    }

    public void pop() {
        if (IsEmpty()) {
            System.out.println("Belum Ada Buku");;
        } else {
            Node2 x = top;
            System.out.println("---------------------------------------------------------------");
            System.out.println("Buku yang terambil : " + x.data);
            System.out.println("---------------------------------------------------------------");
            if (x.prev != null) {
                top = x.prev;
                x.prev.next = null;
                x = null;
            } else {
                top = null;
            }
        }
        size--;
    }

    public void peek() throws Exception {
        if (IsEmpty()) {
            System.out.println("Belum Ada Buku");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("             Cek buku teratas");
            System.out.println("-----------------------------------------");
            System.out.println(top.data);
            System.out.println("-----------------------------------------");
        }
    }

    public void displayStack(){
        if (top == null) {
            System.out.println("Belum Ada Buku");
        } else {
            Node2 temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.prev;
            }
            System.out.println("");
        }
    }
}
