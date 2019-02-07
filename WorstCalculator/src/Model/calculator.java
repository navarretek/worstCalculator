package Model;

public class calculator {
	private double result = 0;
	private double num1;
	private double num2;
	
	/**
	 * 
	 */
	public calculator(double num1, double num2) {
		super();
		setNum1(num1);
		setNum2(num2);
	}

	/**
	 * @return the num1
	 */
	public double getNum1() {
		return num1;
	}

	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public double getNum2() {
		return num2;
	}

	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(double num2) {
		this.num2 = num2;
	}

	/**
	 * @return the result
	 */
	public double getResult() {
		return result;
	}

	
	/**
	 * @param num1
	 * @param num2
	 */
	public void setAddedResult() {
		this.result = num1 + num2;
	}
	
	/**
	 * @param num1
	 * @param num2
	 */
	public void setSubtractedResult() {
		this.result = num1 - num2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "calculator [result=" + result + ", num1=" + num1 + ", num2=" + num2 + "]";
	}
	

	
}
