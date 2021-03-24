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
public class MainLeague {

    public static void main(String[] abcd) {
        PremierLeagueService list = new PremierLeagueService();
        PremierLeague m1 = new PremierLeague();
        PremierLeague m2 = new PremierLeague();
        PremierLeague m3 = new PremierLeague();
        PremierLeague m4 = new PremierLeague();
        PremierLeague m5 = new PremierLeague();
        PremierLeague m6 = new PremierLeague();
        PremierLeague m7 = new PremierLeague();
        PremierLeague m8 = new PremierLeague();
        PremierLeague m9 = new PremierLeague();
        PremierLeague m10 = new PremierLeague();
        PremierLeague m11 = new PremierLeague();
        PremierLeague m12 = new PremierLeague();
        PremierLeague m13 = new PremierLeague();
        PremierLeague m14 = new PremierLeague();
        PremierLeague m15 = new PremierLeague();
        PremierLeague m16 = new PremierLeague();
        PremierLeague m17 = new PremierLeague();
        PremierLeague m18 = new PremierLeague();
        PremierLeague m19 = new PremierLeague();
        PremierLeague m20 = new PremierLeague();

        m1.PremierLeague("Liverpool                  ", 29, 45, 82);
        m2.PremierLeague("Manchester City            ", 27, 39, 57);
        m3.PremierLeague("Leichester City            ", 28, 26, 50);
        m4.PremierLeague("Chelsea                    ", 29, 9, 48);
        m5.PremierLeague("Wolverhampton Wanderers    ", 29, 7, 43);
        m6.PremierLeague("Sheffield United           ", 28, 5, 43);
        m7.PremierLeague("Manchester United          ", 28, 12, 42);
        m8.PremierLeague("Tottenham Hotspur          ", 29, 7, 41);
        m9.PremierLeague("Arsenal                    ", 28, 4, 40);
        m10.PremierLeague("Burnley                    ", 29, -6, 39);
        m11.PremierLeague("Crystal Palace             ", 29, -6, 39);
        m12.PremierLeague("Everton                    ", 29, -6, 37);
        m13.PremierLeague("Newcastle United           ", 29, -16, 35);
        m14.PremierLeague("Southampton                ", 29, -17, 34);
        m15.PremierLeague("Brighton & Hove Albion     ", 29, -8, 29);
        m16.PremierLeague("West Ham United            ", 29, -15, 27);
        m17.PremierLeague("Watford                    ", 29, -17, 27);
        m18.PremierLeague("AFC Bournemouth            ", 29, -18, 27);
        m19.PremierLeague("Aston Villa                ", 27, -18, 25);
        m20.PremierLeague("Norwich City               ", 29, -27, 21);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        list.tambah(m6);
        list.tambah(m7);
        list.tambah(m8);
        list.tambah(m9);
        list.tambah(m10);
        list.tambah(m11);
        list.tambah(m12);
        list.tambah(m13);
        list.tambah(m14);
        list.tambah(m15);
        list.tambah(m16);
        list.tambah(m17);
        list.tambah(m18);
        list.tambah(m19);
        list.tambah(m20);

        System.out.println("===============================================");
        System.out.println("    Premier League sebelum di sorting ");
        list.Alltampil();
        
        System.out.println(" Premier League Setelah Sorting Insertion Sort");
        System.out.println(" Sorting dari Terbesar ke Terkecil (Descending)");
        list.insertionSort(false);
        list.Alltampil();
        
        System.out.println(" Premier League Setelah Sorting Insertion Sort");
        System.out.println(" Sorting dari Terkecil ke Terbesar (Ascending)");
        list.insertionSort(true);
        list.Alltampil();
        
        System.out.println("        List Tambahan Premier League");
        System.out.println("-----------------------------------------------");
        System.out.println("Warning : ");
        list.tambah(m9);
    }
}
