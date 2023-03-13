package Recurrence;

public class Initial {
    //求1到n的和，递归实现
    public static void f(int begin,int end){
        if(begin > end){
            return;
        }
        //有些像队列，先进先出
        System.out.println(begin);
        f(begin+1,end);
    }
    public static void main(String[] args) {
        //循环调用
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //递归调用
        f(0,9);
    }
}
