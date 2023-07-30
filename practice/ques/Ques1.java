package ques;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("학번 : ");
        String bun = sc.nextLine();
        System.out.println("전산 점수 : ");
        int ed = sc.nextInt();
        System.out.println("프로그래밍 점수 : ");
        int pg = sc.nextInt();
        System.out.println("전산자동화 점수 : ");
        int oa = sc.nextInt();

        int tot = ed + pg + oa;
        float avg = tot/3.0f;
        String hak = "";
        if(avg>=90){
            hak="A";
        }else if(avg>=80){
            hak="B";
        }else if(avg>=70){
            hak="C";
        }else if(avg>=60){
            hak="D";
        }else{
            hak="F";
        }
        int na = (int) avg%10;
        if(avg>=60){
            if(na>=6){
                hak+="+";
            }else if(na>=3){
                hak+="0";
            }else{
                hak+="-";
            }
        }
        String pan = "불합격";
        if(avg>=80 && ed>=70 && pg>=70 && oa>=70){
            pan = "합격";
        }
        int grd = (int) avg/20;

        System.out.println("학번\t 전산\t PG\t\t OA\t\t 총점\t 평균\t 학점\t 판정\t 등급\t ");
        System.out.printf("%3s\t %3d\t %3d\t %3d\t %3d\t %3.2f\t %2s\t %3s\t %2d등급\n",bun,ed,pg,oa,tot,avg,hak,pan,grd);
    }

}
