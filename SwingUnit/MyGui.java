package SwingUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MyGui{

	public static void main(String[] args){
		JFrame frame = new JFrame("Happy Coding");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel panel = new JPanel();

		JButton button = new JButton("Click me!");
		panel.add(button);

        JLabel label = new JLabel("Clicks: 0");
        panel.add(label);
		
		SimpleActionListener listener = new SimpleActionListener(label);
		button.addActionListener(listener);
		
        frame.add(panel);

		frame.setSize(300, 300);	
		frame.setVisible(true);
	}
}