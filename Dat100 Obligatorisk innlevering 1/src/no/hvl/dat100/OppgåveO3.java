package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgåveO3 {

	public static void main(String[] args) {
		
		long n = parseInt(showInputDialog("n:"));
		long sum = 1;
		
		if (n<=0) {
			String utTxt1 = "Talet n kan ikkje ver mindre enn 0";
			showMessageDialog (null, utTxt1);
		}
		else {
		for (;n>0;n--) {
			sum = sum * n;
		}
		
		String utTxt = "n! = " + sum;
		showMessageDialog (null, utTxt);
		}
	}
}
