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
public class QNode {

    Node front, rear;
    DLL link;
    int size;

    public QNode() {
        this.front = this.rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // Method to add an key to the queue.
    void enqueue(int antrian, String nama) {

        // Create a new LL node
        Node temp = new Node(null, antrian, nama, null);

        // If queue is empty, then new node is front and rear both
        if (isEmpty()) {
            this.front = this.rear = temp;
        } else {
            temp.prev = rear;
            this.rear.next = temp;
            this.rear = temp;
        }
        size++;
    }

    // Method to remove an key from queue.
    void dequeue() {
        // If queue is empty, return NULL.
        if (isEmpty()) {
            System.out.println("Antrian Kosong");;
        } else {
            Node temp = this.front;
            if (size > 1) {
                this.front = this.front.next;
                front.prev = null;
            } else {
                this.front = this.rear = null;
            }
            System.out.println(temp.data + " telah selesai divaksinasi");
            size--;
        }
    }

    void displayQueue() {
        System.out.println("*************************");
        System.out.println(" Daftar Pengantri Vaksin");
        System.out.println("*************************");
        Node temp = front;
        while (temp != null) {
            System.out.println("|" + temp.antrian + "\t|" + temp.data + "\t\t|");
            temp = temp.next;
        }
        System.out.println("-------------------------");
        System.out.println("Sisa antrian: " + size);
        System.out.println("*************************");
    }

//    void pencarian(String cari) {
//        Node hasil = front;
//        while (hasil != null) {
//            if (hasil.data.equalsIgnoreCase(cari)) {
//                System.out.println("hasil:" +hasil.data);
//            }
//            hasil = hasil.next;
//        }
//    }
}
