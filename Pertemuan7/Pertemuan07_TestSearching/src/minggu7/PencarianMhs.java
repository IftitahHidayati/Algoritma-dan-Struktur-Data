/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author Iftitah Hidayati
 */
public class PencarianMhs {

    int idx;
    Mahasiswa listMhs[];

    PencarianMhs(int jumlah){
        listMhs = new Mahasiswa[jumlah];
    }
    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("------------------------");
        }
    }

    void SelectionSearch() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].nim < listMhs[idx].nim) {
                    idx = j;
                }
            }
            Mahasiswa temp = listMhs[idx];
            listMhs[idx] = listMhs[i];
            listMhs[i] = temp;
        }
    }

//    void insertionSort(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            int temp = array[i];
//            int j = i;
//            while(j>0 && array[j-1]>temp){
//                array[j] = array[j-1];
//                j--;
//            }
//            array[j] = temp;
//        }
//    }
//   ===== UNTUK NOMOR 2 ======
    public int FindSeqSearch2(String cari2) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nama.equalsIgnoreCase(cari2)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

//   ===== UNTUK NOMOR 1 ====== 
//    public int FindSeqSearch(int cari) {
//        int posisi = -1;
//        for (int j = 0; j < listMhs.length; j++) {
//            if (listMhs[j].nim == cari) {
//                posisi = j;
//                break;
//            }
//        }
//        return posisi;
//    }
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim) {
                return mid;
            } else if (listMhs[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void Tampilposisi2(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData2(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + x);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void AllData() {
        for (int i = 0; i < listMhs.length; i++) {
            System.out.println("Nim\t : " + listMhs[i].nim);
            System.out.println("Nama\t : " + listMhs[i].nama);
            System.out.println("Umur\t : " + listMhs[i].umur);
            System.out.println("IPK\t : " + listMhs[i].ipk);
        }
    }

}
