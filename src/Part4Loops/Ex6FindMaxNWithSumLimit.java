package Part4Loops;

import java.util.Scanner;

public class Ex6FindMaxNWithSumLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương S: ");
        int S = sc.nextInt();
        if (S <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
            return;
        }

        int sum = 0;
        int N = 0;

        while (sum + N + 1 <= S) {
            N++;
            sum += N;
        }

        System.out.println("Số nguyên dương N nhỏ nhất là: " + N);
        System.out.println("Tổng từ 1 đến " + N + " là: " + sum);
    }
}
