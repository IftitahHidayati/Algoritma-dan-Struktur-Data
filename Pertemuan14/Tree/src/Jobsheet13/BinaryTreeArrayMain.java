/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet13;

/**
 *
 * @author Iftitah Hidayati
 */
public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};

        
        bta.populateData(data);
        bta.traverseInOrder(0);
        System.out.println("");
        bta.traversePostOrder(0);
        System.out.println("");
        bta.traversePreOrder(0);

        
        System.out.println("");
        bta.addData(2);
        System.out.println(""); 
    }
}
