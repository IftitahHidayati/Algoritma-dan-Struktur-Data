/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomer5;

/**
 *
 * @author Iftitah Hidayati
 */
public class SLL {
    Node head, tail;
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void print(){
        if (!isEmpty()) {
            Node temp=head;
            System.out.println("------------------------------------------------");
            System.out.println("                DAFTAR NASABAH");
            System.out.println("------------------------------------------------");
            while(temp!=null){
                System.out.println("No Rekening\t: " + temp.norek);
                System.out.println("Nama Nasabah\t: " + temp.nama);
                System.out.println("Alamat\t\t: " + temp.alamat);
                System.out.println("");
                temp=temp.next;
            }
            System.out.println("------------------------------------------------");
        }else{
            System.out.println("------------------------------------------------");
            System.out.println("            Linked list kosong!");
            System.out.println("------------------------------------------------");
        }
    }
    
    public void addFirst(String norek, String nama,String alamat){
        Node nsbh = new Node(null,norek,nama,alamat);
        if (isEmpty()) {
            head=nsbh;
            tail=nsbh;
        }else{
            nsbh.next=head;
            head=nsbh;
        }
    }
    
    public void addLast(String norek, String nama,String alamat){
        Node nsbh=new Node(null,norek,nama,alamat);
        if (isEmpty()) {
            addFirst(norek,nama,alamat);
        }else{
            tail.next=nsbh;
            tail=nsbh;
        }
    }
    
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("------------------------------------------------");
            System.out.println("           Linked list masih kosong!");
            System.out.println("------------------------------------------------");
        }else if(head==tail){
            head=tail=null;
        }else{
            head=head.next;
        }
    }
    
    public void getDataHead(){
        Node temp=head;
        System.out.println("------------------------------------------------");
        System.out.println("Antrian terdepan: "+ temp.norek+" "+temp.nama+" "+temp.alamat);
        System.out.println("------------------------------------------------");
    }
    
    public void getPosition(String key){
        Node temp=head;
        int index=0;
        while(temp != null && !temp.norek.equals(key)){
            temp=temp.next;
            index++;
        }
        if (temp==null) {
            System.out.println("------------------------------------------------");
            System.out.println("Antrian nasabah tidak ditemukan!");
            System.out.println("------------------------------------------------");
        }else{
            System.out.println("------------------------------------------------");
            System.out.println("Antrian berada pada indeks ke-"+index+" antrian no "+(index+1));
            System.out.println("------------------------------------------------");
        }
    }
}
