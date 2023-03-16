package Recurrence.Application;
// 求 m 个 A 和 n 个 B 有多少种排列情况
// 插空法， m 个 A 有(m + 1)个空，所以从 (m+1) 个空里面取 n 个
public class Permutations {
    public static int f(int m,int n){
        return g(m+1,n);
    }


    // 求从m个球里面取n个
    public static int g(int m,int n){
        if(m < n){
            return 0;
        }
        if(m == n){
            return 1;
        }
        if(n == 0){
            return 1;
        }
        return g(m-1,n-1)+g(m-1,n);
    }




    public static void main(String[] args) {
        System.out.println(f(7,2));
    }
}
