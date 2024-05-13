package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CEO extends JFrame implements ActionListener  {
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
	private static JButton button_7;
	private static JButton button_8;
	private static JButton button_9;
	private static JButton button_10;
	private static JButton button_11;
	private static JButton button_12;
	private static JButton button_13;
	private static JButton button_14;
	private static JButton button_15;
	private static JButton button_16;
	private static JButton button_17;
	private static JButton button_18;
	private static JButton button_19;
	private static JButton button_20;
	public CEO() {
		frame= new JFrame();
 panel= new JPanel();
 frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("CEO Main Menu");
frame.add(panel);
panel.setLayout(null);
Hello =new JLabel("Welcome Back !");
Hello.setBounds(668,20,100,25);
panel.add(Hello);
Hello_1 =new JLabel("What kind of operation you want to perform today ?");
Hello_1.setBounds(588,40,400,25);
panel.add(Hello_1);
button_1 = new JButton("ADD BRANCH");
button_1.setBounds(380,140,120,25);
button_1.addActionListener(this);
panel.add(button_1);
button_2 = new JButton("REMOVE BRANCH");
button_2.setBounds(520,140,160,25);
button_2.addActionListener(this);
panel.add(button_2);
button_3 = new JButton("ADD DEPARTMENT");
button_3.setBounds(700,140,140,25);
button_3.addActionListener(this);
panel.add(button_3);

button_4 = new JButton("REMOVE DEPARTMENT");
button_4.setBounds(870,140,180,25);
button_4.addActionListener(this);
panel.add(button_4);
button_5 = new JButton("LIST NO. EMPLOYEE IN BRANCH");
button_5.setBounds(300,220,220,25);
button_5.addActionListener(this);
panel.add(button_5);
button_6 = new JButton("ADD EMPLOYEE");
button_6.setBounds(540,220,140,25);
button_6.addActionListener(this);
panel.add(button_6);
button_7 = new JButton("ADD MANAGER");
button_7.setBounds(700,220,180,25);
button_7.addActionListener(this);
panel.add(button_7);
button_8 = new JButton("DELETE EMPLOYEE");
button_8.setBounds(899,220,160,25);
button_8.addActionListener(this);
panel.add(button_8);                
button_9 = new JButton("NEW CAR SALE");
button_9.setBounds(340,300,140,25);
button_9.addActionListener(this);
panel.add(button_9);
button_10 = new JButton("ADD CAR");
button_10.setBounds(520,300,140,25);
button_10.addActionListener(this);
panel.add(button_10);
button_11 = new JButton("REMOVE CAR");
button_11.setBounds(700,300,140,25);
button_11.addActionListener(this);
panel.add(button_11);
button_12 = new JButton("SEARCH CAR");
button_12.setBounds(880,300,140,25);
button_12.addActionListener(this);
panel.add(button_12);
button_13 = new JButton("LIST CARS SOLD BY EMPLOYEES");
button_13.setBounds(150,380,250,25);
button_13.addActionListener(this);
panel.add(button_13);
button_14 = new JButton("LIST OF SOLD CARS");
button_14.setBounds(420,380,200,25);
button_14.addActionListener(this);
panel.add(button_14);
button_15 = new JButton("LIST OF ALL EMPLOYEES UNDER MANAGER");
button_15.setBounds(640,380,290,25);
button_15.addActionListener(this);
panel.add(button_15);
button_16 = new JButton("CAR MAINTAIN NEW ORDER");
button_16.setBounds(950,380,220,25);
button_16.addActionListener(this);
panel.add(button_16);
button_17 = new JButton("SEARCH CAR MAINTAIN");
button_17.setBounds(190,440,180,25);
button_17.addActionListener(this);
panel.add(button_17);
button_18 = new JButton("HIRING MANAGER BRANCH");
button_18.setBounds(390,440,250,25);
button_18.addActionListener(this);
panel.add(button_18);
button_19 = new JButton("HIRING MANAGER DEPARTMENT");
button_19.setBounds(650,440,280,25);
button_19.addActionListener(this);
panel.add(button_19);
button_20 = new JButton("HIRING MANAGER ON EMPLOYEE");
button_20.setBounds(950,440,280,25);
button_20.addActionListener(this);
panel.add(button_20);

frame.setVisible(true);

}
	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource().equals(button_1)) {
	new Add_Branch();
		frame.dispose();
		}
else if (e.getSource().equals(button_2)) {
	new Remove_Branch();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_3)) {
	new Add_Department();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_4)) {
	new Remove_Department();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_5)) {
	new List_employees_in_branch();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_6)) {
	new Add_Emp_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_7)) {
	new Add_Manager_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_8)) {
	new Delete_emp_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_9)) {
	new Sell_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_10)) {
	new AddCar_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_11)) {
	new Delete_Car_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_12)) {
	new SearchCar_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_13)) {
	new Listofsoldofemployee_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_14)) {
	new Listofcarssold_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_15)) {
	new listofallemployeesundermanager_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_16)) {
	new CarmaintainNeworder_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_17)) {
	new SearchCarMaintain_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_18)) {
	new HiringmanagerBranch_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_19)) {
	new HiringManager_department_asCEO();
	frame.dispose();
	
	}
else if (e.getSource().equals(button_20)) {
	new Hiring_manager_onEmp_asCEO();
	frame.dispose();
	
	}
}
	}
