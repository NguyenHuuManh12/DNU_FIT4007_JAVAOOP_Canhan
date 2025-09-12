import java.util.Scanner;

public class bait5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhập tuổi
        System.out.print("Nhập tuổi của sinh viên: ");
        int tuoi = scanner.nextInt();
        // tính năm sinh
        int namSinh = 2023 - tuoi;
        // in kq
        System.out.println("Năm sinh của sinh viên là: " + namSinh);
        scanner.close();
    }
}
