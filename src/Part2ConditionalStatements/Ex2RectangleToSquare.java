package Part2ConditionalStatements;

import java.util.Scanner;

public class Ex2RectangleToSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        if (length == width) {
            System.out.println("Hình chữ nhật này là hình vuông.");
        } else {
            System.out.println("Hình chữ nhật này không phải là hình vuông.");
        }
    }

}
