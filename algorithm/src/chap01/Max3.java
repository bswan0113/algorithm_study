package chap01;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args){



    }

    static int max3(int a, int b, int c){
        int max=a;
        if(b > max) max = b;
        if(c > max) max = c;
        return max;
    }
    static int max4(int a, int b, int c, int d){
        int max=a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        return max;
    }
    static int min3(int a, int b, int c){
        int max=a;
        if(b < max) max = b;
        if(c < max) max = c;
        return max;
    }
    static int min4(int a, int b, int c, int d){
        int max=a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d < max) max = d;
        return max;
    }

    static int med3(int a, int b, int c){
        if( a>= b){
            if(b >=c){
                return b;
            }else if( a<= c){
                return a;
            }else{
                return c;
            }
        }else if( a> c){
            return a;
        }else if(b > c){
            return c;
        }else{
            return b;
        }
    }


}
