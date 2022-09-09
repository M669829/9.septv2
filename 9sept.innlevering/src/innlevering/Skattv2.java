package innlevering;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Skattv2 {
	
	public static void main(String[] args) {
	
		
		String tallTxt = showInputDialog("Penger tjent:");
    
		int trinn1 = 190349;
		int trinn2 = 267899;
		int trinn3 = 643799;
		int trinn4 = 969199;
		int trinn5 = 1999999;
		int trinn6 = 2000000;
		
		int tall = parseInt(tallTxt);
		
			
		if (tall <= trinn1 && tall > 0) {
			System.out.println("Bruttoinntekt: "+ tall +"kr  0% trinnskatt, sum skatt: "+"0 kr");}
		if (trinn1 < tall && tall <= trinn2) {
 			System.out.println("Bruttoinntekt :"+ tall +"kr  1.7% trinnskatt, sum skatt: "+ tall*0.017+"  kr");}
	    if (tall <= trinn3 && tall > trinn2){
			System.out.println("Bruttoinntekt :"+ tall +"kr  4.0% trinnskatt, sum skatt: "+tall*0.04+"  kr");} 
		if (tall <= trinn4 && tall > trinn3) {
			System.out.println("Bruttoinntekt :"+ tall +"kr  13.4% trinnskatt, sum skatt: "+tall*0.134+"  kr");}
		if (tall < trinn5 && tall >= trinn4) {
			System.out.println("Bruttoinntekt :"+ tall +"kr  16.4% trinnskatt, sum skatt: "+tall*0.164+"  kr");}
		if (tall >= trinn6){
			System.out.println("Bruttoinntekt :"+ tall +"kr  17.4% trinnskatt, sum skatt: "+ tall*0.174+"  kr");}
		
	
	
	
	
	}
	
}
	
		

	



