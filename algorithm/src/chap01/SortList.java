package chap01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = new Random().nextInt(100);
        int[]x = new int[num];
        for(int i=0;i<num;i++){
            x[i]=new Random().nextInt(100);
        }
        ReverseArray.reverse(x);
        System.out.println("x = "+ Arrays.toString(x));

    }

    static class ReverseArray{
        static void swap(int[] a,int idx1, int idx2){
                int t=a[idx1];
                a[idx1]=a[idx2];
                a[idx2]=t;
        }
        static void reverse(int[] a){
            for(int i=0; i<a.length/2;i++){
                swap(a,i,a.length-1-i);
            }
        }
    }
}