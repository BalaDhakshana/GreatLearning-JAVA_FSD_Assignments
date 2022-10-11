package org.greatlearning.lab2_model;

public class MergeSort {
	public void Sortmain(int Denominetions[], int low, int mid, int high) {

		// lets take the lengths Of the array hear :-

		int len1 = (mid - low + 1);
		int len2 = (high - mid);

		// now lets take the two array hear :_

		int lowarrey[] = new int[len1];
		int highArrey[] = new int[len2];

		// now hear we are putting all the elements from the Denominations to our new
		// array:- :-

		for (int i = 0; i < len1; i++) {

			lowarrey[i] = Denominetions[low + i];
		}
		for (int j = 0; j < len2; j++) {

			highArrey[j] = Denominetions[mid + 1 + j];
		}
		// lets apply the logic and do the sorting hear and lets take a new auxiliary
		// array hear :- :-

		int i = 0;
		int j = 0;
		int k = low;

		while (i < len1 && j < len2) {

			if (lowarrey[i] > highArrey[j]) {
				Denominetions[k] = lowarrey[i];
				i++;
			}

			else {
				Denominetions[k] = highArrey[j];
				j++;
			}

			k++;
		}

		// if their is any element which is Still left inside of the array Then lets put
		// all the elements inside the new array :-

		while (i < len1) {

			Denominetions[k] = lowarrey[i];
			i++;
			k++;
		}

		while (j < len2) {

			Denominetions[k] = highArrey[j];
			j++;
			k++;
		}
	}

	public void MargeSort(int Denominetions[], int low, int high) {

		if (low < high) {

			int mid = (low + high) / 2;
			MargeSort(Denominetions, low, mid);
			MargeSort(Denominetions, mid + 1, high);

			Sortmain(Denominetions, low, mid, high);

		}

	}

	public void DisplayDenominetions(int Denominetions[], int size) {

		System.out.println("The Values of the denominetions are in this Order:-");

		for (int i : Denominetions) {

			System.out.print(i + " ");
		}
		System.out.println();
	}

}