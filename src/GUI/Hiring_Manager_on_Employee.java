
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

public class Hiring_Manager_on_Employee extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel managerid;
	private static JLabel Branch_id;
	private static JLabel dep_idid;
	private static JButton button_1;
	private static JTextField manageridtext;
	private static JTextField dep_idtext;
	private static JTextField Branch_id_text;
 
public Hiring_Manager_on_Employee() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("Hiring Manager on Employee");
frame.add(panel);
panel.setLayout(null);
managerid =new JLabel("Manager ID ");
managerid.setBounds(5,80,400,25);
panel.add(managerid);
manageridtext = new JTextField(15);
manageridtext.setBounds(95, 80, 140, 25);
panel.add(manageridtext);
Branch_id =new JLabel("Branch ID ");
Branch_id.setBounds(5,120,400,25);
panel.add(Branch_id);
Branch_id_text = new JTextField(15);
Branch_id_text.setBounds(95, 120, 140, 25);
panel.add(Branch_id_text);
dep_idid =new JLabel("Department ID ");
dep_idid.setBounds(5,160,400,25);
panel.add(dep_idid);
dep_idtext = new JTextField(15);
dep_idtext.setBounds(95, 160, 140, 25);
panel.add(dep_idtext);
back = new JButton("BACK");
back.setBounds(30,20,160,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("DONE");
button_1.setBounds(80,200,180,25);
button_1.addActionListener(this);
panel.add(button_1);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1)){
		  
	    int managerid = Integer.parseInt(manageridtext.getText());
	    int Branch_id = Integer.parseInt(Branch_id_text.getText());
		int dep_id=Integer.parseInt(dep_idtext.getText());     
	//	int result = JOptionPane.showConfirmDialog(this,"do want to calculate the customs for this car", "Customs",
			
        //     JOptionPane.YES_NO_OPTION,
       //      JOptionPane.QUESTION_MESSAGE);
       //   if(result == JOptionPane.YES_OPTION){
   
            
            
         // }
         // else if (result == JOptionPane.NO_OPTION){
        //		new SalePerson();
		//		frame.dispose();
         // }
     	
	}
	else if(e.getSource().equals(back)) {
    			new HR();
    				frame.dispose();
    				}

          }
		
	}