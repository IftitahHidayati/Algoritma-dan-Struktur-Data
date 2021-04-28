/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomer5;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class SLLMain {
    static void menu(){
        System.out.println("================================================");
        System.out.println("      QUEUE NASABAH BANK DENGAN LINNKED LIST");
        System.out.println("================================================");
        System.out.println("1. Tambah antrian nasabah dengan Enqueue");
        System.out.println("2. Hapus antrian nasabah dengan Dequeue");
        System.out.println("3. Lihat antrian terdepan dengan Peek");
        System.out.println("4. Mencari posisi antrian dengan Peek Position");
        System.out.println("5. Cetak daftar antrian dengan Print");
        System.out.println("0. Keluar program");
        System.out.println("================================================");
        System.out.print("Pilih: ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Nama: Iftitah Hidayati(14-1H)\n");
        
        SLL  singLL=new SLL();
        int pilih;
        do{
            menu();
            pilih=sc.nextInt();
//            System.out.println("------------------------------------------------");
            switch(pilih){
                case 1:
                    sc.nextLine();
                    System.out.println("------------------------------------------------");
                    System.out.print("Masukkan No. Rek: ");
                    String rek=sc.nextLine();
                    System.out.print("Masukkan Nama\t: ");
                    String nama=sc.nextLine();
                    System.out.print("Masukkan Alamat\t: ");
                    String alamat=sc.nextLine();
                    System.out.println("------------------------------------------------");
                    singLL.addLast(rek, nama, alamat);
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    singLL.removeFirst();
                    System.out.println("Berhasil menghapus antrian");
                    System.out.println("------------------------------------------------");
                    break;
                case 3:
                    System.out.println("------------------------------------------------");
                    singLL.getDataHead();
                    System.out.println("------------------------------------------------");
                    break;
                case 4:
                    System.out.println("------------------------------------------------");
                    System.out.print("Masukkan No. Rek yang dicari: ");
                    sc.nextLine();
                    String key=sc.nextLine();
                    System.out.println("------------------------------------------------");
                    singLL.getPosition(key);
                    System.out.println("------------------------------------------------");
                    break;
                case 5:
                    singLL.print();
                    break;
                default:
                    if (pilih>5 && pilih<0) {
                        System.out.println("Pilihan salah!");
                    }
                    break;
            }
            System.out.println("");
        }while(pilih!=0);
    }
}
