package Part4Loops;

import java.util.Scanner;

public class Ex2LoopFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        }
    }

}
