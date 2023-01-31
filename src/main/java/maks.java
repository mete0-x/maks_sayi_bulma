/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class maks {
    public static void main(String args[]){
    
    Scanner scanner = new Scanner(System.in);

     System.out.println("Birinci sayi :");
     int a = scanner.nextInt();
     System.out.println("ikinci sayi :");
     int b = scanner.nextInt();
     System.out.println("üçüncü sayi :");
     int c =  scanner.nextInt();

     int maks =-1;

      if(a > b && a > c){
        maks = a;
      }
      else if(b > a && b > c){
       maks = b;
      }
      else{
      maks = c;
      }
      System.out.print("maks sayi :" +maks);
}
}
