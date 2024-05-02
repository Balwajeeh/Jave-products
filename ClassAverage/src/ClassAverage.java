import java.util.Scanner;
public class ClassAverage {
	private static int total;

	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		int total=0;
		int gradeCounter=0;
		int classCounter=1;
		int sentVal=-1;
		System.out.println("Hoew many classes are you processing?");
		int num0fClasses=input.nextInt();
		while (classCounter <= num0fClasses){
		System.out.println("How many student are in your class?");
		int studentCounter=input.nextInt();
		
		while(gradeCounter<=10) {
			int grade=0;
			while(grade !=-1) {
			System.out.print("Enter grade:");
			grade=input.nextInt();
			if (grade>=-1 && grade <=100) {
			total+=grade;
			gradeCounter++;
		}else if (grade==-1) {
			System.out.println("You have exited the program by sentinal value -1");
			break;
		}
			else {System.out.println("You enterd an invlid grade value! Please retry!");}
		}
		double average=(double) total/gradeCounter;
		System.out.printf("%nTotal of all 10 grades is %d%n",total);
		System.out.printf("Class average is %d%n", average);
	}
		gradeCounter=0;
		
		total=0;
		classCounter++;

}
	
	}
