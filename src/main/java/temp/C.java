package temp;
//判断两字符串是否相等，递归实现
public class C {
    public static boolean f(String s1,String s2){
        //长度不等，则字符串不相等
        if(s1.length() != s2.length()){
            return false;
        }

        //长度相同
        //首字符不同，则返回false
        if(s1.length() != 0){
            if(s1.charAt(0) != s2.charAt(0) ){
                return false;
            }
            f(s1.substring(1),s2.substring(1));
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "abce";
        String b = "abcd";
        System.out.println(f(a, b));

    }
}