package Part2ConditionalStatements;

import java.util.Scanner;

public class Ex9PerfectSquareChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            double sqrt = Math.sqrt(N);

            if (sqrt == (int) sqrt) {
                System.out.println(N + " là số chính phương.");
            } else {
                System.out.println(N + " không phải là số chính phương.");
            }
        }
    }

}
