package Recurrence.Enhance;


// 求 n 个元素的全排列
public class B {
    // k : 当前的交换位置(关注点)，与后面的元素交换


    public static void f(char[] data,int k ) {
        if(k==data.length){
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
        
        
        for (int i = k; i < data.length; i++) {
            { char temp = data[k];data[k] = data[i];data[i] =  temp; }// 试探
            f(data,k+1);
            { char temp = data[k];data[k] = data[i];data[i] =  temp; }// 调用底层的嵌套递归，记得回溯
        }


    }


    public static void main(String[] args) {


        char[] data = "ABC".toCharArray();//将字符串转为数组，方便后续的操作
        f(data,0);
    }
}
