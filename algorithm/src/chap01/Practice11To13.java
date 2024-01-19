package chap01;

import java.util.Scanner;

public class Practice11To13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("   ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("   ---------------------------");

        // 구구단 표 출력
        for (int i = 1; i <= 9; i++) {
            // 좌측 끝에 단수 출력
            System.out.printf("%2d|", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}