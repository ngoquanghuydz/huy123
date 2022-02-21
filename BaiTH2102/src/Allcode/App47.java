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
public class App47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, sum = 0;
    Scanner scanner = new Scanner(System.in);      
    do {
     System.out.println("Nhập vào số nguyên bất kỳ: ");
       n = scanner.nextInt();
       sum += n;
      
   } while (sum < 100); 
     System.out.println("Tổng các số nguyên vừa nhập = "+sum);
    } 
    }
    

