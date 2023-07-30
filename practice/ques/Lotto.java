package ques;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lotto{
    public static void main(String [] args){
        Integer [] lotto = new Integer[6];

        for(int i=0; i<lotto.length;i++){
            lotto[i]= (int)(Math.random()*44+1);
        }

        Set<Integer> gen = new HashSet<>(Arrays.asList(lotto));
        while(gen.size()<6){
            gen.add((int)(Math.random()*44+1));
        }

        lotto = gen.toArray(new Integer[6]);
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }
}