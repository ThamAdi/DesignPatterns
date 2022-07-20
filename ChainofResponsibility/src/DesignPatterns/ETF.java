package DesignPatterns;

public class ETF extends Handler{

	@Override
	public double applyDeductions(PaySlip payslip) {
		
		payslip.setDeductions(payslip.getdeductions()+payslip.getsalary()*0.03);
		System.out.println("ETF Calculated");
		if (payslip.getsalary()>=100000 && payslip.getsalary()<200000.0) {
			return payslip.getdeductions();
		}
		else {
			
			return successor.applyDeductions(payslip);
			
		}
		
	}
	
	

}
