public class Bit_Manipulation2 {
    public static void Clear_last_ith_bit(int n, int i) {
        int bitmask = ((-1) << i); // 1100
        int NewN = bitmask & n;
        System.out.println("The Prev Value is " + n + " New Value is This " + NewN);
    }

    public static void Clear_Bits_In_Range(int n, int i, int j) {
        int a = ((-1) << j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        System.out.println(bitmask & n);
    }

    public static void Check_if_number_is_power_of_2_or_not(int n) {
        if ((n & n - 1) == 0) {
            System.out.println("this is a power of two");
        } else {
            System.out.println("This is a not a power of two");
        }
    }
    public static void Count_sets_bits_in_number(int n){
        int cnt = 0;
        while(n > 0){
         if((n&1)==1){
           cnt++;
         }
         n = n>>1;
        }
        System.out.println("Total Number of bits is this " + cnt);
    }
    public static void Fast_Exponention(int i , int n){
     int ans = 1;
     while( n > 0){
        if( (n&1)== 1){
            ans = ans*i;
        }
        i = i*i;
        n = n >>1;
     }
     System.out.print("This is fast expo " + ans);
    }
    public static void main(String[] args) {
        //clear last ith bit -> use ~0 = -1 ,  (-1<<i);      -> 11111111
        Clear_last_ith_bit(15 , 2);
        Clear_Bits_In_Range(10 , 2, 4);
        Check_if_number_is_power_of_2_or_not(7);

        //                            Question 3
        Count_sets_bits_in_number(10);


    //                              Fast Exponention   EX: 2^3 = 8

      Fast_Exponention(2 ,3);
        
    }
}
