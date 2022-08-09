package package1;
import javax.swing.JOptionPane; 

public class GUIapp {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null,"you are "+age+" years old");
		
		Long PhoneNo = Long.parseLong(JOptionPane.showInputDialog("Enter your Phone Number"));
		JOptionPane.showMessageDialog(null, " I will text you updates here on "+PhoneNo);
		
	
		

	}

}
