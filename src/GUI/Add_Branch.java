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

public class Add_Branch extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel city;
	private static JLabel street;
	private static JLabel managerid;
	private static JLabel nofcars;
	private static JButton button_1;
	private static JTextField citytext;
	private static JTextField streettext;
	private static JTextField nofcarstext;
	private static JTextField manageridtext;

 
public Add_Branch() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("Add Branch");
frame.add(panel);
panel.setLayout(null);
city =new JLabel("City ");
city.setBounds(5,80,400,25);
panel.add(city);
citytext = new JTextField(15);
citytext.setBounds(95, 80, 140, 25);
panel.add(citytext);
street =new JLabel("Street ");
street.setBounds(5,120,400,25);
panel.add(street);
streettext = new JTextField(15);
streettext.setBounds(95, 120, 140, 25);
panel.add(streettext);
nofcars =new JLabel("Number of cars ");
nofcars.setBounds(5,160,400,25);
panel.add(nofcars);
nofcarstext = new JTextField(15);
nofcarstext.setBounds(95, 160, 140, 25);
panel.add(nofcarstext);
managerid =new JLabel("Manager Id");
managerid.setBounds(5,200,400,25);
panel.add(managerid);
manageridtext = new JTextField(15);
manageridtext.setBounds(95, 200, 140, 25);
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
		
		String city=citytext.getText();          
		String street=streettext.getText();          
		int managerid=Integer.parseInt(manageridtext.getText());     
		int nofcars=Integer.parseInt(nofcarstext.getText());      

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
    			new CEO();
    				frame.dispose();
    				}

          }
		
	}
	