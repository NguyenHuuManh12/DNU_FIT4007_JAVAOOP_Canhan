package Part3SwitchCase;

import java.util.Scanner;

public class Ex2GenderIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã giới tính (0: Nam, 1: Nữ, 2: Khác): ");
        int gender = sc.nextInt();

        switch (gender) {
            case 0:
                System.out.println("Giới tính: Nam");
                break;
            case 1:
                System.out.println("Giới tính: Nữ");
                break;
            case 2:
                System.out.println("Giới tính: Khác");
                break;
            default:
                System.out.println("Mã giới tính không hợp lệ.");
        }
    }

}
