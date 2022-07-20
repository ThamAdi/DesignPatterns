package DesignPatterns;

public class EPF extends Handler{

	@Override
	public double applyDeductions(PaySlip payslip) {
		
		payslip.setDeductions(payslip.getdeductions()+payslip.getsalary()*0.08);
		System.out.println("EPF Calculated");
		if (payslip.getsalary() <= 100000.0) {
			return payslip.getdeductions();
		}
		else {
			
			return successor.applyDeductions(payslip);
			
		}
		
	}
	
	

}
