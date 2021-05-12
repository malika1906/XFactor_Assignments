import java.util.Scanner;

public class program3 {
    public static void main(String args[])
	{
	double tax=0,val;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	val=sc.nextDouble();
    sc.close();
	if(val<=200000)
		tax=0;
	else if(val<=300000)
		tax=0.1*(val-200000);
	else if(val<=500000)
		tax=(0.2*(val-300000))+(0.1*100000);
	else if(val<=1000000)
		tax=(0.3*(val-500000))+(0.2*200000)+(0.1*100000);
	else
		tax=(0.4*(val-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
	System.out.println("Income tax amount is "+tax);
	}    
}
