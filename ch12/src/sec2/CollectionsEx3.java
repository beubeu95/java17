package sec2;

import java.util.Calendar;
import java.util.Scanner;

public class CollectionsEx3 {
    public static void main(String[] args) {
        //입력한 월의 달력 출력하기
        //만약 7월의 경우
        /*

        7월

        일   월  화   수  목  금   토
                                 1
        2    3   4   5   6   7   8
        9   10  11  12  13  14  15
        16  17  18  19  20  21  22
        23  24  25  26  27  28  29
        30  31

         */

        Calendar c1 = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);

        int year =sc.nextInt();   //년도
        int month =sc.nextInt();  //월

        c1.set(Calendar.YEAR, year);      //입력받은 년, 월을 세팅
        c1.set(Calendar.MONTH,month);

        System.out.println("---------"+month+"--------------");
        System.out.println("  일   월   화  수  목  금  토");

        c1.set(year,month-1,1);
        //month는 0이 1월이므로 -1해준다.

        int end = c1.getActualMaximum((Calendar.DATE));  //해당 월 마지막 날짜
        int dayOfWeek = c1.get(Calendar.DAY_OF_WEEK);    //해당 날짜의 요일

        for(int i=1;i<=end;i++){
            if(i==1){
                for(int j=1;j<dayOfWeek;j++){
                    System.out.print("    ");
                }
            }
            if(i<10){
                System.out.print(" ");
            }
            System.out.print(" "+i+" ");
            if(dayOfWeek%7==0){
                System.out.println();
            }dayOfWeek++;
        }

    }
}

