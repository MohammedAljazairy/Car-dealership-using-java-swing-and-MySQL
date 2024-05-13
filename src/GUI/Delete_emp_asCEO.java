
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

public class Delete_emp_asCEO extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel nid;
	private static JButton button_1;
	private static JTextField nidtext;
	
public Delete_emp_asCEO() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("REMOVE EMPLOYEE");
frame.add(panel);
panel.setLayout(null);
nid =new JLabel("Nid ");
nid.setBounds(30,80,400,25);
panel.add(nid);
nidtext = new JTextField(15);
nidtext.setBounds(66, 80, 140, 25);
panel.add(nidtext);

back = new JButton("BACK");
back.setBounds(30,20,160,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("DONE");
button_1.setBounds(30,120,180,25);
button_1.addActionListener(this);
panel.add(button_1);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1))
	{         
	int Nnid=Integer.parseInt(nidtext.getText()); 
	
	JOptionPane.showMessageDialog(this,"The employee has been removed"); 




}
else if (e.getSource().equals(back)) {
	new CEO();	
	frame.dispose();
	
}
}
	}