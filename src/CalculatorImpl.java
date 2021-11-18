import java.util.Scanner;

public class CalculatorImpl implements Calculator
{


	@Override
	public int Addition(int num1, int num2) {
		// TODO Auto-generated method stub

		return num1+num2;
		
		}

	@Override
	public int Subtraction(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public int Division(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}

	@Override
	public int Multiplicaton(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

}
