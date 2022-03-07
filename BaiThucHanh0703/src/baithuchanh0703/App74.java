
package baithuchanh0703;
 import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class App74 {
 public static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử của mảng: ");
        in(arr);
          int tong = 0;
    for (int i = 0; i < arr.length; i++)
    {
        if (i % 2 == 0)
             tong += arr[i] ;
        }
        System.out.print("\n Tổng các phần tử chẳn trong mảng là: " + tong);
    }
     public static void in(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
     }
}
