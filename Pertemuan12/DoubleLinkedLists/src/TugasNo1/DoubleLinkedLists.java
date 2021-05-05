/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;

/**
 *
 * @author Iftitah Hidayati
 */
public class DoubleLinkedLists {

    //mendeklarasikan atribut
    Node head;
    int size;

    //membuat konstruktor
    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    //method untuk memastikan kondisi linked list kosong
    public boolean isEmpty() {
        return head == null;
    }

    //method penambahan data di bagian depan linked list
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    //method penambahan data pada bagian belakang linked list
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    //method penambahan data pada posisi index yang telah ditentukan
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks di luar batas");
        } else {
            Node current = head;
            int i = 1;
            while (i <= index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    //method memperbarui jumlah data
    public int size() {
        return size;
    }

    //method untuk menghapus semua isi linked list
    public void clear() {
        head = null;
        size = 0;
    }

    //method mencetak semua isi linked list
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    //method untuk menghapus data paling depan
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
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

    //method untuk menghapus data paling belakang
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
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
    
    //method remove sesuai index
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
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
            System.out.println("Node pada indeks ke-" + index + " berhasil di hapus");
            System.out.println("---------------------------------------------");
        }
    }
    
    //method mencari nilai dengan posisinya
    public int FindSeqSearch(int carinilai) {
        Node tmp = head;
        int posisi = -1;
        int index = 0;
        while (tmp != null) {
            if (tmp.data == carinilai) {
                posisi = index;
            }
            index++;
            tmp = tmp.next;
        }
        return posisi;
    }

//method pengurutan data menggunakan Bubble sort secara Descending
    public void BubbleSort() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            int i = 0;
            while (i < size) {
                Node dataawal = head;
                while (dataawal != null) {
                    if (dataawal.next != null) {
                        if (dataawal.data < dataawal.next.data) {
                            int temp = dataawal.data;
                            dataawal.data = dataawal.next.data;
                            dataawal.next.data = temp;
                        }
                    }
                    dataawal = dataawal.next;
                }
                i++;
            }
            Node printdata = head;
            while (printdata != null) {
                System.out.println(printdata.data);
                printdata = printdata.next;
            }
            System.out.println("");
        }
    }
}
