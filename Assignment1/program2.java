import java.util.Scanner;

public class program2 {
    // Function to divide a by b 
    static int divide(int dividend, int divisor)
    {
        // Calculate sign of divisor 
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
     
        // Update both divisor and dividend positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
     
        int quotient = 0;
         
        while (dividend >= divisor)
        {
            dividend -= divisor;
            ++quotient;
        }
        return sign * quotient;
    }   
     
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println(divide(a, b));
    }
}