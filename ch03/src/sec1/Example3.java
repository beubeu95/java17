package sec01;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        //키보드로 학번과 세 과목 점수를 입력받아
        //총점, 평균, 학점, 판정, 등급 등을 계산하여 출력하도록 하시오.
        //tot(총점), avg(평균), hak(학점), pan(판정), grd(등급)
        //총점 = 전산 + PG + OA
        //평균은 세 과목의 점수의 총점을 3으로 나눈 실수
        //학점은 평균이 96 이상 A+, 93 이상 A0, 90 이상 A-
        //86 이상 B+, 83 이상 B0, 80 이상 B-
        //76 이상 C+, 73 이상 C0, 70 이상 C-
        //66 이상 D+, 63 이상 D0, 60 이상 D-
        //나머지는 F
        //판정은 평균이 80이상이면서, 세 과목 모두 70 이상이면, "합격", 아니면, "불합격"
        //등급은 평균을 20으로 나눈 값으로 하되, 5이면, 5등급, 4이면, 4등급, 3이면, 3등급,
        //2이면, 2등급, 1이면, 1등급
        //출력형식
        //학번    전산  PG  OA  총점  평균     학점  판정  등급
        //XXX    XXX  XXX XXX  XXX  XX.XX    XX   XX  X등급

        Scanner sc = new Scanner(System.in);
        System.out.println("학번 입력 : ");
        int studentID = sc.nextInt();
        int js1 = 100, js2 = 100, js3 = 100

        float avg = (js1 + js2 + js3) / 3.0f
        if(avg>=96){System.out.println("A+");}
        else if (avg>=93){System.out.println("A0");}
        else if (avg>=90){System.out.println("A-");}
        else if (avg>=86){System.out.println("B+");}
        else if (avg>=83){System.out.println("B0");}
        else if (avg>=80){System.out.println("B-");}
        else if (avg>=76){System.out.println("C+");}
        else if (avg>=73){System.out.println("C0");}
        else if (avg>=70){System.out.println("C-");}
        else if (avg>=66){System.out.println("D+");}
        else if (avg>=63){System.out.println("D0");}
        else if (avg>=60){System.out.println("D-");}
        else (avg<60){System.out.println("F");}

        if (avg>=80 && js1>=70 && js2>=70 && js3>=70) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        int grd = (int)avg / 20;
        String grade = "";
        switch (grd){
            case 5:
                grade = "5등급";
                break;
            case 4 :
                grade = "4등급";
                break;
            case 3:
                grade = "3등급";
                break;
            case 2 :
                grade = "2등급";
                break;
            case 1:
                grade = "1등급";
                break;
        }
        System.out.printf("학번 : , 전산 : , PG: , OA : , 총점 : , 평균 : , 학점 : , 판정 :, 등급 : ",
                studentID, ,);
    }
}
