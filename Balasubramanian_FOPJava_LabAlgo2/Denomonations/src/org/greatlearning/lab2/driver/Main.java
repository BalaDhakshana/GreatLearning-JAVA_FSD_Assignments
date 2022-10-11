package org.greatlearning.lab2.driver;

import java.util.Scanner;

import org.greatlearning.lab2.service.Currency;
import org.greatlearning.lab2.service.NotesCount;
import org.greatlearning.lab2_model.MergeSort;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the size of Currency Denominations");
		int numOfDenom = sc.nextInt();
		// Creating Denominations array
		int denominations[] = new int[numOfDenom];
		System.out.println("Enter the Currency Denominations value");
		for (i = 0; i < numOfDenom; i++) {
			denominations[i] = sc.nextInt();
		}
		System.out.println("Enter the amount which you want to pay");
		int amount = sc.nextInt();

		Currency currency = new Currency(denominations, numOfDenom);
		MergeSort obj = new MergeSort();
		obj.MargeSort(Currency.denominations, 0, denominations.length - 1);

		// obj.DisplayDenominetions(Currency.denominations, denominations.length - 1);
		NotesCount.numberOfDenominations(Currency.denominations, amount);
		sc.close();
	}

}