package sec1;

public class Example2 {
    public static void main(String[] args) {
        boolean a= true;   //논리형 변수 -1byte
        byte b = 127;      //바이트 변수 : -128~ 127 -1byte
        char c = 'k';      //문자 변수 -2byte
        short d = 32767;   //반정도정수 : -32768~32767 -2byte
        int e = 785367898; //단정도정수 : 4byte
        long f = 785367800L; //배정도정수 : 4byte ->8byte
        //348670.2478 => 10의 6승 x 3468702478
        float g =3.141592f;   //단정도 실수 -> 4byte
        double h = 3.141592; //배정도 실수 ->8byte
        double i = 3.1415920000000000000000000;

        //표현범위 : -2의 n-1승 ~2의 n-1승 -1
        //프리미티브 타입 변수는 표현범위가 있으며,표현범위를 벗어나면,오류
        //반드시 초기화해야한다.

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("g="+g);
        System.out.println("h="+h);
        System.out.println("i="+i);
    }
}
