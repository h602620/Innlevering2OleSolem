package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Skatt {

	public static void main(String[] args) {
		
		 double restskatt = Integer.parseInt(showInputDialog("hvor mye tjener du?"));
		if(restskatt >= 954051) { 
			 System.out.print("trinnskatt "+restskatt*(1-0.1452));
		}
		else if (restskatt >= 580651) { 
			System.out.print("trinnskatt "+restskatt*(1-0.1153));
		}
		else if (restskatt >= 230950) { 
			System.out.print("trinnskatt "+restskatt*(1-0.024));
		}
		else if(restskatt >= 164101) { 
			System.out.print("trinnskatt "+restskatt*(1-0.0093));
		}
		else {
			System.out.print("trinnskatt "+restskatt);
		}
	}
	

}
