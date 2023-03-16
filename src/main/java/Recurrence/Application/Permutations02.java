package Recurrence.Application;

public class Permutations02 {
    public static int g(int m,int n){
        if(m < n){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return g(m-1,n) + g(m,n-1);
    }



    public static void main(String[] args) {
        System.out.println(g(6,2));
    }
}
