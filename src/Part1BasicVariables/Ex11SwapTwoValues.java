package Part1BasicVariables;

import java.util.Scanner;

public class Ex11SwapTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Sau khi hoán đổi:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
