package Recurrence.Application;
// 杨辉三角(从第二行开始，某一个元素等于，上一行相同列的元素与上一行前一列的元素之和)
public class Triangle {
    public static int f(int m,int n){
        //第一个元素
        if(m == 0){
            return 1;
        }



        //某一层的最后一个元素
        if(n==0 || n==m){
            return 1;
        }
        return f(m-1,n)+f(m-1,n-1);
    }


    public static void main(String[] args) {
        int level = 5;
        for (int i = 0; i <= level; i++) {
            System.out.print(f(level,i) + " ");
        }






        //求出第m行，第n列的值（从0开始）
        //System.out.println(f(5,3));
    }
}
