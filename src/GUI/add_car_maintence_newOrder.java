
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

public class add_car_maintence_newOrder extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	
	private static JLabel type;
	private static JLabel phonenum;
	private static JLabel chasisnum;
	private static JLabel maintaindate;
	private static JLabel problemofcar;
	private static JButton button_1;

	private static JTextField typetext;
	private static JTextField phonenumt;
	private static JTextField chasisnumt;
	private static JTextField maintaindatet;
	private static JTextField problemofcart;
	private static JCheckBox  warrenty;
 
public add_car_maintence_newOrder() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("New order manintane");
frame.add(panel);
panel.setLayout(null);
phonenum =new JLabel("Phone Number ");
phonenum.setBounds(5,80,400,25);
panel.add(phonenum);
phonenumt = new JTextField(15);
phonenumt.setBounds(130,80 , 140, 25);
panel.add(phonenumt);
chasisnum =new JLabel("Chasis Number ");
chasisnum.setBounds(5,130,400,25);
panel.add(chasisnum);
chasisnumt = new JTextField(15);
chasisnumt.setBounds(130,130 , 140, 25);
panel.add(chasisnumt);
maintaindate =new JLabel("Maintaince Date");
maintaindate.setBounds(5,180,400,25);
panel.add(maintaindate);
maintaindatet = new JTextField(15);
maintaindatet.setBounds(130,180 , 140, 25);
panel.add(maintaindatet);
problemofcar =new JLabel("Problem with the car");
problemofcar.setBounds(5,230,400,25);
panel.add(problemofcar);
problemofcart = new JTextField(15);
problemofcart.setBounds(130,230 , 140, 25);
panel.add(problemofcart);
warrenty= new JCheckBox("Warrenty");
warrenty.setSelected(true);
warrenty.setBounds(25,270,440,25);
panel.add(warrenty);
back = new JButton("BACK");
back.setBounds(30,20,160,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("DONE");
button_1.setBounds(80,360,180,25);
button_1.addActionListener(this);
panel.add(button_1);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1)){
		
		     
		int phonenum=Integer.parseInt(phonenumt.getText());            
		String chasisnum= chasisnumt.getText();               
		String maintaindate= maintaindatet.getText();       
		String problemofcar= problemofcart.getText();
		boolean ch=(warrenty.isSelected());
		//int result = JOptionPane.showConfirmDialog(this,"do want to calculate the customs for this car", "Customs",
			
          //   JOptionPane.YES_NO_OPTION,
            // JOptionPane.QUESTION_MESSAGE);
        //  if(result == JOptionPane.YES_OPTION){
   
            
            
          }
        //  else if (result == JOptionPane.NO_OPTION){
        	//	new SalePerson();
				//frame.dispose();
          //}
     	
	//}
	else if(e.getSource().equals(back)) {
    			new Maintence();
    				frame.dispose();
    				}

          }
		
	}
	