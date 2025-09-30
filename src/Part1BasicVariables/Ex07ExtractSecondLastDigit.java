package Part1BasicVariables;

import java.util.Scanner;

public class Ex07ExtractSecondLastDigit {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N (có ít nhất 2 chữ số ): ");
        int n = sc.nextInt();

        if(Math.abs(n)<10){
            System.out.println("Lỗi, ít nhất phải 2 chữ số: ");
            return;
        }
        int absN = Math.abs(n);
        int lastDigit = absN % 10;
        System.out.print("Chữ số cuối " + n + " là: " + lastDigit);
    }
}
