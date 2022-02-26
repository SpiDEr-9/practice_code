package markscalculator;
import java.util.Scanner;

public class avg 
{
 	public static void main(String[] args) 
 {
	System.out.print("Enter marks in English: ");
	int Eng=scan();
	System.out.println("Marks in english is :"+Eng);
	System.out.print("Enter marks in Marathi : ");
	int Marathi=scan();
	System.out.println("Marks in Marathi is :"+Marathi);
	System.out.print("Enter marks in Hindi: ");
	int Hindi=scan();
	System.out.println("Marks in english is :"+Hindi);
	System.out.print("Enter marks in History: ");
	int History=scan();
	System.out.println("Marks in english is :"+History);
	System.out.print("Enter marks in Math: ");
	int Math=scan();
	System.out.println("Marks in english is :"+Math);
	int total=500;
	float sum=Eng+Marathi+Hindi+Hindi+Math;
	float Percentage= (sum/total)*100;
	
	System.out.println("Your Percentage is :" + Percentage);	
 }
 	
public static int scan() 
{
	Scanner sc= new Scanner(System.in);
	int z = 0;
	while (true) 
	{
	   int marks=sc.nextInt();
	    if (marks<=100)
		{
		   z=marks;
		   
		    break;
		}
	   System.out.println("pls enter marks equal to or below 100:");
	}
	return z;
}
}

