package com.jobs.application;

import com.jobs.domain.*;
import com.jobs.persistence.EmployeeRepository;



public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		repository=new EmployeeRepository();
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		//Desenvolupem el métode crear un Empleat Manager
		Employee manager = new Employee(name,address,phone,salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);

	}

	public void createVolunteer(String name, String address, String phone, String description) throws Exception {
		// TODO Auto-generated method stub
		Volunteer voluntari = new Volunteer(name,address,phone, description);
		repository.addMember(voluntari);

	}

	//Nivel 02
	//Junior
	public void createJuniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee junior = new Employee(name, address, phone,salaryPerMonth, PaymentFactory.createPaymentRateJunior());
		repository.addMember(junior);
	}
	//Mid
	public void createMidEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee mid = new Employee(name, address, phone,salaryPerMonth, PaymentFactory.createPaymentRateMid());
		repository.addMember(mid);
	}
	//Senior
	public void createSeniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee sen = new Employee(name, address, phone,salaryPerMonth, PaymentFactory.createPaymentRateSenior());
		repository.addMember(sen);
	}


	public void payAllEmployeers() {
		// TODO Auto-generated method stub
		for (AbsStaffMember employeers: repository.getAllMembers()) {
			employeers.pay();

		}
	}

	public String getAllEmployees() {
		// TODO Auto-generated method stub
		String infoEmployees = "\n";
		for (AbsStaffMember employee : repository.getAllMembers()) {
			infoEmployees += employee.toString();
		}
		return infoEmployees;

	}



}

