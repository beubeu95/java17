package ques;

public class Ques6 {
    public static void main(String[] args){
        String code = "801225-1278001";

        char m = code.charAt(7);
        System.out.println(m);

        String  gen= ( m=='1' || m=='3') ? "남" : "여";
        System.out.println(gen);

        String yy = code.substring(0,2);
        String mm = code.substring(2,4);
        String dd = code.substring(4,6);

        System.out.println("생년월일 : 19"+yy+"-"+mm+"-"+dd);


    }
}
