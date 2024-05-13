package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Maintence extends JFrame implements ActionListener  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JFrame frame;
	private static JPanel panel;
	private static JLabel Hello;
	private static JLabel Hello_1;
	private static JButton button_1;
	private static JButton button_2;

	


	public Maintence() {
		frame= new JFrame();
 panel= new JPanel();
 frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("Main Menu Maintence");
frame.add(panel);
panel.setLayout(null);
Hello =new JLabel("Welcome Back !");
Hello.setBounds(668,20,100,25);
panel.add(Hello);
Hello_1 =new JLabel("What kind of operation you want to perform today ?");
Hello_1.setBounds(588,40,400,25);
panel.add(Hello_1);
button_1 = new JButton("ADD CAR MAINTENCE NEW ORDER");
button_1.setBounds(480,250,250,25);
button_1.addActionListener(this);
panel.add(button_1);
button_2 = new JButton("SEARCH MAINTAIN ORDER");
button_2.setBounds(750,250,200,25);
button_2.addActionListener(this);
panel.add(button_2);

frame.setVisible(true);

}
	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource().equals(button_1)) {
	new add_car_maintence_newOrder();
		frame.dispose();
		}
else if (e.getSource().equals(button_2)) {
	new Search__Maintain_order();
	frame.dispose();
	
	}

	
	}

}
	
