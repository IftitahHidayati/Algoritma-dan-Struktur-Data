/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomer2;

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
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + " - ");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("--------------------------------------");
            System.out.println("          Linked List Kosong");
            System.out.println("--------------------------------------");
        }
    }

    public void addFirst(String input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) { //jika linked list kosong
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, String input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data.equalsIgnoreCase(key)) {
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

    public void insertBefore(String key, String input) {
        Node temp = head;
        do {
            if (head.data.equalsIgnoreCase(key)) {
                addFirst(input);
                break;
            }
            if (temp.next.data.equalsIgnoreCase(key)) {
                temp.next = new Node(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, String input) {
        if (index < 0) {
            System.out.println("--------------------------------------");
            System.out.println("             Indeks salah");
            System.out.println("--------------------------------------");
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
//
//    public String getData(int index) {
//        Node tmp = head;
//        for (int i = 0; i < index; i++) {
//            tmp = tmp.next;
//        }
//        return tmp.data;
//    }
//
//    public int indexOf(String key) {
//        Node tmp = head;
//        int index = 0;
//        while (tmp != null && tmp.data != key) {
//            tmp = tmp.next;
//            index++;
//        }
//        if (tmp == null) {
//            return -1;
//        } else {
//            return index;
//        }
//    }
//
//    public void removeFirst() {
//        if (isEmpty()) {
//            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
//        } else if (head == tail) {
//            head = tail = null;
//        } else {
//            head = head.next;
//        }
//    }
//
//    public void removeLast() {
//        if (isEmpty()) {
//            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
//        } else if (head == tail) {
//            head = tail = null;
//        } else {
//            Node temp = head;
//            while (temp.next != tail) {
//                temp = temp.next;
//            }
//            temp.next = null;
//            tail = temp;
//        }
//    }
//
//    public void remove(String key) {
//        if (isEmpty()) {
//            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
//        } else {
//            Node temp = head;
//            while (temp != null) {
//                if ((temp.data == key) && (temp == head)) {
//                    this.removeFirst();
//                    break;
//                } else if (temp.next.data == key) {
//                    temp.next = temp.next.next;
//                    if (temp.next == null) {
//                        tail = temp;
//                    }
//                    break;
//                }
//                temp = temp.next;
//            }
//        }
//    }
//
//    public void removeAt(int index) {
//        if (index == 0) {
//            removeFirst();
//        } else {
//            Node temp = head;
//            for (int i = 0; i < index - 1; i++) {
//                temp = temp.next;
//            }
//            temp.next = temp.next.next;
//            if (temp.next == null) {
//                tail = temp;
//            }
//        }
//    }
}
