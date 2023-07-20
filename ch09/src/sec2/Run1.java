package sec2;
//Runable : 실행 가능한 객체를 만들기 위한 인터페이스
// -> 사용자 상속받아 새로운 클래스를 생성하여 활용
class SBRunable implements Runnable{
    @Override
    public void run() {
        String [] str = {"오세훈","신예은","이은영","서광","신승원","백준철"};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //출석을 부르기
        for(String name:str){
            System.out.println("출석체크 : "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SCRunable implements Runnable{
    @Override
    public void run() {
        String [] str = {"한선","이소윤","박나연","최상민","박진원","김기태"};
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 퇴실
        for(String name:str){
            System.out.println("퇴실체크 : "+name);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Run1 {
    public static void main(String[] args) {
        Runnable sbRun1;   //선언부
        sbRun1 = new SBRunable(); //생성부
        Thread t1 = new Thread(sbRun1);
        t1.start();

        sbRun1 = new SCRunable();
        Thread t2 = new Thread(sbRun1);
        t2.start();
    }
}

//       wait time
//한선    500 (먼저 처리)
//오세훈  1000

//신예은  1000 + 1000
//이소윤  500+1500 (먼저 실행 한선이 우선 실행 했으니까)

//이은영  1000+1000+1000 (먼저 처리)
//박나연  500+1500+1500

//순서
//퇴실체크 : 한선
//출석체크 : 오세훈
//퇴실체크 : 이소윤
//출석체크 : 신예은
//출석체크 : 이은영
//퇴실체크 : 박나연
//출석체크 : 서광
//퇴실체크 : 최상민
//출석체크 : 신승원
//출석체크 : 백준철
//퇴실체크 : 박진원
//퇴실체크 : 김기태


