/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Allcode;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class App35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n,m;
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số dương bất kì:  ");
        n = scanner.nextInt();
         System.out.println("Nhập vào 1 số dương bất kì:  ");
        m = scanner.nextInt();
        if(m>n){
             System.out.println("số nhỏ nhất là   " + n);
        }
        else
            System.out.println("số nhỏ nhất là     " + m);   
    }  // TODO code application logic here
    }
    

