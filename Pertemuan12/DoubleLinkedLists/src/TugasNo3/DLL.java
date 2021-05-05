/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo3;

/**
 *
 * @author Iftitah Hidayati
 */
public class DLL {

    Node head, tail;
    int size;

    //membuat konstruktor
    public DLL() {
        head = null;
        tail = null;
        size = 0;
    }

    //method untuk memastikan kondisi linked list kosong
    public boolean isEmpty() {
        return head == null;
    }

    //method penambahan data di bagian depan linked list
    public void add(int antrian, String data) {
        if (isEmpty()) {
            head = tail = new Node(null, antrian, data, null);
        } else {
            Node newNode = new Node(tail, antrian, data, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + ", ");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
