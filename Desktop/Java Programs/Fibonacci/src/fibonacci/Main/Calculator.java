package fibonacci.Main;

public class Calculator {

	public static long FibonacciIndexCalculator(long index)
	{
		if(index == 0) return 0;
		else if(index == 1 || index == 2) return 1;
		else return FibonacciIndexCalculator(index-1) + FibonacciIndexCalculator(index-2);
	}
	
}
