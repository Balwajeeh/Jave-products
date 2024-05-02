import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double temperature;
		String sourceUnit, targetUnit;
		
		System.out.println("Temperature Converter");
		System.out.println("====================");
		System.out.print("Enter the temperature:");
		temperature=scanner.nextDouble();
		System.out.print("Enter the source unit (F, C, K):");
		targetUnit=scanner.next().toUpperCase();
		System.out.print("Enter the target unit (F, C, K):");
		sourceUnit=scanner.next().toUpperCase();
		double convertedTemperature;
		if (sourceUnit.equals("F")) {
			if (targetUnit.equals("C")) {
				convertedTemperature=(temperature - 32) * 5/9;
				System.out.printf("%.2fF is equivalent to %.2f C. \n", temperature, convertedTemperature);
			} else if  (targetUnit.equals("K")) {
				convertedTemperature=(temperature-32)*5/9+273.15;
				System.out.printf("%.2fF is equivalent to %.2fK. \n", temperature, convertedTemperature);
			} else {
				System.out.println("Invalid target unit.");
			}
		}else if (sourceUnit.equals("C")) {
			if (targetUnit.equals("F")) {
				convertedTemperature=(temperature * 9/5)+32;
				System.out.printf("%.2fC is equivalent to %.2fF.\n", temperature, convertedTemperature);
			}else if (targetUnit.equals("K")) {
				convertedTemperature=temperature+273.15;
				System.out.printf("%.2fC is equivalent to %.2fK. \n", temperature,convertedTemperature);
			}else {
				System.out.println("Invalid target unit.");
			}
		}else if (sourceUnit.equals("C")) {
			if (targetUnit.equals("F")) {
				convertedTemperature=(temperature*9/5)+32;
				System.out.printf("%.2fC is equivalent to %.2fF.\n", temperature, convertedTemperature);
			}else if (targetUnit.equals("K")) {
				convertedTemperature=temperature+273.15;
				System.out.printf("%.2fC is equivalent to %.2fK.\n", temperature, convertedTemperature);
			
			
		}else {
			System.out.println("Invalid target unit.");
		}
	
	} else if (sourceUnit.equals("K")) {
		if (targetUnit.equals("F")) {
			convertedTemperature=(temperature - 273.15) * 9/5+32;
			System.out.printf("%.2fK is equivalent to %.2fF.\n", temperature, convertedTemperature);
					
		}else if (targetUnit.equals("C")) {
			convertedTemperature=temperature-273.15;
		System.out.printf("%.2fK is equivalent to %.2fC.\n", temperature,convertedTemperature);
		}else {
			System.out.println("Inivalid target unit.");
		}
	}else {
		System.out.println("Invalid source unit.");
	}

}
}