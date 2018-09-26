package pkgPayment;

public class CarPayment {
	
	//instantiate variables
	private double carCost; 
	private double downPayment;
	private int loanLength;
	private double interestRate;
	

	
	//constructor
	public CarPayment(double carCost, double downPayment, int loanLength, double interestRate) {
		this.carCost = carCost;
		this.downPayment = downPayment;
		this.loanLength = loanLength; //in months
		this.interestRate = interestRate; //interest rate should be input as a double between 0 and 1
	}
	
	//getters and setters
	public double getCarCost() {
		return carCost;
	}
	public void setCarCost(double carCost) {
		this.carCost = carCost;
	}
	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public int getLoanLength() {
		return loanLength;
	}
	public void setLoanLength(int loanLength) {
		this.loanLength = loanLength;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//methods, interest rate compounded yearly using MonthlyPayment=cC*(iR/12*(1+iR/12)^lL)/((1+iR/12)^lL-1)
	
	public double monthlyCarPayment() {
		return (carCost*(interestRate/12*Math.pow(1+interestRate/12, loanLength))/(Math.pow(1+interestRate/12, loanLength)-1));
	}
	
	//total cost - car cost = interest
	public double interestCost() {
		return monthlyCarPayment()*loanLength-carCost;
	}
	
	

}

