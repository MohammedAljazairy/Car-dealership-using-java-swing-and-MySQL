
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

public class Remove_Department extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel dep_name;
	private static JLabel street;
	private static JTextField streettext;
		private static JButton button_1;
	private static JTextField dep_nametext;

	
public Remove_Department() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("REMOVE DEPARTMENT");
frame.add(panel);
panel.setLayout(null);
dep_name =new JLabel("Department Name ");
dep_name.setBounds(30,80,400,25);
panel.add(dep_name);
dep_nametext = new JTextField(15);
dep_nametext.setBounds(140, 80, 140, 25);
panel.add(dep_nametext);

back = new JButton("BACK");
back.setBounds(30,20,160,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("DONE");
button_1.setBounds(30,150,180,25);
button_1.addActionListener(this);
panel.add(button_1);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1))
	{String dep_name=dep_nametext.getText();          

	
	JOptionPane.showMessageDialog(this,"The Department has been removed"); 
	//new Manager();

frame.dispose();

}
else if (e.getSource().equals(back)) {
	new CEO();
	frame.dispose();
	
	
	
}
}
	}