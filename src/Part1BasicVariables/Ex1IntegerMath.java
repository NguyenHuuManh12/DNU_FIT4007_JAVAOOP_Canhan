package Part1BasicVariables;

import java.util.Scanner;

public class Ex1IntegerMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2 số nguyên
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        // tính
        int tong = a + b;
        int tich = a - b;
        int hieu = a * b;
        // lỗi chia cho 0
        if (b != 0 ){
            float thuong = (float) a/b;
            System.out.print("Thường: " + thuong);
        } else {
            System.out.print("Không chia cho 0!");
        }

        System.out.print("Tong: " + tong);
        System.out.print("Tích: " + tich);
        System.out.print("Hieu: " + hieu);
        sc.close();
    }
}
