package innlevering;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Karakterer {

	public static void main(String[] args) {
		
	
		
	int A = 100;
	int B = 89;
	int C = 79;
	int D = 59;
	int E = 49;
	int F = 39;
	
	int forsøk = 10;
	
	
	for (int i=1; i <=forsøk; i++) { 
	
	String txt = showInputDialog("Poengsum");
	int poeng = parseInt(txt);
		
	if (poeng <= F && poeng > 0) {
		showMessageDialog(null, "karakter: F");}
	if (poeng <= E && poeng > F) {
		showMessageDialog(null, "Karakter: E");}
	if (poeng <= D && poeng > E) {
		showMessageDialog(null, "Karakter: D");}
	if (poeng <= C && poeng > D) {
		showMessageDialog(null, "Karakter: C");}
	if (poeng <= B && poeng > C) {
		showMessageDialog(null, "Karakter: B");}
	if (poeng <= A && poeng > B) {
		showMessageDialog(null, "Karakter: A");}
	
	if (poeng > A || poeng < 0) { 
		showMessageDialog(null, "Feil poenggivning, prøv igjen");
		forsøk++;
	}
	}
	
	}
}
