
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class listofallemployeesundermanager_asCEO extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel emp_id;
	private static JTextField emp_idt;
	private static JButton button_1;
	private static JPanel panel2;

	
public listofallemployeesundermanager_asCEO() {
frame= new JFrame();
panel= new JPanel();
panel2= new JPanel();
frame.setLayout(null);
panel2.setBounds(280, 0,1080,700);
panel.setBounds(0, 10, 290, 444);
panel.setLayout(null);

frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("List of all employees under a manager");
frame.add(panel);
panel.setLayout(null);
emp_id =new JLabel("Employee id ");
emp_id.setBounds(0,80,140,25);
panel.add(emp_id);
emp_idt =new JTextField(15);
emp_idt.setBounds(70,80,140,25);
panel.add(emp_idt);
frame.add(panel);
back = new JButton("BACK");
back.setBounds(5,20,100,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("SEARCH");
button_1.setBounds(120,20,100,25);
button_1.addActionListener(this);
panel.add(button_1);
frame.add(panel2);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1))
	{     		int emp_id=Integer.parseInt(emp_idt.getText());    

	
	//emp_nid, emp_fname, emp_lname, emp_email, hire_date, contract_duration, salary, bonus, dep_id, branch_id
	 String column[]={"emp_id","emp_nid","emp_fname","emp_lname","emp_email","hire_date","contract_duration","salary","bonus","dep_id","Manager_ID","branch_id"};

	String employees[][] = Database.Connection_To_Database_Select_All_employees_under_manager(emp_id,column);
	
	
	   
	 
	 JTable jt=new JTable(employees,column);
	 jt.setPreferredScrollableViewportSize(jt.getPreferredSize());
		 jt.setFillsViewportHeight(true);
	jt.setBounds(0,40,1080,700);
	JScrollPane sp=new JScrollPane(jt);   
	sp.setBounds(400,40,900,700);
	panel2.add(sp); 
	//JOptionPane.showMessageDialog(this,"The Car has been removed"); 




}
else if (e.getSource().equals(back)) {
	new CEO();
	frame.dispose();
	
	
	
}
}
	}