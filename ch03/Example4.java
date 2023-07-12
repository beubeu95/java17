package sec2;

public class Example4 {
    public static void main(String[] args) {


        for(int a=1;a<=5;a++){
            for(int b=1;b<=4;b++){
                System.out.print(b+"\t");
            }
            System.out.print("\n");
        }
        /*
        1  2  3  4  5  6  7
        8  9  10 11 12 13 14
        15 16 17 18 19 20 21
        22 23 24 25 26 27 28
        29 30 31
         */
        int cnt = 0;
        for(int a=1; a<=5;a++){
            for(int b=1;b<=7; b++){
                cnt++;
                if(cnt>31){
                    break;
                }
                System.out.printf("%2d\t",cnt);
            }System.out.println("\n");
        }


        /*

        *
        **
        ***
        ****
        *****

         */

        for(int a=0; a<5; a++){
            for(int b=1; b<a+1; b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /*

        *****
        ****
        ***
        **
        *
         */


        for(int a=1; a<6 ; a++){
            for(int b=1; b<=6-a; b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /*

        구구단

        2x1=2  3x1=3 .......  9x1=9
        ....................  9x2=18
        2x9=18 3x9=27 ..............

         */


        for(int i=1; i<=9; i++){
            for(int j=2; j<=9; j++){
                System.out.printf("%dx%d=%2d\t",j,i,j*i);
            }
            System.out.println();
        }
    }
}
