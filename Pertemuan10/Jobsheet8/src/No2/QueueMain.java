/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

import java.util.Scanner;

/**
 *
 * @author Iftitah Hidayati
 */
public class QueueMain {

    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int max;
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("=======================================================");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextInt();
                    System.out.println("=======================================================");
                    Mahasiswa p = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(p);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    System.out.println("=======================================================");
                    if (!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0 && data.ipk != 0) {
                        System.out.println("Antrian yang keluar: " + data.nim + " " + data.nama + " "
                                + data.absen + " " + data.ipk);
                        System.out.println("=======================================================");
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.println("=======================================================");
                    System.out.print(" Cari data: ");
                    String cari = sc.nextLine();
                    antri.peekPosition(cari);
                    break;
                case 7:
                    System.out.println("=======================================================");
                    System.out.print(" Tampil data ke: ");
                    int posisi = sc.nextInt();
                    antri.printMahasiswa(posisi);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);

    }
}
