package chap01;

import java.util.Scanner;

public class GuGuDanEulWaeja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("구구다늘외자구구다늘외자일일~");
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.printf("%3d",i*j);
            }
            System.out.println();
        }
    }
}