
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class tugas1 {

    public static void main(String[] args) {
        int tarif = 4500;
        double temp = 0;
        int pendapatan = 0;
        int baju;
        int customer;
        Scanner input = new Scanner(System.in);

        System.out.print("Total Pelanggan Hari Ini : ");
        customer = input.nextInt();
        for (int i = 0; i < customer; i++) {
            System.out.print("Baju : " );
            baju = input.nextInt();
            temp = baju * tarif;
            if (baju > 10) {
                temp = temp * 0.95;
            }
            pendapatan += temp;
        }
        System.out.println("Pendapatan : " + pendapatan);
    }
}
