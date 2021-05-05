/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo3;

/**
 *
 * @author Iftitah Hidayati
 */
public class Node {
    int antrian;
    String data;
    Node prev, next;
    
    Node(Node prev, int antrian, String data, Node next){
        this.prev=prev;
        this.antrian = antrian;
        this.data=data;
        this.next=next;
    }
}
