package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

	protected String description;
	protected IPaymentRate paymentRate;

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		//TODO
		this.description=description;
	}

	
	@Override
	public void pay() {
		//TODO
		totalPaid=0;

	}

	@Override
	public String toString() {
		return "Volu [ " +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", phone='" + phone + '\'' +
				", totalPaid=" + totalPaid +
				", description='" + description + '\'' +
				" ]\n";
	}
}
