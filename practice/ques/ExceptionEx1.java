package ques;

public class ExceptionEx1{
    public static void main(String [] args){
        String arr[] = {"20","2a"};
        int value =0;
    for(int i =0;i<=2; i++){
        try{
            value = Integer.parseInt(arr[i]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 초과");
        }catch(NumberFormatException e){
            System.out.println("숫자로 변환 불가");
        }finally{
            System.out.println(value);
        }
    }
    }
}