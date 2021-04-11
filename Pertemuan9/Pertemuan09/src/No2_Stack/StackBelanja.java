/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2_Stack;

/**
 *
 * @author Iftitah Hidayati
 */
public class StackBelanja {
    int size;
    int top;
    StrukBelanja data[];
  
    public StackBelanja(int size) {
        this.size = size;
        data = new StrukBelanja[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean IsFull(){
        if (top == size-1) {
            return true;
        }else{
            return false;
        }
    }
    
    public void push(StrukBelanja sb){
        if (!IsFull()) {
            top++;
            data[top] = sb;
        }else{
            System.out.println("Isi stack penuh!");
        }
    } 
    
    public void pop(){
        if (!IsEmpty()) {
            StrukBelanja x = data[top];
            top--;
            System.out.println("--------------------------------------------------------");
            System.out.println("Struk yang diambil : " + x.noTransaksi + " " + 
                    x.tanggalPembelian + " " + x.jumlahBarang + " " + x.totalHarga);
            System.out.println("--------------------------------------------------------");
        }else{
            System.out.println("--------------------------------------------------------");
            System.out.println("                 Stack masih kosong");
            System.out.println("--------------------------------------------------------");
        }
    }
    
    public int peek(){
        return top;
    }
    
//    public void print(){
//        System.out.println("Isi stack : ");
//        for (int i = top; i >= 0; i--) {
//            System.out.println(data[i].noTransaksi + " " + data[i].tanggalPembelian + 
//                    " " + data[i].jumlahBarang + " " + data[i].totalHarga);
//        }
//        System.out.println("");
//    }
    
//    public void clear(){
//        if (!IsEmpty()) {
//            for (int i = top; i >= 0; i--) {
//                top--;
//            }
//            System.out.println("Stack sudah dikosongkan");
//        }else{
//            System.out.println("Gagal! Stack masih kosong");
//        }
//    }
}
