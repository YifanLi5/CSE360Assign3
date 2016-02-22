package cse360assign3;
/** Basic calculator class
 * @author Yifan Li
 * @version Fed 22, 2016
 * 
 */

class Calculator {

	private int total;
	private StringBuilder history;
	
	/**
	 * initialize total to 0
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = new StringBuilder(); 
		history.append("0 "); //always have 0 at the beginning
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
		addToHistory("+", value);
	}
	
	/**
	 * subtract this value from total
	 * @param value: number to subtract
	 */
	public void subtract (int value) {
		this.total -= value;
		addToHistory("-", value);
	}
	
	/**
	 * multiply this value to the total
	 * @param value: number to multiply 
	 */
	public void multiply (int value) {
		this.total *= value;
		addToHistory("*", value);
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
		addToHistory("/", value); //not clear what to do if we divide by 0, assume we just add "/ 0" to the end
	}
	
	/**
	 * modifies history StringBuilder object every time an operation is used 
	 * @param operator: the operation used (+,-,*,/)
	 * @param value: the value the operator uses 
	 */
	private void addToHistory(String operator, int value){
		history.append(operator + " " + value + " ");
	}
	
	/**
	 * placeholder method
	 * @return not needed yet, placeholder
	 */
	public String getHistory() {
		String debugInfo = history.toString().trim();
		return debugInfo;
	}
}