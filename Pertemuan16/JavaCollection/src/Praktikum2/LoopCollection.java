/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;
/**
 *
 * @author Iftitah Hidayati
 */
public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        
        System.out.println("\n" + fruits.toString());
        
        while(!fruits.empty()){
            System.out.printf("%s ", fruits.pop());
        }
        
        fruits.push("Melon");
        fruits.push("Durian");
        fruits.add("Strawberry");
//        fruits.sort(Comparator.comparing(String::));
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
        
        fruits.push("Mango");
        fruits.push("guava");
        fruits.push("avocado");
        System.out.println("");
        Collections.sort(fruits);
        System.out.println("===================");
        System.out.println("      SORTING");
        System.out.println("===================");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s \n", fruits.get(i));
        }
        System.out.println("===================");
    }
}
