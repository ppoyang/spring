package s02;

public class MyCal {
	
	Cal cal;
	private int firstNum;
	private int secondNum;
	
	public MyCal() {
		
	}
	
	public Cal getCal() {
		return cal;
	}

	public void setCal(Cal cal) {
		this.cal = cal;
	}

	public void add() {
		cal.addition(firstNum,secondNum);
	}
	
	public void sub() {
		cal.subtraction(firstNum,secondNum);
	}
	
	public void mul() {
		cal.multiplication(firstNum,secondNum);
	}
	
	public void div() {
		cal.division(firstNum,secondNum);
	}

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
}
