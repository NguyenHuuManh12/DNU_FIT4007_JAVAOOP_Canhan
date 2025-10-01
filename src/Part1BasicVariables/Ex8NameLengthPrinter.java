package Part1BasicVariables;

import java.util.Scanner;

public class Ex8NameLengthPrinter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();

        int length = name.length();

        System.out.println("Độ dài tên của bạn là: " + length + " ký tự.");

    }
}
