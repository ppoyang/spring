package spring_0706;

public class Calculator {
	
	private int firstNum;
	private int secondNum;
	
	public int getFirstNum() {
		return firstNum;
	}




	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}




	public int getSecondNum() {
		return secondNum;
	}




	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void addition() {
		System.out.println("addtion");
		int result = firstNum + secondNum;
		System.out.println(result);
	}
	
	


}
