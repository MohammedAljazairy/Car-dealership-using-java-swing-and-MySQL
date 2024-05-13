
package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Add_Emp_asCEO extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel fname;
	private static JLabel lname;
	private static JLabel email;
	private static JLabel nid;
	private static JLabel hiredate;
	private static JLabel contract;
	private static JLabel salary;
	private static JLabel bonus;
	private static JLabel Managerid;
	private static JLabel depid;
	private static JLabel Branchid;
	private static JLabel phonenum;
	private static JButton button_1;
	private static JButton button_2;
	private static JLabel pass;
	private static JTextField fname_text;
	private static JTextField lname_text;
	private static JTextField nidtext;
	private static JTextField email_T;
	private static JTextField hiredate_T;
	private static JTextField contract_T;
	private static JTextField salary_i;
	private static JTextField bonus_i;
	private static JTextField Managerid_i;
	private static JTextField depid_i;
	private static JTextField Branchid_i;
	private static JTextField phonenum_i;
	private static JTextField pass_t;
public Add_Emp_asCEO () {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("ADD EMPLOYEE");
frame.add(panel);
panel.setLayout(null);
fname =new JLabel("First name ");
fname.setBounds(30,80,400,25);
panel.add(fname);
fname_text = new JTextField(15);
fname_text.setBounds(100, 80, 140, 25);
panel.add(fname_text);
lname =new JLabel("Last name ");
lname.setBounds(30,120,400,25);
panel.add(lname);
lname_text = new JTextField(15);
lname_text.setBounds(100, 120, 140, 25);
panel.add(lname_text);
nid =new JLabel("National Id ");
nid.setBounds(30,160,400,25);
panel.add(nid);
nidtext = new JTextField(15);
nidtext.setBounds(100, 160, 140, 25);
panel.add(nidtext);
email =new JLabel("Email ");
email.setBounds(30,195,400,25);
panel.add(email);
email_T = new JTextField(15);
email_T.setBounds(100, 195, 140, 25);
panel.add(email_T);
hiredate =new JLabel("Hiredate ");
hiredate.setBounds(30,240,400,25);
panel.add(hiredate);
hiredate_T = new JTextField(15);
hiredate_T.setBounds(100, 240, 140, 25);
panel.add(hiredate_T);
contract =new JLabel("Contract ");
contract.setBounds(30,280,400,25);
panel.add(contract);
contract_T = new JTextField(15);
contract_T.setBounds(100, 280, 140, 25);
panel.add(contract_T);
salary =new JLabel("Salary ");         
salary.setBounds(30,340,400,25);   
panel.add(salary);                 
salary_i = new JTextField(15);     
salary_i.setBounds(100, 340, 140, 25);
panel.add(salary_i);    
bonus =new JLabel("Bonus ");         
bonus.setBounds(30,400,400,25);   
panel.add(bonus);                 
bonus_i = new JTextField(15);     
bonus_i.setBounds(100, 400, 140, 25);
panel.add(bonus_i);
Managerid =new JLabel("Manager Id ");         
Managerid.setBounds(30,460,400,25);   
panel.add(Managerid);                 
Managerid_i = new JTextField(15);     
Managerid_i.setBounds(100, 460, 140, 25);
panel.add(Managerid_i);
depid =new JLabel("Department id ");         
depid.setBounds(30,520,400,25);   
panel.add(depid);                 
depid_i = new JTextField(15);     
depid_i.setBounds(100, 520, 140, 25);
panel.add(depid_i);
Branchid =new JLabel("Branch Id ");     
Branchid.setBounds(30,580,400,25);        
panel.add(Branchid);                     
Branchid_i = new JTextField(15);
Branchid_i.setBounds(100, 580, 140, 25); 
panel.add(Branchid_i);
pass =new JLabel("Password ");     
pass.setBounds(30,640,400,25);        
panel.add(pass);                     
pass_t = new JTextField(15);
pass_t.setBounds(100, 640, 140, 25); 
panel.add(pass_t);

phonenum =new JLabel("Phone Number ");     
phonenum.setBounds(320,80,400,25);        
panel.add(phonenum);                     
phonenum_i = new JTextField(15);
phonenum_i.setBounds(420, 80, 140, 25); 
panel.add(phonenum_i);
back = new JButton("BACK");
back.setBounds(30,20,160,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("DONE");
button_1.setBounds(550,200,180,25);
button_1.addActionListener(this);
panel.add(button_1);
button_2 = new JButton("Another phone");
button_2.setBounds(340,200,180,25);
button_2.addActionListener(this);
panel.add(button_2);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1))
	{String fname=fname_text.getText();
	String lname=lname_text.getText();
	int nid=Integer.parseInt(nidtext.getText());  
	String email=email_T.getText();      
	String hiredate=hiredate_T.getText();	
		String contract=contract_T.getText(); 
		int salary=Integer.parseInt(salary_i.getText());
		int bonus=Integer.parseInt(bonus_i.getText());
		int managerid=Integer.parseInt(Managerid_i.getText());
		int departmentid=Integer.parseInt(depid_i.getText());
		int branchid=Integer.parseInt(Branchid_i.getText());
		String pass=pass_t.getText();
			
           

	
	JOptionPane.showMessageDialog(this,"The employee has been created"); 
           

	
	
	



}
else if (e.getSource().equals(back)) {
	new CEO();
	frame.dispose();

	
	
}
else if(e.getSource().equals(button_2)) {
	int phonenum=Integer.parseInt(phonenum_i.getText());
	
}
}
	}