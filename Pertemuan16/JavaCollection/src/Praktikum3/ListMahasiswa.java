/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Iftitah Hidayati
 */
public class ListMahasiswa {

    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int LinearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ListMahasiswa lm = new ListMahasiswa();

        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
//        menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
//        menampilkan list mahasiswa
        lm.tampil();
//        update mahasiswa
//        lm.update(lm.LinearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        Mahasiswa mhs = new Mahasiswa("201235", null, null);
        lm.update(Collections.binarySearch(lm.mahasiswas, mhs, new MhsComparator()),
                new Mahasiswa("201235", "Akhleema", "021xx2"));
        System.out.println("");
        lm.tampil();
        System.out.println("");
        System.out.println("-------------------ASCENDING--------------------");
        Collections.sort(lm.mahasiswas, (Mahasiswa o1, Mahasiswa o2) -> o1.nim.compareTo(o2.nim));
        lm.tampil();
        System.out.println("");
        System.out.println("-------------------DESCENDING--------------------");
        Collections.sort(lm.mahasiswas, Collections.reverseOrder((Mahasiswa o1, Mahasiswa o2) -> o1.nim.compareTo(o2.nim)));
        lm.tampil();
    }
}
