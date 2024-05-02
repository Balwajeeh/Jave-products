
public class EnhancedForTest {
	public static void main(String[]args) {
		int[] array= {87,68,94,100,83,78,85,91,76,87};
		int total=0;
		int i=0;
		for(int number:array) {
		i++;	
			total +=number;
			System.out.printf("for index %d our value is %d and the running total is %d%n",number,i, total);
		}
		System.out.printf("Total of array elements: %d%n", total);
	}

}
