package SwingUnit;

import java.awt.event.ActionListener;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;

public class SimpleActionListener implements ActionListener{

	private int clicks = 0;
	private JLabel label;

	public SimpleActionListener(JLabel label){
		this.label = label;
	}

	public void actionPerformed(ActionEvent event){
		this.clicks++;

		this.label.setText("Clicks: " + this.clicks);
	}
}