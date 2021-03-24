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
public class TiketService {

    Tiket[] tikets = new Tiket[5];
    int idx = 0;

    void tambah(Tiket m) {

        if (idx < tikets.length) {
            tikets[idx] = m;
            idx++;
            System.out.println("Tiket ke- "+ idx + " masih tersedia");
        } else {
            System.out.println("Tiket Sudah Penuh, Coba Kembali Nanti!");
            System.out.println("======================================================");
        }
    }

    void Alltampil() {
        System.out.println("======================================================");
        for (int i = 0; i < tikets.length; i++) {
            System.out.println(tikets[i].maskapai + " " + tikets[i].harga + " "
                    + tikets[i].asal + " " + tikets[i].tujuan);
        }
        System.out.println("======================================================");
    }

    // setelah ini tuliskan method bubbleSort()
    void bubbleSort(boolean bool) {
        for (int i = 0; i < tikets.length - 1; i++) {
            for (int j = 1; j < tikets.length - i; j++) {
                if (bool) {
                    // dibawah ini proses swap atau pertukan
                    if (tikets[j].harga < tikets[j - 1].harga) {
                        Tiket tmp = tikets[j];
                        tikets[j] = tikets[j - 1];
                        tikets[j - 1] = tmp;
                    }
                }
            }
        }
    }
    
    void SelectionSort(){
        for (int i = 0; i < tikets.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < tikets.length; j++) {
                if (tikets[j].harga<tikets[idxMin].harga) {
                    idxMin = j;
                }
            }
            Tiket tmp =tikets[idxMin];
            tikets[idxMin] = tikets[i];
            tikets[i] = tmp;
        }
    }
}
