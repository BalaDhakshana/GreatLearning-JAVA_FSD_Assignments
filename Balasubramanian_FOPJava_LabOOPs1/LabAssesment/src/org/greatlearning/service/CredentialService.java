package org.greatlearning.service;

import java.util.Random;

public class CredentialService {
	Random rand = new Random();
	final String randPassWord = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~!@#$%^&*()+_<>";
	private String firstName, lastName, emailAddress, passWord = "";
	int randomIndex;

	public CredentialService(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}

	public void generateEmailAddress(String dept) {
		this.emailAddress = this.firstName + this.lastName + "@" + dept + ".greatlearning.com";
	}

	public void generatePassword() {
		for (int i = 0; i < 8; i++) {
			randomIndex = rand.nextInt(randPassWord.length());
			passWord = passWord + randPassWord.charAt(randomIndex);
		}
	}

	public void showCredentials() {
		System.out.println("Dear " + this.firstName + " your generated credentials are as follows");
		System.out.println("Email 	 ---> " + this.emailAddress);
		System.out.println("Password ---> " + this.passWord);
	}

}
