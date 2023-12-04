package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		Integer hour;
		Double valuePerHour;
		Double additionalCharge;

		List<Employee> listaDeFuncionarios = new ArrayList<>();
		
		System.out.print("enter the number of employees: ");
		int x = sc.nextInt();
		
		for(int i = 1; i<=x; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			sc.nextLine();
			char y = sc.next().charAt(0);
			if(y == 'y') {
				System.out.print("Name: ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.print("Hours: ");
				hour = sc.nextInt();
				System.out.print("Value per hour: ");
				valuePerHour = sc.nextDouble();
				System.out.print("Additional Charge: ");
				additionalCharge = sc.nextDouble();
				
				listaDeFuncionarios.add(new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge));
			}else {
				System.out.print("Name: ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.print("Hours: ");
				hour = sc.nextInt();
				System.out.print("Value per hour: ");
				valuePerHour = sc.nextDouble();
				
				listaDeFuncionarios.add(new Employee(name, hour, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAYMENT:");
		
		for(Employee funcionarios : listaDeFuncionarios) {
			System.out.println(funcionarios.getName() + " - " + funcionarios.payment());
		}
		
	}

}
