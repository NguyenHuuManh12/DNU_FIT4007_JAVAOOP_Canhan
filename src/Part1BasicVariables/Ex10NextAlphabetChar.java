package Part1BasicVariables;

import java.util.Scanner;

public class Ex10NextAlphabetChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ký tự  từ 'a' đến 'y': ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'y') {
            char nextChar = (char)(ch + 1);
            System.out.println("Ký tự liền sau '" + ch + "' là: " + nextChar);
        } else {
            System.out.println("Lỗi: Bạn phải nhập một ký tự thường từ 'a' đến 'y'.");
        }
    }

}
