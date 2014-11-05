import javax.swing.JOptionPane;

public class HelloName {
	public static void main (String args[]) {

		String result;

		result = JOptionPane.showInputDialog("What is your name");
		JOptionPane.showMessageDialog(null, "Hello " + result + "!");

	}
}

