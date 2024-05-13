
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class HR extends JFrame implements ActionListener  {
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



	public HR() {
		frame= new JFrame();
 panel= new JPanel();
 frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("Main Menu");
frame.add(panel);
panel.setLayout(null);
Hello =new JLabel("Welcome Back !");
Hello.setBounds(668,20,100,25);
panel.add(Hello);
Hello_1 =new JLabel("What kind of operation you want to perform today ?");
Hello_1.setBounds(588,40,400,25);
panel.add(Hello_1);
button_1 = new JButton("ADD MANGER");
button_1.setBounds(480,320,120,25);
button_1.addActionListener(this);
panel.add(button_1);
button_2 = new JButton("ADD EMPLOYEE");
button_2.setBounds(650,320,160,25);
button_2.addActionListener(this);
panel.add(button_2);
button_3 = new JButton("DELETE EMPLOYEE");
button_3.setBounds(850,320,180,25);
button_3.addActionListener(this);
panel.add(button_3);
button_4 = new JButton("HIRING MANAGER BRANCH");
button_4.setBounds(340,380,250,25);
button_4.addActionListener(this);
panel.add(button_4);
button_5 = new JButton("HIRING MANAGER DEPARTMENT");
button_5.setBounds(610,380,280,25);
button_5.addActionListener(this);
panel.add(button_5);
button_6 = new JButton("HIRING MANAGER ON EMPLOYEE");
button_6.setBounds(910,380,280,25);
button_6.addActionListener(this);
panel.add(button_6);

frame.setVisible(true);

}

	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource().equals(button_1)) {
	new Add_Man();
	frame.dispose();
		}
else if (e.getSource().equals(button_2)) {
	new Add_Employee();
		frame.dispose();

	
	}
else if (e.getSource().equals(button_3)) {
	new Remove_Emp();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_4)) {
	new Hiring_manager_branch();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_5)) {
	new Hiring_Manager_department();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_6)) {
	new Hiring_Manager_on_Employee();
	frame.dispose();
	
	}

}
	}