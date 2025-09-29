package Part1BasicVariables;

import java.util.Scanner;

public class Ex2CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // bán kính hình tròn
        System.out.print("Nhập bán kính hình tròn: ");
        double r = scanner.nextDouble();
        // chu vi, diện tích
        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;
        // in
        System.out.println("Chu vi hình tròn là: " + chuVi);
        System.out.println("Diện tích hình tròn là: " + dienTich);
        scanner.close();
    }
}