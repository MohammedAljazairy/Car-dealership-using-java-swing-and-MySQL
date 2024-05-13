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

public class Remove_Branch extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel city;
	private static JLabel street;
	private static JTextField streettext;
		private static JButton button_1;
	private static JTextField citytext;

	
public Remove_Branch() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("REMOVE BRANCH");
frame.add(panel);
panel.setLayout(null);
city =new JLabel("city ");
city.setBounds(30,80,400,25);
panel.add(city);
citytext = new JTextField(15);
citytext.setBounds(66, 80, 140, 25);
panel.add(citytext);
street =new JLabel("street ");
street.setBounds(25,120,140,25);
panel.add(street);
streettext =new JTextField(15);
streettext.setBounds(66,120,140,25);
panel.add(streettext);

back = new JButton("BACK");
back.setBounds(30,20,160,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("DONE");
button_1.setBounds(30,160,180,25);
button_1.addActionListener(this);
panel.add(button_1);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1))
	{String city=citytext.getText();           
	String street=streettext.getText(); 
	JOptionPane.showMessageDialog(this,"The Branch has been removed"); 


}
else if (e.getSource().equals(back)) {
   new CEO();
	frame.dispose();
	
	
	
}
}
	}