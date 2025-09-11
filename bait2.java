import java.util.Scanner;

public class bait2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // bán kính hình tròn
        System.out.print("Nhập bán kính hình tròn: ");
        double r = scanner.nextDouble();
        // chu vi, diện tích
        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;
        // In kết quả
        System.out.println("Chu vi hình tròn là: " + chuVi);
        System.out.println("Diện tích hình tròn là: " + dienTich);
        scanner.close();
    }
}