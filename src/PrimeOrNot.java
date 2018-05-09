import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
String numString = JOptionPane.showInputDialog("Give me an integer below 1,001 (ples)");
	int num = Integer.parseInt(numString);
	
	if(num == 1) {
	JOptionPane.showMessageDialog(null, "Ur number is composite");
	return;
	}
	
	else if(num == 2) {
		JOptionPane.showMessageDialog(null, "Ur number is prime");
		return;
		}
	
	
	for(int i=2;i<num;i++) {
		if(num%i==0) {
		JOptionPane.showMessageDialog(null, "Ur number is composite");
		return;
		}
	}
	
	JOptionPane.showMessageDialog(null, "Ur number is prime");

//caitlyn
//31920122514
}
}
