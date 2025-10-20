package Part2ConditionalStatements;

import java.util.Scanner;

public class Ex5ValidScoreChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm số: ");
        double score = scanner.nextDouble();

        if (score >= 0 && score <= 10) {
            System.out.println(score + " là điểm số hợp lý.");
        } else {
            System.out.println(score + " không phải là điểm số hợp lý.");
        }
    }

}
