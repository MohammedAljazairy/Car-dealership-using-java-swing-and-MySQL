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

public class Add_Department extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel dep_name;
	private static JLabel Branch_id;
	private static JLabel maxempnumid;
	private static JButton button_1;
	private static JTextField dep_nametext;
	private static JTextField maxempnumtext;
	private static JTextField Branch_id_text;
	private static JTextField manageridtext;
	private static JLabel managerid;
 
public Add_Department() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("Add Department");
frame.add(panel);
panel.setLayout(null);
dep_name =new JLabel("dep_name ");
dep_name.setBounds(5,80,400,25);
panel.add(dep_name);
dep_nametext = new JTextField(15);
dep_nametext.setBounds(95, 80, 140, 25);
panel.add(dep_nametext);
Branch_id =new JLabel("Branch Id ");
Branch_id.setBounds(5,120,400,25);
panel.add(Branch_id);
Branch_id_text = new JTextField(15);
Branch_id_text.setBounds(95, 120, 140, 25);
panel.add(Branch_id_text);
maxempnumid =new JLabel("maxempnum ");
maxempnumid.setBounds(5,160,400,25);
panel.add(maxempnumid);
maxempnumtext = new JTextField(15);
maxempnumtext.setBounds(95, 160, 140, 25);
panel.add(maxempnumtext);
managerid =new JLabel("Manager ID ");
managerid.setBounds(5,200,400,25);
panel.add(managerid);
manageridtext = new JTextField(15);
manageridtext.setBounds(150, 200, 140, 25);
panel.add(manageridtext);
back = new JButton("BACK");
back.setBounds(30,20,160,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("DONE");
button_1.setBounds(80,280,180,25);
button_1.addActionListener(this);
panel.add(button_1);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1)){
		
		String dep_name=dep_nametext.getText();                  
	    //int Branch_id = Integer.parseInt(Branch_id_text.getText());
		int maxempnum=Integer.parseInt(maxempnumtext.getText()); 
		int managerid=Integer.parseInt(manageridtext.getText());
		Database.Connection_To_Database_insert_Department(dep_name, maxempnum);
     	
	}
	else if(e.getSource().equals(back)) {
    			new CEO();
    				frame.dispose();
    				}

          }
		
	}