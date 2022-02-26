import java.util.Random;
import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		
		Random no=new Random();
		int num=no.nextInt(100);
		scan(num);
		

	
	}
public static void scan(int a) 
	{
		Scanner sc= new Scanner(System.in);
		
		while (true) 
		{
		   int user=sc.nextInt();
		    if (user==a)
			{
		    	
		    	System.out.println("Hola! U guessed correct no ");
		    	System.out.println("computer genrated no was :" +a);
			    break;  
			}
		    else if (user<a) {
		    	System.out.println("U guessed smaller no ");
			}
		    else if (user>a) {
		    	System.out.println("U guessed bigger no ");
			}
		   
		}
		
	
	}
}
