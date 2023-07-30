package ques;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args){

        boolean run =true;
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        while(run){
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------------");

            System.out.println("선택> ");
            String menuNum = sc.nextLine();

            switch(menuNum){
                case "1" :
                    System.out.print("예금액>");
                    balance+=sc.nextInt();
                    break;

                case "2":
                    System.out.print("출금액>");
                    balance-=sc.nextInt();
                    break;

                case "3":
                    System.out.print("잔고>");
                    System.out.print(balance);
                    break;

                case "4":
                    run = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
