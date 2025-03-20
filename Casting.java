public class Casting {
    public static void main(String[] args){
        //Implicit casting
        //byte -> short -> int -> long -> float -> double
        short x = 2;
        int y = x+2;
        System.out.println(y);

        //Explicit casting
        int a=5;
        short b=(short)(a+5);
        System.out.println(b);

        //Converting string to other datatypes by wrapper classes
        String str = "1";
        System.out.println(Integer.parseInt(str)+4);

        String str1 = "22";
        System.out.println(Short.parseShort(str1)+8);

        //Similarly we have float, double etc..,
    }
}
