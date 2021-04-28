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
public class Node {
    String norek, nama, alamat;
    Node next;
    
    public Node (Node berikutnya, String... a){
        this.next=berikutnya;
        this.norek=a[0];
        this.nama=a[1];
        this.alamat=a[2];
    }
}
