/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author student
 */
public class Conversion {
    private int weight = 0;
    
    public void setWeight(int weight){
        this.weight = weight;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public void printProgrameMenu(){
        System.out.println("*****************************************");
        System.out.println("*Main Menu:");
        System.out.println("* Enter # to run program or Quit\t*");
        System.out.println("* 1) Calculate weight on Mercury\t*");
        System.out.println("* 2) Calculate Weight on Venus\t\t*");
        System.out.println("* 3) Calculate Weight on Earth's Moon\t*");
        System.out.println("* 4) Calculate Weight on Mars\t\t*");
        System.out.println("* 5) Quit\t\t\t\t*");
        System.out.println("*****************************************");
    }
    
}
