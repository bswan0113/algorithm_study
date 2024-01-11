package chap01;

import java.util.Scanner;

public class Practice9To10 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        practice10(scan);
    }
    static void practice9(Scanner scan){
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(b-a);
    }

    static void practice10(Scanner scan){
        int a = scan.nextInt();
        for(int i=1; ;i++){
            if(a>=10){
                a/=10;
            }else{
                System.out.println("그 수는 "+i+"자리입니다.");
                break;
            }

        }
    }
}
