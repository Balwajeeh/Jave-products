package Scope_Sum23;
public class Scope {
	private static int x =1;
	public static void main(String[]args) {
		int x=5;
		
		System.out.printf("local varible x in main is %d%n" , x);
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
	}
public static void useLocalVariable() {
	int x =25;
	System.out.printf("%nlocal  x on entering method useLocalVariable is %d%n", x);
	++x;
	System.out.printf(
			"local x before exiting method useLocalVariable is %d%n", x);
}
public static void useField() {
	System.out.printf(
			"%nfield x on entering method useField is %d%n", x);
	x*=10;
	System.out.printf("field x before exiting method useFild is %d%n", x);
}
}
