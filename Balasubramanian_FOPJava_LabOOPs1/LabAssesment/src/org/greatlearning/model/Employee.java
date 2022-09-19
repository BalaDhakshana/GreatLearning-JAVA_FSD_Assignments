package org.greatlearning.model;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.greatlearning.service.CredentialService;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialService cs;
		Scanner myScanner = new Scanner(System.in);
		int choice, deptNo;
		String str_fname = "", str_lname = "", str_dpt = "";
		try {
			do {
				System.out.println("Enter 1. to create credentials for the new employee(s) OR press 0 to Exit. ");

				choice = myScanner.nextInt();

				switch (choice) {
				case 1: {
					System.out.println("Enter the First Name");
					str_fname = myScanner.next();
					System.out.println("Enter the Last Name");
					str_lname = myScanner.next();
					System.out.println("Please enter the department from the following.\n" + "1.Technical \n"

							+ "2. Admin \n" + "3. Human Resource \n"

							+ "4. Legal");
					deptNo = myScanner.nextInt();
					switch (deptNo) {
					case 1:
						str_dpt = "technical";
						break;
					case 2:
						str_dpt = "admin";
						break;
					case 3:
						str_dpt = "hr";
						break;
					case 4:
						str_dpt = "legal";
						break;
					}
					cs = new CredentialService(str_fname, str_lname);
					cs.generateEmailAddress(str_dpt);
					cs.generatePassword();
					cs.showCredentials();
				}
				case 0: {
					break;
				}
				}

			} while (choice != 0);
			System.out.println("Exited Successfully!!!");
			myScanner.close();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			// System.err.println(e);
			System.out.println("Invalid input");

		}
	}

}
