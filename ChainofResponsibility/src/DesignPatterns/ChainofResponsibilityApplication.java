package DesignPatterns;

public class ChainofResponsibilityApplication {
	
	public static void main (String[] args) {
		
		EPF epf= new EPF();
		ETF etf= new ETF();
		Welfare welfare= new Welfare();
		Deductions deduc=new Deductions();
		
		
		deduc.setSuccessor(epf);
		epf.setSuccessor(etf);
		etf.setSuccessor(welfare);
		
		//PaySlip payslip1=new PaySlip(1,50000.00);
		//System.out.println(deduc.applyDeductions(payslip1));
		
		PaySlip payslip2=new PaySlip(2,1500000.00);
		System.out.println(deduc.applyDeductions(payslip2));
		
	}

}
