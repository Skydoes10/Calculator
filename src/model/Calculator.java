package model;

public class Calculator {
	

	public Calculator() {
		
	}
	
	public double solveOperation(String firstNum, String secondNum, String sign) {
		double fNum = Double.valueOf(firstNum);
		double sNum = Double.valueOf(secondNum);
		
		double result = 0;
		if(sign.equals("+")) {
			result = sum(fNum, sNum);
		} else if(sign.equals("-")) {
			result = minus(fNum, sNum);
		} else if(sign.equals("x")) {
			result = multiplication(fNum, sNum);
		} else if(sign.equals("÷")) {
			result = divide(fNum, sNum);
		}
		
		return result;
	}
	
	
	public double sum(double firstNum, double secondNum) {
		return firstNum + secondNum;
	}
	
	public double minus(double firstNum, double secondNum) {
		return firstNum - secondNum;
	}
	
	public double multiplication(double firstNum, double secondNum) {
		return firstNum * secondNum;
	}
	
	public double divide(double firstNum, double secondNum) {
		return firstNum / secondNum;
	}
	
	public double raiseToPower2(double num) {
		double result = Math.pow(num, 2);
		return result;
	}
	
	public double takeSqrt(double num) {
		double result = Math.sqrt(num);
		return result;
	}
}
