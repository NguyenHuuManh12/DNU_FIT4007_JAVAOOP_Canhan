package Part2ConditionalStatements;

import java.util.Scanner;

public class Ex15AddOneMinute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giờ (0 <= h < 24): ");
        int h = scanner.nextInt();
        System.out.print("Nhập phút (0 <= m < 60): ");
        int m = scanner.nextInt();

        if (h >= 0 && h < 24 && m >= 0 && m < 60) {
            m += 1;

            if (m == 60) {
                m = 0;
                h += 1;

                // Nếu giờ = 24 thì quay về 0
                if (h == 24) {
                    h = 0;
                }
            }

            System.out.printf("Thời gian sau 1 phút nữa là: %02d:%02d\n", h, m);
        } else {
            System.out.println("Giá trị giờ hoặc phút không hợp lệ.");
        }
    }

}
