package sec1;

public class Example01 {
    public static void main(String[] args) {
        int[] a; //선언1 - 타입[] 배열명; 몇 개인지 모르기 때문에 아직 메모리 할당x
        int b[]; //선언2 - 타입 배열명 []; 메모리 할당 x

        int[] c = new int[3]; // 선언과 할당
        int d;

        //a는 선언만 된 상태이며, 메모리 할당이 되지 않았기 때문에
        //System.out.println("a[0]="+a[0]);
        //d는 primitive 타입이므로 반드시 초기화가 필요함
        //System.out.println("d="+d);

    }
}
