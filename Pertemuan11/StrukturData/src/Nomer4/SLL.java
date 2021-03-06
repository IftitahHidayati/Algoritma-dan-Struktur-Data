/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomer4;

/**
 *
 * @author Iftitah Hidayati
 */
public class SLL {
    Node head; //posisi awal linked list
    Node tail; //posisi akhir linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("---------------------------------");
            System.out.println("         ISI LINKED LIST");
            System.out.println("---------------------------------");
            System.out.println("NoRek \t Nama \t\t Alamat");
            System.out.println("---------------------------------");
            while (tmp != null) {
                System.out.println(tmp.data.noRek + "\t " + tmp.data.nama + "\t" + tmp.data.alamat);
                tmp = tmp.next;
            }
            System.out.println("---------------------------------");
            System.out.println("");
        } else {
            System.out.println("---------------------------------");
            System.out.println("         Linked List Kosong");
            System.out.println("---------------------------------");
        }
    }

    public void addFirst(Nasabah input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) { //jika linked list kosong
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Nasabah input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Nasabah input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data.noRek.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertBefore(String key, Nasabah input) {
        Node temp = head;
        do {
            if (head.data.noRek.equalsIgnoreCase(key)) {
                addFirst(input);
                break;
            }
            if (temp.next.data.noRek.equalsIgnoreCase(key)) {
                temp.next = new Node(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Nasabah input) {
        if (index < 0) {
            System.out.println("---------------------------------");
            System.out.println("           Indeks salah");
            System.out.println("---------------------------------");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("---------------------------------------------");
            System.out.println("Linked List masih kosong tidask dapat dihapus");
            System.out.println("---------------------------------------------");
        } else if (head == tail ) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("---------------------------------------------");
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
            System.out.println("---------------------------------------------");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
            temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("---------------------------------------------");
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
            System.out.println("---------------------------------------------");
        } else {
            Node temp = head;
            while (temp != null) {
                if ((temp.data.noRek.equals(key)) && (temp == head))     {
                    this.removeFirst();
                    break;
                } else if (temp.next.data.noRek.equals(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index -1 ; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
