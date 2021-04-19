/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Iftitah Hidayati
 */
public class Queue {

    int max, size, front, rear;
    int Q[];
    boolean cari = false;

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + Q[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
        return data;
    }

//    ====== NOMOR 1 TUGAS 8.4 ======
    public void peekPosition(int data) {
        if (!IsEmpty()) {
            for (int i = front; i < Q.length; i++) {
                if (Q[i] == data) {
                    System.out.println("Posisi berada di indeks ke-" + i);
                    cari = true;
                }
            }
            if (!cari) {
                System.out.println("Data tidak ditemukan");
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekAt(int position) {
        if (!IsEmpty()) {
            if (Q.length - 1 < position || position < 0) {
                System.out.println("Data melebihi kapasitas");
            } else {
                System.out.println("Nilai posisi adalah: " + Q[position]);
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
