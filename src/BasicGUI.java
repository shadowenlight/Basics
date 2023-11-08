import javax.swing.*;

public class BasicGUI {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Basic GUI");
		frame.setSize(400, 300);
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("Enter your name:");
		
		JTextField textField = new JTextField(20);
		
		JButton button = new JButton("Submit");
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		
		frame.add(panel);
		
		frame.setVisible(true);
	}
}
