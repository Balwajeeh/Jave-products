import java.util.Scanner;

public class Midterm {
	public static void main(String[]args)
	{	

Scanner sc=new Scanner(System.in);
System.out.println("Enter Temp in C");
double c = sc.nextDouble();
double f =1.8*c+32;
System.out.println(f);
sc.close();
  }
}