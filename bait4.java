import java.util.Scanner;

public class bait4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhập cạnh tam giác
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();
        //điều kiện tam giác
        if (a + b > c && a + c > b && b + c > a) {
            // Tính chu vi
            double chuVi = a + b + c;
            // Tính nửa chu vi
            double p = chuVi / 2;
            // Áp dụng công thức Heron để tính diện tích
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            // in kq
            System.out.println("Chu vi tam giác là: " + chuVi);
            System.out.println("Diện tích tam giác là: " + dienTich);
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác hợp lệ!");
        }
        scanner.close();
    }
}
