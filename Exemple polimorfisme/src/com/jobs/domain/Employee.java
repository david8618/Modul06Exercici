package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}

	public IPaymentRate getPaymentRate() {
		return paymentRate;
	}


	@Override
	public void pay()  { //StaffMember
		totalPaid=paymentRate.pay(salaryPerMonth);
	}


	@Override
	public String toString() {
		return "Empl [ " +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", phone='" + phone + '\'' +
				", salaryPerMonth=" + salaryPerMonth +
				", totalPaid=" + totalPaid +
				" ]\n";
	}
}
