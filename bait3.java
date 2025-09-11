import java.util.Scanner;

public class bait3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //chiều dài, chiều rộng
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        // chu vi, diện tích
        double chuVi = 2 * (dai + rong);
        double dienTich = dai * rong;
        // in kq
        System.out.println("Chu vi hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
        scanner.close();
    }
}
