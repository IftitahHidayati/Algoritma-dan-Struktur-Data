/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomer4;

/**
 *
 * @author Iftitah Hidayati
 */
public class Node {
    Node next;
    Nasabah data; 
    
    public Node(Nasabah data, Node berikutnya) {
        this.data = data;
        this.next = berikutnya;
    }
}
