package Part1BasicVariables;

import java.util.Scanner;

public class Ex6LastDigitFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số Nguyên: ");
        int n = sc.nextInt();

        int lastDigit = Math.abs(n % 10);
        System.out.println("Chữ số cuối cùng là:  " + lastDigit);
    }
}
