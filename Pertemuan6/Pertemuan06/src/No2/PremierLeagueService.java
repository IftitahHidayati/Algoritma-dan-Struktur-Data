package No2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class PremierLeagueService {

    PremierLeague[] leagues = new PremierLeague[20];
    int idx = 0;

    void tambah(PremierLeague m) {

        if (idx < leagues.length) {
            leagues[idx] = m;
            idx++;
        } else {
            System.out.println("Data Leagues sudah penuh!!");
            System.out.println("===============================================");
        }
    }

    void Alltampil() {
        System.out.println("===============================================");
        for (int i = 0; i < leagues.length; i++) {
            System.out.println(leagues[i].team + " " + leagues[i].play + " "
                    + leagues[i].goal + " " + leagues[i].point);
        }
        System.out.println("===============================================");
    }

    void insertionSort(boolean asc) {
        if (asc == true) {
            for (int i = 1; i < leagues.length; i++) {
                PremierLeague temp = leagues[i];
                int j = i;
                while (j > 0 && leagues[j - 1].point > temp.point) {
                    leagues[j] = leagues[j - 1];
                    j--;
                }
                leagues[j] = temp;
            }
        }else {
            for (int i = 1; i < leagues.length; i++) {
                PremierLeague temp = leagues[i];
                int j = i;
                while (j > 0 && leagues[j - 1].point < temp.point) {
                    leagues[j] = leagues[j - 1];
                    j--;
                }
                leagues[j] = temp;
            }
        }
    }
}
