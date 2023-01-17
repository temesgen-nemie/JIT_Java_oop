/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding;

/**
 *
 * @author Fasil
 */
class A
{
    public  void Show()
    {
       System.out.println("This is in a class A");
    }
}
class B extends A
{
   @Override
    public void Show()
    {
       System.out.println("This is in class B");
    }
    
}
public class Overriding {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      B c=new B();
      c.Show();
    }
    

    
}

    

