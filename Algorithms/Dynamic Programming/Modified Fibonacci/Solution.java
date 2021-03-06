import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        BigInteger t1 = new BigInteger(Integer.toString(input.nextInt()));
        BigInteger t2 = new BigInteger(Integer.toString(input.nextInt()));
        BigInteger output = new BigInteger("0");
        
        int n = input.nextInt();
        
        if(n == 1){System.out.println(t1);}
        if(n == 1){System.out.println(t2);}
        
        for(int i = 2; i < n; i++)
        {
            output = t2.multiply(t2);
            output = output.add(t1);
            
            t1 = new BigInteger(t2.toString());
            
            t2 = new BigInteger(output.toString());
            
        }
        System.out.println(output);
    }
}