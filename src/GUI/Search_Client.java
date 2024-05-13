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

public class Search_Client extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel name;
	private static JLabel id;
	private static JButton button_1;
	private static JTextField nametext;

	private static JTextField idtext;
	
public Search_Client() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("Search SALEPERSON");
frame.add(panel);
panel.setLayout(null);
name =new JLabel("Name ");
name.setBounds(30,80,400,25);
panel.add(name);
nametext = new JTextField(15);
nametext.setBounds(66, 80, 140, 25);
panel.add(nametext);
id =new JLabel("ID ");
id.setBounds(30,120,400,25);
panel.add(id);
idtext = new JTextField(15);
idtext.setBounds(66, 120, 140, 25);
panel.add(idtext);

back = new JButton("BACK");
back.setBounds(30,20,160,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("DONE");
button_1.setBounds(30,260,180,25);
button_1.addActionListener(this);
panel.add(button_1);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1))
	{String name=nametext.getText();          
	int id=Integer.parseInt(idtext.getText()); 
	
	JOptionPane.showMessageDialog(this,"The sale person has been removed"); 


frame.dispose();

}
else if (e.getSource().equals(back)) {
	
	frame.dispose();
	
	
	
}
}
	}
