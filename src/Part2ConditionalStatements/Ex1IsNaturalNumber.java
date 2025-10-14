package Part2ConditionalStatements;

import java.util.Scanner;

public class Ex1IsNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N: ");
        int N = scanner.nextInt();
        if (N >= 0) {
            System.out.println(N + " là số tự nhiên.");
        } else {
            System.out.println(N + " không phải là số tự nhiên.");
        }
    }

}
