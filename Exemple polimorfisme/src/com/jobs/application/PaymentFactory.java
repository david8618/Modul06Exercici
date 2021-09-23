package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {


	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85;//El 0.85 s'aconsegueix del cálcul 100-15=85/100=0.85 així obtenim el sou final dels Employees
			}
		};
	}
	//Calcul del sou final del Manager
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}

	/*
	Nivell 02 Exercici
	 */
	public static IPaymentRate createPaymentRateJunior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {return salaryPerMonth*0.85;}
		};
	}

	public static IPaymentRate createPaymentRateMid(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {return salaryPerMonth*0.9;}
		};
	}

	public static IPaymentRate createPaymentRateSenior(){
		return  new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.95;
			}
		};
	}
}
