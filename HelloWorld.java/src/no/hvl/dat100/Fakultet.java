package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Fakultet {

	
	public static void main(String[] args) {
		

		int total = 1;
		int a = Integer.parseInt(showInputDialog("Gi meg et tall som skal fakulteres"));
		
		while(a > 0) {
	
			total = a*total;
	
			a--;
		
		 
}
		 System.out.print(total);
	}

}

	



