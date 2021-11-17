import java.util.Scanner;

public class CalculatorMain {

	public static int num1;
	public static int num2;
	public static int result;
	public static String task;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new CalculatorImpl();

		System.out.println("Enter ur numbers:");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		System.out.println("Enter ur task add,sub :");
		task=scanner.next();


		System.out.println("Enter ur numbers:");
		num2 = scanner.nextInt();

		System.out.println("Enter ur numbers:"+ result);

			if(task=="add")
			{
				
		result = calc.Addition(num1,num2);
		System.out.println("Result:"+ result);
			}
			else if (task=="sub")
			{
				result = calc.Subtraction(num1,num2);
		System.out.println("Result:"+ result);
				
			}
	}

}
