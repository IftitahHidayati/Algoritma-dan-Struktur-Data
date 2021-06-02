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
public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
//        bt.insert(2);
        
        System.out.println("-----------------------------");
        System.out.println("Total leaf adalah " + bt.getLeafCount());
        System.out.println("-----------------------------");
//        bt.leafCount(bt.root);
        System.out.println("-----------------------------");
        bt.minMax();
        System.out.println("-----------------------------");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find : " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}
