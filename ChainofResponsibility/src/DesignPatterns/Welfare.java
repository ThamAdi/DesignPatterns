package DesignPatterns;

public class Welfare extends Handler{
	
	@Override
	public double applyDeductions(PaySlip payslip) {
		
		payslip.setDeductions(payslip.getdeductions()+payslip.getsalary()*0.02);
		System.out.println("Welfare Calculated");
		if (payslip.getsalary()>=200000) {
			return payslip.getdeductions();
		}
		else {
			
			return successor.applyDeductions(payslip);
			
		}
		
	}

}
