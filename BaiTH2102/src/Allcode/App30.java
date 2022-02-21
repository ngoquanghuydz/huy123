/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App30;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class App30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n, Tong=0;
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số dương bất kì:  ");
        n = scanner.nextInt();
        
        if (n>0){ 
      
        int sotach= n % 10;
        Tong += sotach; 
        n = n /10;
        }
        System.out.println("Tổng các con số là =  " + Tong);  
// TODO code application logic here
    }
     
    }
    

