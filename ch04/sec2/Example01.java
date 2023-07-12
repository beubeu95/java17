package sec2;

import java.util.Arrays;

public class Example01 {
    public static void main(String[] args) {
        int a =0;
        int[] intArr = new int[3];
        double[]doubleArr = new double[3];
        boolean[] booleansArr = new boolean[3];
        String[] strArr = new String[3];


        System.out.println("a=" +a);
        System.out.println("intArr="+intArr);

        for(int b:intArr){
            System.out.println(b);
        }

        System.out.println("\n-------------\n");
        System.out.println("intArr : "+Arrays.toString(intArr));
        System.out.println("doubleArr : "+Arrays.toString(doubleArr));
        System.out.println("booleansArr : "+Arrays.toString(booleansArr));
        System.out.println("strArr : "+Arrays.toString(strArr));
    }
}
