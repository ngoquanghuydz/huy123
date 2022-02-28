
package App1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */

public class App4 {
    private static final Scanner scanner = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("Nhập vào 1 số : ");
       int n = scanner.nextInt();
       System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (SNT(i)) {
                System.out.print(" " + i);
            }
        }
    }
     public static boolean SNT(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
