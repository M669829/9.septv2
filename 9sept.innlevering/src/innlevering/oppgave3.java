package innlevering;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class oppgave3 {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Tall"));
		int tall = n;
		
		for (int i = n; i>1;i--) 
		{tall = tall*(i-1);
		
		}
		showMessageDialog(null, "n! av "+ n+" = "+tall );
		
		
     
   
    }
 
	}

