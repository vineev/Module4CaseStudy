import java.util.Scanner;

public class CalculatorMain {

	public static int num1;
	public static int num2;
	public static int result;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new CalculatorImpl();

		System.out.println("Enter ur numbers:");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		System.out.println("Enter ur numbers:");
		num2 = scanner.nextInt();

		System.out.println("Enter ur numbers:"+ result);


		result = calc.Addition(num1,num2);
		System.out.println("Result:"+ result);
	}

}
