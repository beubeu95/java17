package sec1;

public class Example2 {
    public static void main(String[] args) {
        //대입연산 : =, +=, -=,/=, *=
        int su=0;

        su+=10; //su=su+10
        System.out.println("su+=10 => " +su); //10

        su-=5; //su=su-5
        System.out.println("su-=5 =>"+su);    //5

        su*=10; //su=su*10
        System.out.println("su*=10 =>"+su);  //50


        float num=0.0f;
        int su2 = su;
        su/=4;  //su=su/4
        /* 중요 : 정수 나누기 정수의 결과는 정수로 자동 형변환됨. */
        num = (float) su2 / 4;   //num = su / 4.0f;

        System.out.println("su/=4 =>"+su);   //12.5 -> 12
        System.out.println("su/=4 =>"+num);

        //증감연산 : ++,-- 등의 전위와 후위가 존재
        int a =10, b=10;
        //a=a+1, a+=1, ++a, a++ 다 같은 연산
        System.out.printf("a++의 결과 : %d\n", a++);  //후위 연산  (결과 : 10)
        System.out.println("나중 출력1 :"+a);          // 나중 출력 (결과 : 11)
        System.out.printf("++b의 결과 : %d\n", ++b);  //전위 연산  (결과 : 11)
        System.out.println("나중 출력2 : "+b);         // 나중 출력 (결과 : 11)
        System.out.printf("b--의 결과 : %d\n", b--); //후위 연산 (결과 : 11)
        System.out.println("나중 출력3 :"+b);          //나중 출력 (결과 : 10)
        System.out.printf("--a의 결과 : %d\n",--a);   //전위연산 (결과 : 10)
        System.out.println("나중 출력4 :"+a);         //나중 출력 (결과 : 10)


    }
}
