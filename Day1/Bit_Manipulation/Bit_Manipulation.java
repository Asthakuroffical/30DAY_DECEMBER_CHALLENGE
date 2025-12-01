import java.util.*;

public class Bit_Manipulation {

    public static void Get_ith_bit(int n, int i) {
        // 1st way using left shift
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            System.out.println("ith bit is 0");
        } else {
            System.out.println("ith bit is 1");
        }

        // 2nd way using right shift
        // int bitmask = n >> i;
        // if((bitmask & 1) == 0){
        // System.out.println("ith bit is 0");
        // }else{
        // System.out.println("ith bit is 1");
        // }
    }

    public static void Set_ith_bit(int n, int i) {
        int bitmask = 1 << i;
        int newN = n | bitmask;
        System.out.println("The previous N is " + n + " New N is this " + newN);
    }

    public static void Clear_ith_bit(int n, int i) {
        int bitmask = ~(1 << i);
        int newN = bitmask & n;
        System.out.println("The old N is " + n + " New N is this " + newN);
    }

    public static void Update_ith_bit(int n, int i, int k) {
        if (k == 1) {
            Set_ith_bit(n, i);
        } else {
            Clear_ith_bit(n, i);
        }
    }

    public static void main(String[] args) {

        // bitwise operation
        // And
        System.out.println(5 & 6);
        // OR
        System.out.println(5 | 6);
        // XOR
        System.out.println(5 ^ 6);

        // Binary left shift << (a << b)
        // 5 << 2 -> formula = a*2^b;
        // 00000101
        // -> 00010100
        System.out.println(5 << 2);

        // Binary right shift >> ( a >> b)
        // 6 >> 1 formula a/2^b;
        // 00000110
        // -> 00000011

        System.out.println(6 >> 1);

        // Practise 1
        // question 1 check if number is even or odd
        int n = 7;
        if ((n & 1) == 0) {
            System.out.println("This is even");
        } else {
            System.out.println("This is odd");
        }

        // Operations

        // 1 Get ith bit
        // 2 Set ith bit
        // 3 Clear ith bit

        Get_ith_bit(10, 2);
        Set_ith_bit(10, 2);
        Clear_ith_bit(10, 1);
        Update_ith_bit(11, 1, 0); // 1011 -> 1001
        Update_ith_bit(11, 2, 1); // 1011 -> 1111
    }
}
