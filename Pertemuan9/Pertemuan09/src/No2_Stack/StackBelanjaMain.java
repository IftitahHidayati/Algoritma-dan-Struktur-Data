/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2_Stack;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class StackBelanjaMain {

    public static void main(String[] args) {
        StackBelanja st = new StackBelanja(8);
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        StrukBelanja sb;
        char pilih;
        char menu;
        do {
            System.out.println("========================================================");
            System.out.println("                   Menu Operasi Stack");
            System.out.println("========================================================");
            System.out.println(" 1. Push");
            System.out.println(" 2. Tukar Voucher");
            System.out.println("========================================================");
            System.out.print("Pilih : ");
            int op = input.nextInt();
            
            if (op == 1) {
                do {
                    System.out.println("--------------------------------------------------------");
                    System.out.print(" No Transaksi: ");
                    int noTrans = sc.nextInt();
                    sc.nextLine();
                    System.out.print(" Tanggal Pembelian: ");
                    String tanggalPembelian = sc.nextLine();
                    System.out.print(" Jumlah barang yang dibeli: ");
                    int jmlBarang = sc.nextInt();
                    System.out.print(" Total harga bayar: ");
                    int total = sc.nextInt();
                    System.out.println("--------------------------------------------------------");
                    sb = new StrukBelanja(noTrans, tanggalPembelian, jmlBarang, total);
                    System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                    pilih = sc.next().charAt(0);
                    sc.nextLine();
                    st.push(sb);
                } while (pilih == 'y');
            } else if (op == 2) {
                if (st.peek() >= 4) {
                    for (int i = 0; i < 5; i++) {
                        st.pop();
                    }
                    System.out.println("********************************************************");
                    System.out.println("       Selamat Anda mendapatkkan voucher belanja");
                    System.out.println("********************************************************");
                } else {
                    System.out.println("********************************************************");
                    System.out.println("                 Struk masih kurang");
                    System.out.println("********************************************************");
                }
            } else {
                System.out.println("--------------------------------------------------------");
                System.out.println("Pilihan yang Anda masukkan salah");
            }
            System.out.println("--------------------------------------------------------");
            System.out.print("Apakah Anda akan melakukan operasi stack lagi (y/n)? ");
            menu = sc.next().charAt(0);
            sc.nextLine();
        } while (menu == 'y');
    }
}
