package chap01;

import java.util.Random;
import java.util.Scanner;

public class randomTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num = new Random().nextInt(20)+1 ;
        int[] height = new int[num];
        for(int i=0; i<num;i++){
            height[i]=100+rand.nextInt(90);
            System.out.println("height["+i+"]: "+height[i]);
        }
        System.out.println("max is "+MaxOfArrayRanbd.maxOf(height));
    }

    static class MaxOfArrayRanbd{
        static int maxOf(int []a){
            int max =a[0];
            for(int i=1; i<a.length; i++){
                if(a[i]>max)max = a[i];
            }
            return max;
        }
    }
}