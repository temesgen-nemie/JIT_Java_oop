/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2exercise1;

/**
 *
 * @author Fasil
 */
import java.util.Scanner;
class Student {
    String name;
    int rol_no;
    
    Student(String name,int rol_no)
    {
        this.name=name;
        this.rol_no=rol_no;
       
    }
    public String getName(){
        return this.name;
    }
    public void getRol_no()
    {
        System.out.println("The student rol number is; "+rol_no);
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setRol_no(int rol_no)
    {
        this.rol_no=rol_no;
    }
    public void getNewName()
    {
        System.out.println("The new name entered is: "+name);
    }
    public void getNewRol_no()
    {
        System.out.println("The new rol_no entered is: "+rol_no);
    }
   
}

public class Ch2exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            Scanner input=new Scanner(System.in);
            Student stu1=new Student("sam",3);
        Student stu=new Student("JOHN",2);
               String n= stu.getName();
               System.out.println("THE FIRST SUDENT.");
              System.out.println("The student name is :" +n);
              stu.getRol_no();
              System.out.print("enter the new name: ");
               String thename=input.nextLine();
              
               System.out.print("enter the new rol_no: ");
              int x=input.nextInt();
              
                 
                      stu.setName(thename);
                     
                      stu.setRol_no(x);
                              stu.getNewName();
                              stu.getNewRol_no();
                              System.out.println("THE SECOND STUDENT :");
                              
                       String m= stu1.getName();
               
              System.out.println("The student name is :" +m);
              stu1.getRol_no();
                              
    }
    }
    
}
