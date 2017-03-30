/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a4_fastfood;

import java.util.Scanner;
import java.text.*;

/**
 *
 * @author EvMcQ5970
 */
public class U2_A4_FastFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat currency = new DecimalFormat("$#,###,###.00");
        //Variables
        int burgnum;
        int frynum;
        int softnum;
        double cost;
        //Getting user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of burgers: ");
        burgnum = input.nextInt();
        System.out.println("Enter the number of fries: ");
        frynum = input.nextInt();
        System.out.println("Enter the number of soft drinks: ");
        softnum = input.nextInt();
        
        
        
        //Individual Costs
        double burgcost = burgnum * 2.49;
        double frycost = frynum * 1.89;
        double softcost = softnum * 0.99;
        cost = burgcost + frycost + softcost;
        System.out.println("Total before taxes: " + (currency.format(cost)));
        
        //Tax
        double tax;
        tax = cost * 0.13;
        System.out.println("Tax: " + (currency.format(tax)));
        
        //Final cost
        double total;
        total = cost + tax;
        System.out.println("Final total: " + (currency.format(total)));
        
        //Amount tendered and change
        double tender;
        double change;
        System.out.println("Enter amount tendered ($xxx.xx format please): ");
        tender = input.nextDouble();
        
        change = tender - cost;
        System.out.println("Change: " + (currency.format(change)));
        
        input.close();
        
        if (change < 0) {
            System.out.println("I'm pretty sure that's stealing");
        } else {
            
        }
        
        
        
        
    }
    
}
