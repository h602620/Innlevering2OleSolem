package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakterer {

	
	 public static void main(String[] args) {
	

		
		 for(int i = 1; i <= 10; i++) {
		 double karakterer = Integer.parseInt(showInputDialog("hvor mange poeng fikk du ?"));
		 
		
		if(karakterer >= 90) { 
			 System.out.print("A");
			 System.out.print(karakterer);
		}
		else if (karakterer >=  80) { 
			 System.out.print("B");
			 System.out.print(karakterer);
		}
		else if (karakterer >= 60) { 
			 System.out.print("C");
			 System.out.print(karakterer);
		}
		else if (karakterer >= 50) { 
			 System.out.print("D");
			 System.out.print(karakterer);
		}
		else if (karakterer >= 40) { 
			 System.out.print("E");
			 System.out.print(karakterer);
		}
		else if (karakterer <= 39 && karakterer >= 0 ) { 
			 System.out.print("F");
			 System.out.print(karakterer);
		}
		else if (karakterer > 100 || karakterer < 0) { 
			 System.out.print("feil(må ha positivt tall)");
			 i--;
		}
		
		
		 }
		 
	 }}
		

			
			 
		

	



