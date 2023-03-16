package Recurrence.Enhance;
// 最大公共子序列问题
public class C {
    public static int f(String s1,String s2){
     /*   char[] s_1 = s1.toCharArray();
        char[] s_2 = s2.toCharArray();

        //以s1作为标准，在s2中截取与s1相同的序列
        for (int i = 0; i < s_1.length; i++) {
            for (int j = 0; j < s_2.length; j++) {
                if(s_1[i]!=s_2[j]){

                }
            }

        }


        return 0;*/


        if(s1.length()==0 || s2.length()==0){
            return 0;
        }
        if(s1.charAt(0) == s2.charAt(0)){
            return f(s1.substring(1),s2.substring(1)) + 1;
        }
        else {
            return Math.max(f(s1.substring(1),s2),f(s1,s2.substring(1)));
        }

    }


    public static void main(String[] args) {
        int k = f("abcdsafas","xbacdsafasf");
        System.out.println(k);



    }




}
