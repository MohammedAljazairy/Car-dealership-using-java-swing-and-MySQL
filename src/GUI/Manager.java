package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Manager extends JFrame implements ActionListener  {
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
	private static JButton button_3;
	private static JButton button_4;
	private static JButton button_5;
	private static JButton button_6;
	


	public Manager() {
		frame= new JFrame();
 panel= new JPanel();
 frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("Main Menu Manager");
frame.add(panel);
panel.setLayout(null);
Hello =new JLabel("Welcome Back !");
Hello.setBounds(668,20,100,25);
panel.add(Hello);
Hello_1 =new JLabel("What kind of operation you want to perform today ?");
Hello_1.setBounds(588,40,400,25);
panel.add(Hello_1);
button_1 = new JButton("ADD CAR");
button_1.setBounds(480,250,120,25);
button_1.addActionListener(this);
panel.add(button_1);
button_2 = new JButton("REMOVE CAR");
button_2.setBounds(650,250,160,25);
button_2.addActionListener(this);
panel.add(button_2);
button_3 = new JButton("SEARCH CAR");
button_3.setBounds(850,250,120,25);
button_3.addActionListener(this);
panel.add(button_3);

button_4 = new JButton("LIST OF SOLD CAR BY EMPLOYEE");
button_4.setBounds(380,350,250,25);
button_4.addActionListener(this);
panel.add(button_4);
button_5 = new JButton("LIST OF SOLD CARS");
button_5.setBounds(650,350,170,25);
button_5.addActionListener(this);
panel.add(button_5);
button_6 = new JButton("LIST OF EMPLOYEES UNDER A MANAGER");
button_6.setBounds(860,350,270,25);
button_6.addActionListener(this);
panel.add(button_6);
frame.setVisible(true);

}
	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource().equals(button_1)) {
	new New_C();
		frame.dispose();
		}
else if (e.getSource().equals(button_2)) {
	new Remove_Car();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_3)) {
	new Search_Car();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_4)) {
	new List_Soldcar_Employee();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_5)) {
	new list_of_soldCars();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_6)) {
	new List_all_employees_under_Manager();
	frame.dispose();
	
	}

}
	}
