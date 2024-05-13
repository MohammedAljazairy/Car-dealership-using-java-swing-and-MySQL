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

public class Delete_Car_asCEO extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel chasis;
	private static JTextField chasistext;
	private static JButton button_1;
	
public Delete_Car_asCEO() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("REMOVE CAR");
frame.add(panel);
panel.setLayout(null);
chasis =new JLabel("Chasis Number");
chasis.setBounds(25,80,140,25);
panel.add(chasis);
chasistext =new JTextField(15);
chasistext.setBounds(140,80,140,25);
panel.add(chasistext);

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
	{     		String chasisnum=chasistext.getText();      

	JOptionPane.showMessageDialog(this,"The Car has been removed"); 




}
else if (e.getSource().equals(back)) {
	new CEO();
	frame.dispose();
	
	
	
}
}
	}