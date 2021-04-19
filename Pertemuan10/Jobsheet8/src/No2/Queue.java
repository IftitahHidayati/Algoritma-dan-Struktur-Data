/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author Iftitah Hidayati
 */
public class Queue {

    int max, size, front, rear;
    Mahasiswa[] antrian;

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        antrian = new Mahasiswa[max];
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
            System.out.println("=======================================================");
            System.out.println("Elemen terdepan: " + antrian[front].nim + " " + antrian[front].nama
                    + " " + antrian[front].absen + " " + antrian[front].ipk);
            System.out.println("=======================================================");
        } else {
            System.out.println("=======================================================");
            System.out.println("                   Queue masih kosong");
            System.out.println("=======================================================");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("=======================================================");
            System.out.println("                   Queue masih kosong");
            System.out.println("=======================================================");
        } else {
            System.out.println("=======================================================");
            for (int i = front; i <= rear; i++) {
                System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen
                        + " " + antrian[i].ipk);
            }
            System.out.println("Jumlah elemen = " + size);
            System.out.println("=======================================================");
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("=======================================================");
            System.out.println("              Queue berhasil dikosongkan");
            System.out.println("=======================================================");
        } else {
            System.out.println("=======================================================");
            System.out.println("                  Queue masih kosong");
            System.out.println("=======================================================");
        }
    }

    public void Enqueue(Mahasiswa data) {
        if (IsFull()) {
            System.out.println("=======================================================");
            System.out.println("                   Queue sudah penuh");
            System.out.println("=======================================================");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
            antrian[rear] = data;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
//        Penumpang data = new Penumpang();
        if (IsEmpty()) {
            System.out.println("=======================================================");
            System.out.println("                 Queue masih kosong");
            System.out.println("=======================================================");
        } else {
            data = antrian[front];
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

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("=======================================================");
            System.out.println("Elemen paling belakang: " + antrian[rear].nim + " " + antrian[rear].nama
                    + " " + antrian[rear].absen + " " + antrian[rear].ipk);
            System.out.println("=======================================================");
        } else {
            System.out.println("=======================================================");
            System.out.println("                  Queue masih kosong");
            System.out.println("=======================================================");
        }
    }

    public void peekPosition(String nim) {
        boolean cari = false;
        if (!IsEmpty()) {
            for (int i = front; i < antrian.length; i++) {
                if (antrian[i].nim.equalsIgnoreCase(nim)) {
                    System.out.println("=======================================================");
                    System.out.println("Posisi berada di indeks ke-" + i);
                    System.out.println("=======================================================");
                    cari = true;
                }
            }
            if (!cari) {
                System.out.println("=======================================================");
                System.out.println("               Data tidak ditemukan");
                System.out.println("=======================================================");
            }
        } else {
            System.out.println("=======================================================");
            System.out.println("                  Queue masih kosong");
            System.out.println("=======================================================");
        }
    }

    public void printMahasiswa(int posisi) {
        if (!IsEmpty()) {
            if (antrian.length - 1 < posisi || posisi < 0) {
                System.out.println("=======================================================");
                System.out.println("             Data melebihi kapasitas");
                System.out.println("=======================================================");
            } else {
                System.out.println("=======================================================");
                System.out.println("Nilai posisi adalah: " + antrian[posisi].nim + " " + antrian[posisi].nama
                        + " " + antrian[posisi].absen + " " + antrian[posisi].ipk);
                System.out.println("=======================================================");
            }
        } else {
            System.out.println("=======================================================");
            System.out.println("                   Queue masih kosong");
            System.out.println("=======================================================");
        }
    }
}
