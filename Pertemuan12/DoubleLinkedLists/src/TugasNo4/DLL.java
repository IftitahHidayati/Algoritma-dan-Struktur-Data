/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo4;

/**
 *
 * @author Iftitah Hidayati
 */
public class DLL {

    Node head;
    int size;
    Mahasiswa data[];

    public DLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa data) {
        if (isEmpty()) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(current, data, null);
            size++;
        }
    }

    public void add(Mahasiswa data, int idx) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else if (idx < 0 || idx > size) {
            throw new Exception("Nilai Indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < idx) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("------------------------------");
            System.out.println("Node pertama berhasil di hapus");
            System.out.println("------------------------------");
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong");
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("-------------------------------");
            System.out.println("Node terakhir berhasil di hapus");
            System.out.println("-------------------------------");
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
        System.out.println("-------------------------------");
        System.out.println("Node terakhir berhasil di hapus");
        System.out.println("-------------------------------");

    }

    public void remove(int idx) throws Exception {
        if (isEmpty() || idx >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (idx == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < idx) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
            System.out.println("---------------------------------------------");
            System.out.println("Node pada indeks ke-" + idx + " berhasil di hapus");
            System.out.println("---------------------------------------------");
        }

    }

    public void cariData(String nim) {
        int i = 0;
        boolean j = false;
        Node current = head;
        Mahasiswa dt;
        if (head == null) {
            System.out.println("Linked List kosong");
            return;
        }
        for (current = head; current != null; current = current.next) {
            if (current.data.nim.equals(nim)) {
                j = true;
                System.out.println("Data " + nim + " berada pada indeks ke- " + i);
                System.out.println("*******************************");
                System.out.println("           IDENTITAS");
                System.out.println("*******************************");
                System.out.println("NIM\t: " + current.data.nim);
                System.out.println("Nama\t: " + current.data.nama);
                System.out.println("IPK\t: " + current.data.ipk);
                System.out.println("*******************************");
                break;
            }
            i++;
        }
        if (j) {
            System.out.println("");
        } else {
            System.out.println("Data tidak tersedia di list");
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;

            while (tmp != null) {
                System.out.println("NIM : " + tmp.data.nim);
                System.out.println("Nama: " + tmp.data.nama);
                System.out.println("IPK : " + tmp.data.ipk);
                tmp = tmp.next;
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    //method sortList untuk mengurutkan data menggunakan bubble sort scr desc
    Node sortList() {
        int swap, i;
        Node awal;
        Node datanext = null;
        if (head == null) {
            return null;
        }
        do {
            swap = 0;
            awal = head;
            while (awal.next != datanext) {
                if (awal.data.ipk < awal.next.data.ipk) {
                    double temp = awal.data.ipk;
                    awal.data.ipk = awal.next.data.ipk;
                    awal.next.data.ipk = temp;
                    String tmp = awal.data.nama;
                    awal.data.nama = awal.next.data.nama;
                    awal.next.data.nama = tmp;
                    String tmp2 = awal.data.nim;
                    awal.data.nim = awal.next.data.nim;
                    awal.next.data.nim = tmp2;
                    swap = 1;
                }
                awal = awal.next;
            }
            datanext = awal;
        } while (swap != 0);
        return head;
    }

    //method printSort untuk mencetak isi bubble sort
    public void printSort() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("NIM : " + tmp.data.nim);
                System.out.println("Nama: " + tmp.data.nama);
                System.out.println("IPK : " + tmp.data.ipk);
                tmp = tmp.next;
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            }
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }
}
