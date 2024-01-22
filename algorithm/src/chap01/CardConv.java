package chap01;

import java.util.Scanner;

public class CardConv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int no, cd,dno,retry;
        char[] cno = new char[32];
        System.out.println("10진수 기수변환");
        do{
            do{
                System.out.println("음이 아닌 정수");
                no = scan.nextInt();
            }while(no < 0 );

            do{
                System.out.println("뭘루?");
                cd = scan.nextInt();
            }while(cd < 2 || cd > 36);
            dno=conv(no,cd,cno);
            System.out.println(cd + "로 ㄱ");
            for(int i =0; i<dno; i++){
                System.out.println(cno[i]);
            }
            System.out.println("요");
            System.out.println("ㄹ?");
            retry=scan.nextInt();
        }while(retry==1);


    }

    static int conv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "012345679ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        do{
            d[digits++] = dchar.charAt(x % r );
            x /= r ;

        }while( x != 0 );

        for(int i=0; i<digits /2;i++){
            char t = d[i];
            d[i] = d[digits - i -1];
            d[digits - i - 1] = t;

        }
        return digits;
    }
}