import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String number=JOptionPane.showInputDialog("Pick a number above 2.");
int numbers2=Integer.parseInt(number);
for (int i = 2; i <numbers2; i++) {
	if(numbers2%i==0) {
		JOptionPane.showMessageDialog(null,"Your number was not a prime number.");
		System.exit(0);
	}	
}
JOptionPane.showMessageDialog(null,"Your number was a prime number.");
	}

}
