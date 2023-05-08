
public class MyMath {
	
	
	public int min(int number1, int number2) {
		return number1 <= number2 ? number1 : number2;
	}
	
	public double min(double number1, double number2) {
		return number1 <= number2 ? number1 : number2;
	}
	
	public double sum(double number1, double number2) {
		return number1 + number2;
	}
	
	public double sum(double numberArray[]) {
		double sum = 0;
		for(int i =0 ; i < numberArray.length; i ++) {
			sum += numberArray[i];
		}
		return sum;
	}
}
