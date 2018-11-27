/**
 * 
 */
package algo1;

import java.util.Scanner;
//importation de toutes les classes du package java.util
//import java.util.*;

/**
 * @author franck Desmedt
 *
 */
public class name {

	/**
	 * @param args
	 * @see heure.java
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("calcul des valeurs min et max");
		Scanner sc = new Scanner(System.in);
		String message2 = "\"la valeur de val2 est: ";
		// System.out.println(message2);
		Double min, max;
		System.out.println("entrez la valeur de val1:");
		Double val1 = sc.nextDouble();
		System.out.println("la valeur de val1 est: " + val1);
		System.out.println("entrez la valeur de val2:");
		Double val2 = sc.nextDouble();
		System.out.println(message2 + val2);

		if (val1 > val2) {
			System.out.println("le nombre max est" + val1);
			System.out.println("le nombre min est" + val2);
		} else {
			System.out.println("le nombre max est" + val2);
			System.out.println("le nombre min est" + val1);
		}
	}

}
