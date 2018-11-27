/**
 * 
 *
 */
package fr.openClassrooms.tp;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author franck Desmedt
 *
 */
public class ConvertisseurCelsiusFahrenheit {

	/**
	 * Constantes
	 */
	double temperatureSaisie = 0;
	double temperatureConvertie = 0;
	static double temperatureConvertieArrondie;
	char reponse;
	int chiffreApresLaVirgule = 2;
	Scanner scanner = null;
	int choixConversion = 1;

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method menuConvert
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 **/
	public void menuConvert() {

		// try {

		do {
			Scanner scanner = new Scanner(System.in);
			do {
				// do {
				System.out.println("Choissisez votre mode de convertion:\n"
						+ "tapez 1 pour convertir les °C Celsus en °F Fahrenheit  \n"
						+ "tapez 2 pour convertir les °F Fahrenheit en Celsus °C ");
				choixConversion = scanner.nextInt();
				System.out.println("vous avez fait le choix: " + choixConversion);
				/**
				 * On vide la ligne avant d'en lire une autre pour eviter une erreur
				 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
				 * peut aussi mettre nextLine()
				 **/
				scanner.nextLine();
//				
//					System.out.print("Votre Choix: ");
//					choixConversion = scanner.next().charAt(0);

				// if (choixConversion != '1' && choixConversion != '2' &&
				// !scanner.hasNextInt())

				if (choixConversion != 1 && choixConversion != 2 && !scanner.hasNextInt()) {
//					System.out.println("Veuillez entrer 1 ou 2 uniquement, réitérer votre  choix.");
					/**
					 * On vide la ligne avant d'en lire une autre pour eviter une erreur
					 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
					 * peut aussi mettre nextLine()
					 **/
					scanner.nextLine();
					System.out.println("Veuillez entrer 1 ou 2 uniquement, réitérer votre  choix.");

				}
			} while (choixConversion != 1 && choixConversion != 2);

			if (choixConversion == 1) {
				System.out.println("Veuillez entrer la température en °C Celsus");
				temperatureSaisie = scanner.nextDouble();

				temperatureConvertie = convertCelsiusFahrenheit();

				System.out.println(temperatureSaisie + "°C Celsus est équivalent à " + temperatureConvertieArrondie
						+ "°F Fahrenheit\n");
				/**
				 * On vide la ligne avant d'en lire une autre pour eviter une erreur
				 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
				 * peut aussi mettre nextLine()
				 **/
				scanner.nextLine();
//					System.out.println("tps convertie " + temperatureConvertie + " tps convertie et arrondie= "
//							+ temperatureConvertieArrondie);
			} else if (choixConversion == 2) {
				System.out.println("Veuillez entrer la température en °F Fahrenheit");
				temperatureSaisie = scanner.nextDouble();

				temperatureConvertie = convertFahrenheitCelsus();
				System.out.println(temperatureSaisie + "°F Fahrenheit est équivalent à " + temperatureConvertieArrondie
						+ "°C Celsus\n");
				/**
				 * On vide la ligne avant d'en lire une autre pour eviter une erreur
				 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
				 * peut aussi mettre nextLine()
				 **/
				scanner.nextLine();
			}
			// } while (choixConversion != 1 && choixConversion != 2 &&
			// !scanner.hasNextInt());
			// } while (choixConversion != '1' && choixConversion != '2' &&
			// !scanner.hasNextInt());
			/**
			 * On vide la ligne avant d'en lire une autre pour eviter une erreur
			 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
			 * peut aussi mettre nextLine()
			 **/
			// scanner.next();

			do {
				System.out.println("Souhaitez-vous convertir une autre température? O/N");
				/**
				 * On vide la ligne avant d'en lire une autre pour eviter une erreur
				 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
				 * peut aussi mettre nextLine()
				 **/
				// scanner.next();
				// avec charAt(0) on ne saisi que un seul caractére
				reponse = scanner.nextLine().charAt(0);
				// mettre un caractere type char en majuscule
				reponse = Character.toUpperCase(reponse);
				/**
				 * On vide la ligne avant d'en lire une autre pour eviter une erreur
				 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
				 * peut aussi mettre nextLine()
				 **/
				// scanner.next();
				if (reponse != 'O' && reponse != 'N' && reponse != ' ') {
					// if (line != null && line.length() > 0) {
					// x = line.charAt(0);
					System.out.println(scanner.next() + " Vous ne pouvez saisir que O ou N ");
					/**
					 * On vide la ligne avant d'en lire une autre pour eviter une erreur
					 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
					 * peut aussi mettre nextLine()
					 **/
					scanner.nextLine();
				}
			} while (reponse != 'O' && reponse != 'N');
			if (scanner != null)
				scanner.close();
		} while (reponse == 'O');

		System.out.println("Fin du programme \nA bientôt");
//		double tps = temperatureConvertie;// 12.123456789;
//		System.out.println("chiffre:" + tps + " arrondi à " + chiffreApresLaVirgule + " chiffres apres la virgule = "
//				+ arrondi(tps, chiffreApresLaVirgule));
//		System.out.println("chiffre:" + tps + " arrondi à " + chiffreApresLaVirgule + " chiffres apres la virgule = "
//				+ arrondi(tps, chiffreApresLaVirgule));

		// finally

		// {

		// }
		// while (choixConversion != '1' && choixConversion != '2' && choixConversion !=
		// '\n' && choixConversion * 2 != 2);
	}

	/**
	 * 
	 * 
	 * /**
	 * 
	 * @description
	 *
	 * @return void
	 *
	 * @method convertCelsiusFahrenheit
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 **/
	public double convertCelsiusFahrenheit() {
		temperatureConvertieArrondie = 0;
		temperatureConvertie = ((temperatureSaisie * 1.8) + 32);
		temperatureConvertieArrondie = arrondi(temperatureConvertie, chiffreApresLaVirgule);
		return temperatureConvertie;
	}

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method convertFahrenheitCelsus
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 **/
	public double convertFahrenheitCelsus() {
		temperatureConvertieArrondie = 0;
		temperatureConvertie = ((temperatureSaisie - 32) * 5) / 9;
		temperatureConvertieArrondie = arrondi(temperatureConvertie, chiffreApresLaVirgule);
		return temperatureConvertie;
	}

	/**
	 * 
	 * @description
	 *
	 * @return double
	 *
	 * @method arrondi
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @param temperatureConvertie
	 * @param chiffreApresLaVirgule
	 * @date dimanche 25 nov. 2018
	 * @see
	 *
	 *
	 */
	public double arrondi(double temperatureConvertie, int chiffreApresLaVirgule) {
		BigDecimal bd = new BigDecimal(temperatureConvertie);
		bd = bd.setScale(chiffreApresLaVirgule, BigDecimal.ROUND_DOWN);
		temperatureConvertieArrondie = bd.doubleValue();
		return temperatureConvertieArrondie;
	}
}
