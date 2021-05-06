/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis_Iftitah;

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

    public void dataPertama() {
        if (!isEmpty()) {
            System.out.println("NIM: " + head.data.nim);
            System.out.println("Nama: " + head.data.nama);
            System.out.println("Jurusan: " + head.data.jurusan);
            System.out.println("Prodi: " + head.data.prodi);
            System.out.println("IPK: " + head.data.ipk);
        } else {
            System.out.println("List masih kosong");
        }
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
                System.out.println("NIM     : " + tmp.data.nim);
                System.out.println("Nama    : " + tmp.data.nama);
                System.out.println("Jurusan : " + tmp.data.jurusan);
                System.out.println("Prodi   : " + tmp.data.prodi);
                System.out.println("IPK     : " + tmp.data.ipk);
                tmp = tmp.next;
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void seqSearch(String cari) {
        int idx = -1;
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.data.nim.equals(cari)) {
                idx = i;
            } else {
                current = current.next;
            }
        }
        if (idx != -1) {
            System.out.println("Data " + cari + " berada di node ke-" + idx);
            System.out.println("*******************************");
            System.out.println("           IDENTITAS");
            System.out.println("*******************************");
            System.out.println("NIM     : " + current.data.nim);
            System.out.println("Nama    : " + current.data.nama);
            System.out.println("Jurusan : " + current.data.jurusan);
            System.out.println("Prodi   : " + current.data.prodi);
            System.out.println("IPK     : " + current.data.ipk);
            System.out.println("*******************************");
        } else {
            System.out.println("Data yang anda cari tidak ditemukan!");
        }
    }

    public void bubbleSort(int pilih) {
        Node pos1, pos2, min;
        double tmp;
        String tmp2;
        if (head != null) {
            pos1 = head;
            if (pilih == 1) {
                while (pos1.next != null) {
                    pos2 = pos1;
                    min = pos1;
                    while (pos2 != null) {
                        if (pos2.data.ipk < min.data.ipk) {
                            min = pos2;
                        }
                        pos2 = pos2.next;
                    }
                    if (pos1.data.ipk > min.data.ipk) {
                        tmp2 = pos1.data.nim;
                        pos1.data.nim = min.data.nim;
                        min.data.nim = tmp2;

                        tmp2 = pos1.data.nama;
                        pos1.data.nama = min.data.nama;
                        min.data.nama = tmp2;

                        tmp2 = pos1.data.jurusan;
                        pos1.data.jurusan = min.data.jurusan;
                        min.data.jurusan = tmp2;

                        tmp2 = pos1.data.prodi;
                        pos1.data.prodi = min.data.prodi;
                        min.data.prodi = tmp2;

                        tmp = pos1.data.ipk;
                        pos1.data.ipk = min.data.ipk;
                        min.data.ipk = tmp;

                    }
                    pos1 = pos1.next;
                }
            } else {
                while (pos1.next != null) {
                    pos2 = pos1;
                    min = pos1;
                    while (pos2 != null) {
                        if (pos2.data.ipk > min.data.ipk) {
                            min = pos2;
                        }
                        pos2 = pos2.next;
                    }
                    if (pos1.data.ipk < min.data.ipk) {
                        tmp2 = pos1.data.nim;
                        pos1.data.nim = min.data.nim;
                        min.data.nim = tmp2;

                        tmp2 = pos1.data.nama;
                        pos1.data.nama = min.data.nama;
                        min.data.nama = tmp2;

                        tmp2 = pos1.data.jurusan;
                        pos1.data.jurusan = min.data.jurusan;
                        min.data.jurusan = tmp2;

                        tmp2 = pos1.data.prodi;
                        pos1.data.prodi = min.data.prodi;
                        min.data.prodi = tmp2;

                        tmp = pos1.data.ipk;
                        pos1.data.ipk = min.data.ipk;
                        min.data.ipk = tmp;

                    }
                    pos1 = pos1.next;
                }
            }
        } else {
            System.out.println("Linked list masih kosong!");
        }
    }
}
