package Recurrence.Application;
//求一个串的反串
public class reverseString {
    public static String f(String s){
        if(s==null || s.length()<2){
            return s;
        }
        return f(s.substring(1)) + s.charAt(0);
    }


    public static void main(String[] args) {
        System.out.println(f("safas"));
    }
}
