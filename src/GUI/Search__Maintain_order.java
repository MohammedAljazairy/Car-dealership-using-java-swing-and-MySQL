
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

public class Search__Maintain_order extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel chasis;
	private static JTextField chasistext;
	private static JButton button_1;
	private static JPanel panel2;

	
	
	

	


	
public Search__Maintain_order() {
	frame= new JFrame();
	panel= new JPanel();
	frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	frame.setSize(600, 400);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setTitle("Search CAR FOR MAINTAINCE");
	frame.add(panel);
	panel.setLayout(null);
	chasis =new JLabel("Chasis Number ");
	chasis.setBounds(25,80,140,25);
	panel.add(chasis);
	chasistext =new JTextField(15);
	chasistext.setBounds(140,80,140,25);
	panel.add(chasistext);
	panel2= new JPanel();
	frame.setLayout(null);
	panel2.setBounds(280, 0,1080,700);
	panel.setBounds(0, 10, 290, 444);
	panel.setLayout(null);
	String data[][]= {};
	 //String data[][]={ {"GMC","SUV","YUKON","2021","V8","5700","7","USA","15515155","AUTO","17","LED","HDR484R4DH","14"}};   
	 String column[]={"Phone Number","Chasis Number","Maintence","Problem with the car","Warrenty"}; 
	 JTable jt=new JTable(data,column);
	 jt.setPreferredScrollableViewportSize(jt.getPreferredSize());
		 jt.setFillsViewportHeight(true);
	jt.setBounds(0,40,1080,700);
	JScrollPane sp=new JScrollPane(jt);   
	sp.setBounds(400,40,900,700);
	panel2.add(sp); 
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
		{     		String chasisnum=chasistext.getText();      

		JOptionPane.showMessageDialog(this,"Here is the record"); 




	}
	else if (e.getSource().equals(back)) {
		new Maintence();
		frame.dispose();
		
		
		
	}
	}
		}