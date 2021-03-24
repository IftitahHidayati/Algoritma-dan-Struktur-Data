/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author USER
 */
public class MainTiket {

    public static void main(String[] args) {
        TiketService list = new TiketService();
        Tiket m1 = new Tiket();
        Tiket m2 = new Tiket();
        Tiket m3 = new Tiket();
        Tiket m4 = new Tiket();
        Tiket m5 = new Tiket();

        m1.Tiket("Lion\t\t", 100000, "     Prob", "\t Malang");
        m2.Tiket("Garuda\t\t", 250000, "     Bali", "\t Jakarta");
        m3.Tiket("Lion\t\t", 150000, "     Surabaya", "\t Bali");
        m4.Tiket("Batik\t\t", 200000, "     Bali", "\t Prob");
        m5.Tiket("Sriwijaya\t", 250000, "     Jakarta", "\t Malang");

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("======================================================");
        System.out.println("   Daftar Tiket yang Masih Tersedia sebelum sorting");
        list.Alltampil();

        System.out.println("   Daftar Tiket setelah Sorting dengan Bubble Sort");
        list.bubbleSort(true);
        list.Alltampil();

        System.out.println("   Daftar Tiket setelah Sorting dengan Selection Sort");
        list.SelectionSort();
        list.Alltampil();
        
        System.out.println("\t\t List Tambahan Tiket");
        System.out.println("------------------------------------------------------");
        System.out.println("Warning : ");
        list.tambah(m4);
    }
}
