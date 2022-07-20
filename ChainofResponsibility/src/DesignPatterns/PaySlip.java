package DesignPatterns;

public class PaySlip {
	
	private int paySlipNum;
	private double salary;
	private double deductions;
	
	
	protected void setDeductions(double deductions) {
		
		this.deductions=deductions;
		
	}
	
	public PaySlip(int paySlipNum,double salary) {
		
		this.paySlipNum=paySlipNum;
		this.salary=salary;
		
	}
	
	public int getPaySlipNum(){
		
		return paySlipNum;
		
	}
	
	public double getsalary() {
		
		return salary;
		
	}
	
	public double getdeductions() {
		
		return deductions;
		
	}

}
