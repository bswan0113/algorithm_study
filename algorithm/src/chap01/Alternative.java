package chap01;

import java.util.Scanner;

public class Alternative {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        practice1(scan);
        practice2(scan);
    }
    static void practice1(Scanner scan){
        int a = scan.nextInt();
        for(int i=0; i<a;i++){
            if(i%2 == 0){
                System.out.println("+");
            }else{
                System.out.println("-");
            }
        }
    }
    static void practice2(Scanner scan){
        int a = scan.nextInt();
        for(int i =0; i<a/2;i++){
            System.out.println("+-");
        }
        if(a%2 !=0){
            System.out.println("+");
        }
    }
}
