/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package isstach;
import java.util.Scanner;
/**
 *
 * @author Fasil
 */
public class IsStach {

    static boolean isSacked(int a){
    //static int isSacked(int a) {
        int sum = 0;
        for (int i = 0; i <=a; i++) {
            sum =sum+i;
           if(sum>=a)
               break;
        }
        if (sum==a){
            //return 1;
        return true;
        }
        else { 
       // return 0;
        return false;
        }   
    }
    public static void main(String[] arg) {
        System.out.println("checking weather stack number  or not");
         System.out.println("enter your number");
  Scanner scan=new Scanner(System.in);     
  int a=scan.nextInt();
 System.out.println(isSacked(a)); 

    }
   
}
