
public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int previousNumber = 0;
		int nextNumber = 1;
		int sum = 0;

		for(int i=0;i<=a;i++) {
			System.out.print(previousNumber+", ");
			sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
		}
			

	}

}
