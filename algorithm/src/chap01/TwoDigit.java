package chap01;

import java.util.Scanner;

public class TwoDigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int no;
        System.out.println("증명하라");
        do{
            System.out.println("no::: {}");
            no=scan.nextInt();
        }while(no<10||no>99);

        System.out.println("변수 no의 값을 증명하라 ::: "+ no);
    }
}
