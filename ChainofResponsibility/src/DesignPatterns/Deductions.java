package DesignPatterns;

public class Deductions extends Handler{
	
	public double applyDeductions(PaySlip payslip) {
		
		return successor.applyDeductions(payslip);
		
	}

}
