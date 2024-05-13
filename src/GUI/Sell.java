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

public class Sell extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel fname;
	private static JLabel lname;
	private static JLabel email;
	private static JLabel clnid;
	private static JLabel eid;
	
	private static JLabel chasisnum;
	private static JLabel orderdate;
	private static JLabel phonenum;
	private static JButton button_1;
	private static JButton button_2;
	private static JTextField fname_text;
	private static JTextField lname_text;
	private static JTextField clnidtext;
	private static JTextField eidtext;
	private static JTextField email_T;
	private static JTextField orderdate_T;
	
	private static JTextField chasisnum_i;
	private static JTextField phonenum_i;
public Sell() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("Sell New Car");
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
clnid =new JLabel("Clinet National Id ");
clnid.setBounds(5,160,400,25);
panel.add(clnid);
clnidtext = new JTextField(15);
clnidtext.setBounds(100, 160, 140, 25);
panel.add(clnidtext);
eid =new JLabel("Employee Id ");
eid.setBounds(30,220,400,25);
panel.add(eid);
eidtext = new JTextField(15);
eidtext.setBounds(100, 220, 140, 25);
panel.add(eidtext);
email =new JLabel("Email ");
email.setBounds(30,280,400,25);
panel.add(email);
email_T = new JTextField(15);
email_T.setBounds(100, 280, 140, 25);
panel.add(email_T);
orderdate =new JLabel("Order date ");
orderdate.setBounds(30,340,400,25);
panel.add(orderdate);
orderdate_T = new JTextField(15);
orderdate_T.setBounds(100, 340, 140, 25);
panel.add(orderdate_T);
chasisnum =new JLabel("Chasis Number ");         
chasisnum.setBounds(10,400,400,25);   
panel.add(chasisnum);                 
chasisnum_i = new JTextField(15);     
chasisnum_i.setBounds(100, 400, 140, 25);
panel.add(chasisnum_i);    

phonenum =new JLabel("Phone Number ");     
phonenum.setBounds(10,460,400,25);        
panel.add(phonenum);                     
phonenum_i = new JTextField(15);
phonenum_i.setBounds(100,460 , 140, 25); 
panel.add(phonenum_i);
back = new JButton("BACK");
back.setBounds(30,20,160,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("DONE");
button_1.setBounds(300,520,180,25);
button_1.addActionListener(this);
panel.add(button_1);
button_2 = new JButton("Another phone");
button_2.setBounds(100,520,180,25);
button_2.addActionListener(this);
panel.add(button_2);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1))
	{String fname=fname_text.getText();
	String lname=lname_text.getText();
	int clnid=Integer.parseInt(clnidtext.getText());  
	int emp_id=Integer.parseInt(eidtext.getText());	
	String email=email_T.getText();      
	String orderdate=orderdate_T.getText();	 
	String chasisnum=(chasisnum_i.getText());	 
	
	
           

	
	JOptionPane.showMessageDialog(this,"The car has been sold"); 
	



}
else if (e.getSource().equals(back)) {
	
	frame.dispose();

	
	
}
else if(e.getSource().equals(button_2)) {
	int phonenum=Integer.parseInt(phonenum_i.getText());	
	
}
}
	}
