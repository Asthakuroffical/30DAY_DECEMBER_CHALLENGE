public class Practise{
    public static void first(){
        int x = 4;
        x = x^x;
        System.out.println(x);
    }
    public static void Second(){
        //swap two veriable without using third variable
        int a = 5;
        int b = 3;
        a = a^b; //101 , 011
        b = b^a; // 011 , 110
        a = a ^ b; //110 , 101
        System.out.println("a before value is 5 and change value is this " + a);
        System.out.println("b before value is 3 and change value is this " + b);
        System.out.println("Now Reverse This ");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a before value is 3 and change value is this " + a);
        System.out.println("b before value is 5 and change value is this " + b);
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("Now Reverse This ");
        System.out.println("a before value is 5 and change value is this " + a);
        System.out.println("b before value is 3 and change value is this " + b);
    }
    public static void Third(){
        // Add 1 to an integer using Bit Manipulation
        int x = 5; // 0 0 0 0 0 1 0 1 , msb is 0 so this is positive
        // -> 1 1 1 1 1 0 1 0
        // -> 0 0 0 0 0 1 0 1  1s compliment
        // ->             + 1  2s compliment
        // -> 0 0 0 0 0 1 1 0
        int result = -(~x); // 1 1 1 1 1 0 1 0
        System.out.println(result);
        
    }
    public static void forth(){
        String str = "ABHISHEK";
        StringBuilder sb = new StringBuilder(); 
        for(int i = 0; i<str.length(); i++){
            
            char ch = str.charAt(i);
            if(ch >=65 && ch<=90){
             sb.append((char)(ch | ' '));
            }else{ // if we want all character then its help otherwise from upper to lower no need (else) 
            sb.append(str.charAt(i));
            }
        }
        String strr = sb.toString();
        System.out.print(strr);
    }
    public static void main(String[] args){
        first();
        Second();
        Third();
        forth();
    }
}
