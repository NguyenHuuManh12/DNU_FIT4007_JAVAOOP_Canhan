package Part1BasicVariables;

import java.util.Scanner;

public class Ex5StudentBirthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của sinh viên: ");
        int tuoi = scanner.nextInt();
        int namSinh = 2023 - tuoi;
        System.out.println("Năm sinh của sinh viên là: " + namSinh);
        scanner.close();
    }
}
