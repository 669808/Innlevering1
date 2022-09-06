package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgåveO2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int poeng = parseInt(showInputDialog("Poengsum"));

			if (poeng >= 0 && poeng <= 39) {
				System.out.println(i + ". Karakter F");
			} else if (poeng >= 40 && poeng <= 49) {
				System.out.println(i + ". Karakter E");
			} else if (poeng >= 50 && poeng <= 59) {
				System.out.println(i + ". Karakter D");
			} else if (poeng >= 60 && poeng <= 79) {
				System.out.println(i + ". Karakter C");
			} else if (poeng >= 80 && poeng <= 89) {
				System.out.println(i + ". Karakter B");
			} else if (poeng >= 90 && poeng <= 100) {
				System.out.println(i + ". Karakter A");
			} else {
				String utTxt = "Ugyldig poengsum, prøv igjen";
				showMessageDialog(null, utTxt);
				i = i - 1;
			}
		}
	}
}
