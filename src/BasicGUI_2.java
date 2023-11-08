import javax.swing.*;
import java.awt.event.*;

public class BasicGUI_2 {
	
	public static void main(String[] args) {
		String[] arrayNames = new String[20];
		
		JFrame frame = new JFrame("Store Username");
		frame.setSize(400, 300);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter username:");
		JButton submit_b = new JButton("Submit");
		JButton list_b = new JButton("List");
		JTextField textField = new JTextField(20);
		
		submit_b.addActionListener(new ActionListener() {
			int i = 0;
			@Override
			public void actionPerformed(ActionEvent e) {				
				arrayNames[i]=textField.getText();	
				i++;
			}
		});
		list_b.addActionListener(new ActionListener() {
			int i = 0;
			@Override
			public void actionPerformed(ActionEvent e1) {				
				while(arrayNames[i] != null) {
					System.out.println(arrayNames[i]);
					i++;
				}
			}
		});
		
		
		
		panel.add(label);
		panel.add(textField);			
		panel.add(submit_b);		
		panel.add(list_b);
		
		frame.add(panel);
		
		frame.setVisible(true);
	}
}
