/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author Fasil
 */
import java.util.Scanner;
public class Array {
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of an array you want to create ");
       int x=input.nextInt();
        int[]a;
        a=new int[x];
        for (int i=0;i<a.length;i++)
        {
            System.out.println("enter the elements of an array index " +i);
            a[i]=input.nextInt();
        }
          
     System.out.print("The list of the array elements are:");
        for(int j=0;j<a.length;j++)
        {
            System.out.print(a[j]+" ");
        }
        int sum=0;
        for(int k=0;k<a.length;k++)
        {
            sum+=a[k];
        }
        System.out.println();
        System.out.println("The sum of the elements of arrays are: " +sum);
              
    int max=a[0];
 System.out.print("The maximum value from the elements of arraya is: ");
      for(int l=0;l<a.length;l++)  
      {
          if(a[l]>max)
          {
              max=a[l];
          }
    }
      System.out.println(max);
                   
    int min=a[0];
 System.out.print("The minimum value from the elements of arraya is: ");
      for(int l=0;l<a.length;l++)  
      {
          if(a[l]<min)
          {
              min=a[l];
          }
    }
      System.out.println(min);
      System.out.println("THIS IS DISPLAYING ARRAY BY PASSING ARGUMENT TO A METHOD: ");
     Display(a); 
     System.out.println();
             
     System.out.println("listing elements of an array in reverse order with a void function ");
     Reverse(a);
   
}
  
   
     
public static void Display(int[]array)
      {
          for(int i=0;i<array.length;i++)
              System.out.println(array[i]+" ");
      }
public static void Reverse(int[]list)
{
    int y=list.length;
int z=y/2;
     for(int i=0;i<z;i++)
   {
       int temp=list[i];
               list[i]=list[y-i-1];
               list[y-1-i]=temp;
    for (int p=0;p<=y-1;p++)
        {
            System.out.println(" "+list[p]+" ");
        }
   }
     
}
public static int[]Reverse2(int[]list2)
{
/**    int w=list2.length;
    int []result=new int[w];
    for(int i=0,int j=w-1;i<=w-1;i++,j--)
    {
       result[j]=list2[i]; 
    }*/
  return  list2; 
}}


    

