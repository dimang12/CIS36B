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
        int menu_option = 0;
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Conversion conv = new Conversion();
        
        System.out.print("Please enter eight in pounds:");
        conv.setWeight(sc.nextInt());
        
        
        
        // TODO: allow choose convert options 
        
        while(menu_option != 5){
            conv.printProgrameMenu();
            menu_option = sc.nextInt();
            
            switch(menu_option){
            case 1:
                System.out.printf("%s pounds on Earth will equal to %s on Mercury.\n", conv.getWeight(), conv.convMercury());
                break;
            case 2:
                System.out.printf("%s pounds on Earth will equal to %s on Venus.\n", conv.getWeight(), conv.convVenus());
                break;
                
            case 3: 
                System.out.printf("%s pounds on Earth will equal to %s on Earth's Moon.\n", conv.getWeight(), conv.convMoon());
                break;
            
            case 4:
                System.out.printf("%s pounds on Earth will equal to %s on Mars.\n", conv.getWeight(), conv.convMars());
                break;
            
            default:
                System.out.println("Please choose 1, 2, 3, or 4 instead.");
                break;
        }
        }
        
        
    }
    
    
}
