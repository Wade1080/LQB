package temp;
// 求最大公约数
public class demo01 {

    public static int gcd(int a,int b){
        if (a==0){
            return b;
        }
        return gcd(b % a,a);
    }

    public static void main(String[] args) {
        //法一
       /* int a = 50;
        int b = 37;
        for (int i = a; i >= 1 ; i--) {
            if (a % i == 0 && b % i ==0){
                System.out.println("最大公约数: "+i);
                break;
            }



        }*/


        //法二: 辗转相除法
     /*   int a = 15;
        int b = 40;
        while(true){
            if(a==0){
                System.out.println(b);
                break;
            }
            int t = a ;
            a = b % a;
            b = t;
        }*/


        System.out.println(gcd(1000000000,3000));


    }
}
