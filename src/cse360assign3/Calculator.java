package cse360assign3;
/** Basic calculator class
 * @author Yifan Li
 * @version Fed 22, 2016
 * 
 */

class Calculator {

	private int total;
	
	/**
	 * initialize total to 0
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * returns the total 
	 * @return value of total
	 */
	public int getTotal () {
		return this.total;
	}
	/**
	 * add this value to total
	 * @param value: number to add
	 */
	public void add (int value) {
		this.total += value;
	}
	
	/**
	 * subtract this value from total
	 * @param value: number to subtract
	 */
	public void subtract (int value) {
		this.total -= value;
	}
	
	/**
	 * multiply this value to the total
	 * @param value: number to multiply 
	 */
	public void multiply (int value) {
		this.total *= value;
	}
	
	/**
	 * divide ths total by this value
	 * @param value: value to divide
	 */
	public void divide (int value) {
		if(value == 0){
			this.total = 0;
		}else{
			this.total /= value;
		}
	}
	
	/**
	 * placeholder method
	 * @return not needed yet, placeholder
	 */
	public String getHistory () {
		return "";
	}
}