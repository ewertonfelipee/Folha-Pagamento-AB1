package Syndicate;

import java.util.ArrayList;
import java.util.Scanner;

import Employeer.CompositeEmpregado;


public class Sindicato {
	
	private static ArrayList<CompositeEmpregado> affiliatedEmployees = new ArrayList<CompositeEmpregado>();
	private static int numeroUnicoNoSindicato = 1;
	//se for usar pra saber a quantidade de empregadosdo sindicato, lembrar de diminuir -1
	
	
	static Scanner input = new Scanner(System.in);
	
	public void editSyndicateFee(CompositeEmpregado currentEmployee) {
		
		if(!currentEmployee.isbelongSyndicate()) {
			System.out.printf("The employee does not belong to the syndicate%n");
			return;
		}
		
		System.out.printf("Current union fee: %.2f%nNew union fee: ",currentEmployee.getSyndicalFee());
		currentEmployee.setSyndicalFee(input.nextFloat());		
	}
	
	public void enterOrExit(CompositeEmpregado currentEmployee) {
		if(currentEmployee.isbelongSyndicate()) {
			
			System.out.printf("Leave the syndicate ?%n[1] Yes [2] No");
			if(input.nextInt() == 1) {
				currentEmployee.setbelongSyndicate(false);
				affiliatedEmployees.remove(currentEmployee);
				
			}
		}else {
			System.out.printf("Enter the syndicate ?%n[1] Yes [2] No%n");
			
			if(input.nextInt() == 1) {
				System.out.print("Union fee: ");
				currentEmployee.setSyndicalFee(input.nextFloat());
				currentEmployee.setbelongSyndicate(true);
				currentEmployee.setuniqueSNumberSyndicate(numeroUnicoNoSindicato++);
				affiliatedEmployees.add(currentEmployee);
				
			}
		}
		
		
	}
	public static void throwServiceFee(CompositeEmpregado currentEmployee) {
		
		if(!currentEmployee.isbelongSyndicate()) {
			System.out.printf("The employee does not belong to the syndicate%n");
			return;
		}
		
		System.out.print("The fee: ");
		currentEmployee.addServiceFee(input.nextFloat());
			
	}
}
