package overload_Sum23;
public class MethodOverload {
	static int myNum=12;
public static void main(String[]args) {
	System.out.printf("Square of integer 7 is %d%n", square(7));
	System.out.printf("Square of double 7.5 is is %f%n", square(7.5));
	System.out.printf("Square of myNum(who konws what type) is"
}
public static int square(int intValue) {
	System.out.printf("%nCalled square with int argument: %d%n", intValue);
	return intValue*intValue;
}
public static double square(double doubleValue) {
	System.out.printf("%Called square with double argument: %f%n", doubleValue);
	return doubleValue*doubleValue;
}

}
