package shapes;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){
        ten = "Hinh vuong";
    }
    public void HinhVuong() {
        System.out.println("nhap canh hinh vuong");
        Scanner scanner = new Scanner(System.in);
        this.dai = this.rong = scanner.nextFloat();
    }
    
}