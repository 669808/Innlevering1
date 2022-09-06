package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public interface OppgåveO1 {

	public static void main(String[] args) {

		for (int j = 1; j < 2; j++) {
			int brutto = parseInt(showInputDialog("Bruttoinntekt i NOK:"));

			if (brutto > 0 && brutto < 190349) {
				double a = 0;
				double b = brutto * a;
				double c = brutto - b;
				int i = (int) c;
				System.out.println("Trinnskatt:\n" + i + " NOK");
			} else if (brutto > 190350 && brutto < 267899) {
				double a = 0.017;
				double b = brutto * a;
				double c = brutto - b;
				int i = (int) c;
				System.out.println("Trinnskatt:\n" + i + " NOK");
			} else if (brutto > 267900 && brutto < 643799) {
				double a = 0.04;
				double b = brutto * a;
				double c = brutto - b;
				int i = (int) c;
				System.out.println("Trinnskatt:\n" + i + " NOK");
			} else if (brutto > 643800 && brutto < 969199) {
				double a = 0.134;
				double b = brutto * a;
				double c = brutto - b;
				int i = (int) c;
				System.out.println("Trinnskatt:\n" + i + " NOK");
			} else if (brutto > 969200 && brutto < 1999999) {
				double a = 0.164;
				double b = brutto * a;
				double c = brutto - b;
				int i = (int) c;
				System.out.println("Trinnskatt:\n" + i + " NOK");
			} else if (brutto >= 2000000) {
				double a = 0.174;
				double b = brutto * a;
				double c = brutto - b;
				int i = (int) c;
				System.out.println("Trinnskatt:\n" + i + " NOK");
			} else {
				System.out.println("Ugyldig sum gitt, prøv igjen");
				j = j - 1;
			}
		}

	}
}
