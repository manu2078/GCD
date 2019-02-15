/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Manisha
 */
public class Gcdcmd {
  private static int iterativeGcd(int a, int b) {
        while (b != 0) {
            final int temp = a % b;
            a = b;
            b = temp;
        }
        System.out.print(" GCD = ");
        return a;
    }
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
static boolean quit= false;
   public static void main(String[] args) throws IOException {
        if(args.length == 0) {
        Process p = Runtime.getRuntime().exec("cmd.exe /c start java -jar " + (new File(Gcdcmd.class.getProtectionDomain().getCodeSource().getLocation().getPath())).getAbsolutePath() + " cmd");
    } else {do
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first integer for GCD :");
        int a = Integer.parseInt(sc.readLine());
        System.out.println("Please enter Second integer for GCD");
        int b = Integer.parseInt(sc.readLine());
      if (a==0 && b==0){
          
       System.out.print("number :18 & : 26 -");
    System.out.println(iterativeGcd(18,26));
    
        System.out.print("number :122 & : 10 -"); 
    System.out.println(iterativeGcd(122,10));
        
         System.out.print("number :10 & : 100 -");
   System.out.println(iterativeGcd(10,100));
   
         System.out.print("number :5 & : 50 -");
    System.out.println(iterativeGcd(5,50));
    
         System.out.print("number :16 & : 98 -");
    System.out.println(iterativeGcd(16,98));
    
        System.out.print("number :49 & : 21 -");
    System.out.println(iterativeGcd(49,21));
    
         System.out.print("number :252 & : 105 -");
   System.out.println(iterativeGcd(252,105));
        
   
         System.out.print("number :8 & : 12 -");
    System.out.println(iterativeGcd(8,12));
    
         System.out.print("number :462 & : 1071 -");
    System.out.println(iterativeGcd(462,1071));

      }
        System.out.println(iterativeGcd(a, b));
        
         System.out.println(" Please press Enter to continue or exit!!!");
            String command =sc.readLine();
            switch(command){
                case"exit":
                    System.out.println("Exiting Program");
                    
                    quit = true;
                     break;
               default:
                    System.out.println("please check and type again");
                   command= sc.readLine();
                   
                }
        
        }while (!quit);
    } 
            
   }
  
   
}