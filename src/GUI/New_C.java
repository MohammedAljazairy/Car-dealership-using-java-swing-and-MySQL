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

public class New_C extends JFrame implements ActionListener{
	private static JFrame frame;
	private static JPanel panel;
	private static JButton back;
	private static JLabel name;
	private static JLabel type;
	private static JLabel model;
	private static JLabel year;
	private static JLabel engine;
	private static JLabel engineCap;
	private static JLabel noOfseats;
	private static JLabel region;
	private static JLabel price;
	private static JLabel gearbox;
	private static JLabel tyreS;
	private static JLabel headlight;
	private static JLabel chasis;
	private static JLabel branchid;
	private static JButton button_1;
	private static JTextField nametext;
	private static JTextField typetext;
	private static JTextField modeltext;
	private static JTextField yeartext;
	private static JTextField enginetext;
	private static JTextField engineCaptext;
	private static JTextField noOfseatstext;
	private static JTextField regiontext;
	private static JTextField pricetext;
	private static JTextField gearboxtext;
	private static JTextField tyreStext;
	private static JTextField headlighttext;
	private static JTextField chasistext;
	private static JTextField branchid_i;
 
public New_C() {
frame= new JFrame();
panel= new JPanel();
frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("NEW");
frame.add(panel);
panel.setLayout(null);
name =new JLabel("Name ");
name.setBounds(5,80,400,25);
panel.add(name);
nametext = new JTextField(15);
nametext.setBounds(95, 80, 140, 25);
panel.add(nametext);
type =new JLabel("Type ");
type.setBounds(5,120,400,25);
panel.add(type);
typetext = new JTextField(15);
typetext.setBounds(95, 120, 140, 25);
panel.add(typetext);
model =new JLabel("Model ");
model.setBounds(5,160,400,25);
panel.add(model);
modeltext = new JTextField(15);
modeltext.setBounds(95, 160, 140, 25);
panel.add(modeltext);
year =new JLabel("Year ");
year.setBounds(5,200,400,25);
panel.add(year);
yeartext = new JTextField(15);
yeartext.setBounds(95, 200, 140, 25);
panel.add(yeartext);
engine =new JLabel("Engine");
engine.setBounds(5,240,400,25);
panel.add(engine);
enginetext = new JTextField(15);
enginetext.setBounds(95, 240, 140, 25);
panel.add(enginetext);
engineCap =new JLabel("Capcity");
engineCap.setBounds(5,280,400,25);
panel.add(engineCap);
engineCaptext = new JTextField(15);
engineCaptext.setBounds(95, 280, 140, 25);
panel.add(engineCaptext);
noOfseats =new JLabel("No.Of Seats");
noOfseats.setBounds(5,320,400,25);
panel.add(noOfseats);
noOfseatstext = new JTextField(15);
noOfseatstext.setBounds(95, 320, 140, 25);
panel.add(noOfseatstext);
region =new JLabel("Region");
region.setBounds(5,360,260,25);
panel.add(region);
regiontext = new JTextField(15);
regiontext.setBounds(95, 360, 140, 25);
panel.add(regiontext);
price =new JLabel("Price");
price.setBounds(5,400,140,25);
panel.add(price);
pricetext = new JTextField(15);
pricetext.setBounds(95, 400, 140, 25);
panel.add(pricetext);
gearbox =new JLabel("Gearbox");
gearbox.setBounds(5,440,400,25);
panel.add(gearbox);
gearboxtext = new JTextField(15);
gearboxtext.setBounds(95, 440, 140, 25);
panel.add(gearboxtext);
tyreS =new JLabel("Tyre Size");
tyreS.setBounds(5,480,400,25);
panel.add(tyreS);
tyreStext = new JTextField(15);
tyreStext.setBounds(95, 480, 140, 25);
panel.add(tyreStext);
headlight =new JLabel("Headlight Type ");
headlight.setBounds(5,520,400,25);
panel.add(headlight);
headlighttext = new JTextField(15);
headlighttext.setBounds(95, 520, 140, 25);
panel.add(headlighttext);
chasis =new JLabel("Chasis Number ");
chasis.setBounds(5,560,400,25);
panel.add(chasis);
chasistext = new JTextField(15);
chasistext.setBounds(95, 560, 140, 25);
panel.add(chasistext);
branchid =new JLabel("Branch ID");
branchid.setBounds(5,535,180,155);
panel.add(branchid);
branchid_i = new JTextField(15);
branchid_i.setBounds(95, 600, 140, 25);
panel.add(branchid_i);
back = new JButton("BACK");
back.setBounds(30,20,160,25);
back.addActionListener(this);
panel.add(back);
button_1 = new JButton("DONE");
button_1.setBounds(80,640,180,25);
button_1.addActionListener(this);
panel.add(button_1);
frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(button_1)){
		
		String name=nametext.getText();          
		String type=typetext.getText();          
		String model=modeltext.getText();         
		int year=Integer.parseInt(yeartext.getText());        
		String engine= enginetext.getText();        
		int engcap=Integer.parseInt(engineCaptext.getText());     
		String noOfseats=noOfseatstext.getText();     
		String region=regiontext.getText();        
		double price=Double.parseDouble(pricetext.getText());           
		String gearbox=	gearboxtext.getText();       
		int tyreS=Integer.parseInt(tyreStext.getText());         
		String headlight=headlighttext.getText();      
		String chsisnum=chasistext.getText();        
		int branchid=Integer.parseInt(branchid_i.getText()); 
		int result = JOptionPane.showConfirmDialog(this,"do want to calculate the customs for this car", "Customs",
			
             JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE);
          if(result == JOptionPane.YES_OPTION){
   
            
            
          }
          else if (result == JOptionPane.NO_OPTION){
        		
				frame.dispose();
          }
     	
	}
	else if(e.getSource().equals(back)) {
    			new Manager();
    				frame.dispose();
    				}

          }
		
	}
	
