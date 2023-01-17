/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops;

class While
{
    public void ShowW(int x)
    {
        
        int i=1;
        System.out.println("USING WHILE LOOP: 1 "+"to "+x);
              while(i<=x)
              {
                  
                  System.out.println(i);
                  i++;
                         
              }
    }
}
class Do_While
{
    public void ShowD(int x)
    {
        int i=1;
        System.out.println(" USING DO WHILE: 1 "+"to "+x);
              do
              {
                  System.out.println(i);
                  i++;
              }while(i<=x);
    }
}

public class Loops {

    public static void main(String[] args) {
        
      While W=new While();
      W.ShowW(10);
      Do_While D=new Do_While();
      D.ShowD(10);
    }
    
}
