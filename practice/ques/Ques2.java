package ques;

public class Ques2 {
    public static void main(String[] args){
        int [] arr = {90,80,85,75,95};
        int tot = 0;
        double avg = 0;
        for(int i =0;i<arr.length;i++){
               tot+=arr[i];
        }
        avg = (double) tot/ arr.length;

        System.out.println("총점 : "+tot);
        System.out.println("평균 : "+avg);
    }
}
