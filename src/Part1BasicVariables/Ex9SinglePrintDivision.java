package Part1BasicVariables;

import java.util.Scanner;

public class Ex9SinglePrintDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();
        if (b == 0 ){
            System.out.println("Lỗi: b khác 0!");
            return;
        }
        System.out.println( a + " / " + b + " = " + ((double)a / b));
    }
}
