package DesignPatterns;

public abstract class Handler {
	
	
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		
		this.successor=successor;
		
	}
	
	public abstract double applyDeductions(PaySlip payslip);


}
