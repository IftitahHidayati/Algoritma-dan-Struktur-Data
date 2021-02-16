
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
public class tugas3 {

    public static void main(String[] args) {
        int bil;
        Scanner input = new Scanner(System.in);

        System.out.print("Input n : ");
        bil = input.nextInt();
        int i = 0;
        int angka = 1;
        
//      CARA KE 1
        while (i < bil) {
            int temp = angka * 2;
            angka++;
            if (temp % 4 == 0) {               
                continue;
            } else {
                System.out.print(temp + " ");
                i++;
            }
        }System.out.println("");
        
        
//      CARA KE 2
//        int hasil;
//        for (int j = 0; j < bil; j++) {
//            do{
//            hasil = angka * 2;
//            angka++;                
//            }while(hasil %4==0);
//            System.out.print(hasil+" ");
//        }
//        System.out.println("");
    }
}
