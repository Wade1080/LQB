package Recurrence;

public class B {
    //求a数组中，从begin到结束的元素和
    //头部递归
    public static int f(int a[],int begin){
        if(begin == a.length){
            return 0 ;
        }
        //踢皮球
        int x = f(a,begin+1);
        return x + a[begin];
    }


    //从尾部开始递归
    public static int f2(int a[],int end){
        if(end < 0){
            return 0;
        }
        int x = f2(a,end-1);
        return x + a[end];
    }

    //二分递归
    public static int f3(int[] a,int begin,int end){
        int mid = (begin + end) / 2;

        return f3(a,begin,mid)+f3(a,mid,end);
    }

    public static void main(String[] args) {
        int[] a = {1,2,4,5,6};
        System.out.println(f(a,0));//头部递归
        System.out.println(f2(a,a.length-1));//尾部递归
    }
}
