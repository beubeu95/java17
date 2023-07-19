package sec1;

public class Example4 {
    public static void main(String[] args) {
        //32 16 8 4 2 1
        // 1  0 0 0 0 0 => 32   (0 양수 1 음수)
        int a = 20; // 010100 -> 10100
        int b = 14; // 001110 -> 01110

        //비트연산 = 2진수
        System.out.println("a & b : "+(a&b)); //00100  -> 4 (둘다 1일때 -> 1)
        System.out.println("a | b : "+(a|b)); //11110  -> 30 (둘중 하나 1일 때 -> 1)
        System.out.println("~a : "+(~a));     //보수 -> 반대방향 값 : -21
        System.out.println("a ^ b : "+(a^b)); //11010  -> 26 (둘다 같은 값일 때 ->0)
        System.out.println("a>>2 : "+(a>>2)); //
        System.out.println("a<<2 : "+(a<<2)); //
        System.out.println("a>>2 : "+(a>>>2)); //

    }
}
   //65-21 = 44
   //1) 21이 99가 되어야함 -> 78
   //2) 65+78 = 143 -> 43(십진수 =1탈락 ->9진수)
   //3) 43+1 =44가 됨


   //a 오른쪽으로 shift -> 자리 한쪽씩 이동 ->결과 %2 됨 (예 : 0101100 -> 010110)
   //a 오른쪽으로 한번 더 shift -> 자리 한쪽씩 더 이동 -> 결과 한번 더 %2 됨
   //a 왼쪽으로 shift -> 자리 왼쪽으로 한칸씩 이동 -> 결과 *2 됨(예 : 0101100 -> 01011000)
   //a 왼쪽으로 shift -> 자리 한칸씩 더 이동 -> 결과 한번 더 *2 됨

