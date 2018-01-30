/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Conversion conv = new Conversion();
        
        System.out.print("Please enter eight in pounds:");
        conv.setWeight(sc.nextInt());
        
        conv.printProgrameMenu();
//        System.out.println("" + conv.getWeight());
        
    }
    
    
}
