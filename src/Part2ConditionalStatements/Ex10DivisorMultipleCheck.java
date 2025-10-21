package Part2ConditionalStatements;

import java.util.Scanner;

public class Ex10DivisorMultipleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số nguyên dương c: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            boolean isDivisor = a % b == 0;
            boolean isMultiple = b % c == 0;

            if (isDivisor && isMultiple) {
                System.out.println("b đồng thời là ước của a và là bội của c.");
            } else {
                System.out.println("b không đồng thời là ước của a và là bội của c.");
            }
        } else {
            System.out.println("Vui lòng nhập ba số nguyên dương.");
        }
    }

}
