
package GUI;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class GUI_LOGIN_SALES_PERSON extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JLabel userlabel;
	private static JTextField usertext;
	private static JLabel password;
	private static JPasswordField passtext;
	private static JButton button_1;
	private static JLabel Check;
	private static JFrame frame;
	private static int count=0;


public GUI_LOGIN_SALES_PERSON() {
 frame= new JFrame();
JPanel panel= new JPanel();

frame.setSize(600, 400);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setTitle("Login Page");
Toolkit toolkit=getToolkit();
Dimension size = toolkit.getScreenSize();
frame.setLocation(size.width/4-getWidth()/8,size.height/4-getHeight()/2);

frame.add(panel);
panel.setLayout(null);

 userlabel=new JLabel("username");
userlabel.setBounds(220, 40, 80, 25);
panel.add(userlabel);
 usertext = new JTextField(15);
usertext.setBounds(220, 60, 165, 25);
panel.add(usertext);
 password =new JLabel("password");
password.setBounds(220, 80, 80, 25);
panel.add(password);
 passtext = new JPasswordField();
passtext.setBounds(220, 100,165, 25);
panel.add(passtext);
 button_1 = new JButton("Login");
button_1.setBounds(220,140,80,25);
button_1.addActionListener(this);
panel.add(button_1);
 Check = new  JLabel("");
Check.setBounds(220, 180, 300, 25);
panel.add(Check);
frame.setVisible(true);

}


	@Override	

	public void actionPerformed(ActionEvent e) {		
		

	 		
			String useer=usertext.getText();
		@SuppressWarnings("deprecation")
		String pasword = passtext.getText();
		
		String department = Database.Connection_To_Database_Authentication_login(useer, pasword);
		System.out.println("here "+ department);


		if("sales".equals(department)) {
			
			count=0;
			frame.dispose();
			frame.setTitle("");
			new Sell();
		}
		
		
	else  {			
		count++;	
		Check.setText("Wrong Password");
		if(count==3) {
			frame.setVisible(false);
		}
	
		}
		
		
		}
		}
		



