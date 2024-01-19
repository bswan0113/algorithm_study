package chap01;

import java.util.Scanner;

public class AreWeAllLostStars {

    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int w = scan.nextInt();

     printStars1(w,n);
        System.out.println("---------------------------------");
     printStars2(w,n);
    }

    private static void printStars2(int w, int n) {
        for(int i=0; i<n;i++){
            System.out.print("*");
            if(i%w==w-1){
                System.out.println();
            }
        }if(n%w != 0){
            System.out.println();
        }
    }

    private static void printStars1(int w, int n) {
        for(int i = 0; i< n / w; i++) System.out.println("*".repeat(w));
        int rest = n% w;
        if(rest != 0) System.out.println("*".repeat(rest));
    }

}
