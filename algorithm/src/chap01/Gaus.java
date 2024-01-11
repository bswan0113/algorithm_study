package chap01;

public class Gaus {
    
    public static void main(String[] args){
        System.out.println(practice1(10));
        System.out.println(practice1(100));
        System.out.println(practice2(1,10));
        System.out.println(practice2(1,100));
        System.out.println(practice2(50,100));
    }

    static int practice1(int finalNum){
        return (1+finalNum)*finalNum/2;

    }

    static int practice2(int index0, int indexLast){
        return (index0+indexLast)*(indexLast-index0+1)/2;
    }
}
