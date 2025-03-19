public class ArithmeticOperators {
    public static void main(String[] args){
        //Arithmetic operators
        int value = 1+2;
        //value is now 3
        System.out.println("1+2="+value);

        value=value-1;
        //value is now 2
        System.out.println("3-1="+value);

        value=value*5;
        //value is now 10
        System.out.println("2*5="+value);

        value=value/2;
        //value is now 2
        System.out.println("10/2="+value);

        value=value%2;
        //value is now 1
        System.out.println("5%2="+value);

        //we can also join two strings into one
        String firstString = "This is ";
        String secondString = "a concatenated string";
        String finalString = firstString+secondString;
        System.out.println(finalString);
    }
}
