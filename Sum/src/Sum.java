
public class Sum {

	public static void main(String[] args) {
		int total=0;
		for(int number=2; number<=20; number+=2) {
			total +=number;
			System.out.printf("My counter is; %d and my running total is: %d%n",number, total);
		}
		System.out.printf("%nSum is %d%n", total);

	}

}
