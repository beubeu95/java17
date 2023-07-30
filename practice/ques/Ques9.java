package ques;

import java.util.Scanner;

public class Ques9{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        int studentNum = 0;
        int [] scores = null;

        while(run) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택>");
            int menuNum = sc.nextInt();
            if (menuNum == 1) {
                System.out.print("학생수>");
                studentNum = sc.nextInt();
                scores = new int[studentNum];

            } else if (menuNum == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]>");
                    scores[i] = sc.nextInt();
                }
            } else if (menuNum == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]:" + scores[i]);
                }
            } else if (menuNum == 4) {
                int max = 0;
                int tot = 0;
                double avg = 0.0;

                for (int i = 0; i < scores.length; i++) {
                    max = (max > scores[i]) ? max : scores[i];
                    tot += scores[i];
                    avg = (double) tot / scores.length;

                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수 : " + avg);
                }
            } else {
                run = false;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}