package Part3SwitchCase;

import java.util.Scanner;

public class Ex3DirectionFromChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự trong NEWS (N, E, W, S): ");
        char ch = scanner.next().toUpperCase().charAt(0); // chuyển về chữ hoa

        switch (ch) {
            case 'N':
                System.out.println("Hướng Bắc");
                break;
            case 'S':
                System.out.println("Hướng Nam");
                break;
            case 'E':
                System.out.println("Hướng Tây");
                break;
            case 'W':
                System.out.println("Hướng Đông");
                break;
            default:
                System.out.println("Ký tự không hợp lệ. Vui lòng nhập N, E, W hoặc S.");
        }
    }

}
