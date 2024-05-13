
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
import javax.swing.JTextField;

public class list_of_soldCars extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel emp_id;
	private static JTextField emp_idt;
	private static JButton button_1;
	private static JPanel panel2;

	
public list_of_soldCars() {
frame= new JFrame();
panel= new JPanel();
panel2= new JPanel();
frame.setLayout(null);
panel2.setBounds(280, 0,1080,700);
panel.setBounds(0, 10, 290, 444);
panel.setLayout(null);
String data[][]= {};
 //String data[][]={ {"GMC","SUV","YUKON","2021","V8","5700","7","USA","15515155","AUTO","17","LED","HDR484R4DH","14"}};   
 String column[]={"Name","Type","Model","Year","Engine","Capcity","No.of Seats","Region","Price","Gearbox","Tyre Size","Headlight type","Chasis number","Branch ID"}; 
 JTable jt=new JTable(data,column);
 jt.setPreferredScrollableViewportSize(jt.getPreferredSize());
	 jt.setFillsViewportHeight(true);
jt.setBounds(0,40,1080,700);
JScrollPane sp=new JScrollPane(jt);   
sp.setBounds(400,40,900,700);
panel2.add(sp); 
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("List of all sold cars under employee");
frame.add(panel);
panel.setLayout(null);
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

	//JOptionPane.showMessageDialog(this,"The Car has been removed"); 




}
else if (e.getSource().equals(back)) {
	new Manager();
	frame.dispose();
	
	
	
}
}
	}