package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", "Els voluntaris no cobran!");
		controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0);

		//Nivell 02
		controller.createJuniorEmployee("David Junior", "Dirección molona 5", "666345987", 1400.00);
		controller.createMidEmployee("Claudia Mid", "Dirección molona 6", "687555342", 2800.00);
		controller.createSeniorEmployee("Almudena Senior", "Dirección molona 7", "612333675", 2900.00);


		controller.payAllEmployeers();


		String allEmployees=controller.getAllEmployees();

		System.out.println("EMPLOYEES: " + allEmployees );


	}

}
