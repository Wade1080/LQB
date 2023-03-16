package Recurrence.Enhance;
// 在n个球中，任意取出m个（不放回），求有多少种不同取法
public class A {
    // n 个球里面取 m 个
    public static int f(int n,int m){
        if(n<m){
            return 0;
        }
        if(n==m){
            return 1;
        }
        if(m==0){
            return 1;
        }




        //想象在一堆球里面选一个特殊的球，人为这堆球分为两堆，取法划分为：包含和不包含 x
        return f(n-1,m-1) + f(n-1,m);
    }


    public static void main(String[] args) {
        int k = f(2,1);
        System.out.println(k);
    }
}
