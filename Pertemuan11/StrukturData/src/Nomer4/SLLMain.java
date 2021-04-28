/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomer4;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class SLLMain {
    static Scanner sc = new Scanner(System.in);
    static SLL lists = new SLL(); 
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        System.out.println("=================================");
        System.out.println("Pilih Operasi Single Linked Lists");
        System.out.println("=================================");
        System.out.println("1. Menambah data diawal");
        System.out.println("2. Menambah data diakhir");
        System.out.println("3. Menambah data posisi (SESUDAH)");
        System.out.println("4. Menambah data posisi (SEBELUM)");
        System.out.println("5. Menambah data posisi (INDEX)");
        System.out.println("---------------------------------");
        
        if(!lists.isEmpty()){ // fitur hapus tidak akan keluar jika data masih kosong
            System.out.println("6. Menghapus Data");
            System.out.println("=================================");
        }
        System.out.print("Pilih : ");
        int option = sc.nextInt();
        sc.nextLine();
        System.out.println("=================================");
        
        if(option > 0 && option < 6){
            add(option);
        }else if(option == 6){
            if(!lists.isEmpty()){
                destroy();
            }else{
                System.out.println("Opsi tidak ada");
                menu();
            }
        }else{
            System.out.println("Opsi tidak ada,Keluar dari program");
//            menu();
        }
    }
    
    static void add(int option){
        String norek, nama, alamat;
        System.out.println("---------------------------------");
        System.out.print("Masukkan Norek  : ");
        norek = sc.nextLine();
        System.out.print("Masukkan Nama   : ");
        nama = sc.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = sc.nextLine();
        System.out.println("---------------------------------");
        
        push(option, norek, nama, alamat);
    }
    
    static void push(int option, String norek, String nama, String alamat){
        Nasabah nb = new Nasabah(norek, nama, alamat);
        String keys;
        switch(option){
            case 1:
                lists.addFirst(nb);
                lists.print();
                break;
            case 2:
                lists.addLast(nb);
                lists.print();
                break;
            case 3:
                System.out.println("SETELAH norek apa ?");
                System.out.print("Masukkan noRek (Keys): ");
                keys = sc.nextLine();
                lists.insertAfter(keys, nb);
                lists.print();
                break;
            case 4:
                System.out.println("SEBELUM norRek apa ?");
                System.out.print("Masukkan noRek (Keys): ");
                keys = sc.nextLine();
                lists.insertBefore(keys, nb);
                lists.print();
                break;
            case 5:
                System.out.println("Pada index ke berapa ?");
                System.out.print("Masukkan index (Keys): ");
                int index = sc.nextInt();
                lists.insertAt(index, nb);
                lists.print();
                break;
        }
        menu();
    }
    
    static void destroy(){
        System.out.println("---------------------------------");
        System.out.println("Pilih Operasi Single Linked Lists");
        System.out.println("---------------------------------");
        System.out.println("1. Remove");
        System.out.println("2. Remove First");
        System.out.println("3. Remove Last");
        System.out.println("4. Remove At");
        System.out.println("---------------------------------");
        System.out.print("Pilih : ");
        int option = sc.nextInt();
        sc.nextLine();
        String keys;
        System.out.println("---------------------------------");
        
        switch(option){
            case 1:
                System.out.println("Masukkan norek yang akan di hapus");
                System.out.print("=> ");
                keys = sc.nextLine();
                System.out.println("---------------------------------");
                lists.remove(keys);
                lists.print();
                break;
            case 2:
                lists.removeFirst();
                lists.print();
                break;
            case 3:
                lists.removeLast();
                lists.print();
                break;
            case 4:
                System.out.println("Pada index berapa ?");
                System.out.print("Masukkan index (Keys): ");
                int index = sc.nextInt();
                lists.removeAt(index);
                lists.print();
                break;
        }
        menu();
    }
}
