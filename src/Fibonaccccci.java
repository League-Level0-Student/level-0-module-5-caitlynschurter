import javax.swing.JOptionPane;

public class Fibonaccccci {
public static void main(String[] args) {
	int num1 = 1;
	int num2 = 1;
	
	String numString = JOptionPane.showInputDialog(null, "How many numbers would u like today?");
	int numInt = Integer.parseInt(numString);
	
System.out.print("1  1  ");
	
	for(int i = 0; i < numInt; i++) {
		int sum = num1+num2;
		System.out.print(sum + "  ");
		num1=num2;
		num2=sum;
		
	}
	
	
	
}
}
