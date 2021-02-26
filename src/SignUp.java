import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUp {
	Credentials id1;
	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_4;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp(Credentials id) {
		id1 =id;
		initialize();
	}
	

	public void callLogin() {
		Login lg = new Login(id1);
		lg.frame.setVisible(true);
		frame.dispose();
		
	}
	
	public void setStuff() {
		String fName = textField.getText();;
		String uName = textField_3.getText();
		String pass1 = String.valueOf(passwordField.getPassword());
		
		id1.setFname(fName);
		id1.setUname(uName);
		id1.setpass1(pass1);
	}
	
	
	public boolean checkFields(){
		String sName = textField.getText();
		String uName = textField_3.getText();
		String pass1 = String.valueOf(passwordField.getPassword());
		String pass2 = String.valueOf(passwordField_1.getPassword());
	
		
		
		if(sName.trim().equals("") || uName.trim().equals("")|| pass1.trim().equals("") || pass2.trim().equals("")){
			 JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
	            return false;
		}else if(!pass1.equals(pass2)) {
			JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2); 
			 return false;
		}else {
			return true;
		}
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
		Dimension frameSize = new Dimension (1228, 765);
		
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.setBounds (ss.width / 2 - frameSize.width / 2, ss.height/2 - frameSize.height/2,frameSize.width, frameSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBorder(new RoundedBorder(15));
		btnNewButton.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(1137, 87, 50, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Create an Account");
		lblNewLabel_1.setForeground(new Color(53, 64, 142));
		lblNewLabel_1.setFont(new Font("Product Sans", Font.BOLD, 35));
		lblNewLabel_1.setBounds(795, 126, 379, 85);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Product Sans", Font.PLAIN, 19));
		textField.setBackground(Color.WHITE);
		textField.setBounds(480, 254, 257, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Product Sans", Font.PLAIN, 19));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(747, 254, 257, 38);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(480, 222, 180, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name");
		lblNewLabel_3.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(747, 226, 98, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Product Sans", Font.PLAIN, 19));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(1010, 254, 86, 38);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Suffix");
		lblNewLabel_4.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(1010, 228, 89, 26);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Product Sans", Font.PLAIN, 19));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(480, 347, 257, 38);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(480, 318, 120, 28);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Product Sans", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Non-Binary", "Trans", "Others"}));
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(1015, 347, 78, 38);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(1015, 320, 78, 24);
		frame.getContentPane().add(lblNewLabel_6);
		comboBox.setFont(new Font("Product Sans", Font.PLAIN, 15));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(Color.WHITE);
		passwordField_1.setBounds(797, 445, 299, 38);
		frame.getContentPane().add(passwordField_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Product Sans", Font.PLAIN, 19));
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(747, 346, 257, 38);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(480, 445, 289, 38);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_8 = new JLabel("Email");
		lblNewLabel_8.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(747, 318, 57, 28);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("Password");
		lblNewLabel_7.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(480, 413, 120, 28);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("Repeat Password");
		lblNewLabel_9.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(799, 413, 205, 28);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("Sign Up");
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(checkFields()) {
					setStuff();
					JOptionPane.showMessageDialog(null, "Account Registered!");
					callLogin();
				}

			}
		});
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Product Sans", Font.BOLD, 22));
		lblNewLabel_11.setBounds(996, 532, 86, 28);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
					if(checkFields()) {
						setStuff();
						JOptionPane.showMessageDialog(null, "Account Registered!");
						callLogin();
					}
				
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/Button120.png")).getImage();
		lblNewLabel_10.setIcon(new ImageIcon(img2));
		lblNewLabel_10.setBounds(976, 517, 165, 59);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_13 = new JLabel("Already Have an Account? ");
		lblNewLabel_13.setFont(new Font("Product Sans", Font.PLAIN, 17));
		lblNewLabel_13.setBounds(480, 534, 217, 28);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_12 = new JLabel("Log In.");
		lblNewLabel_12.setForeground(new Color(0, 0, 128));
		lblNewLabel_12.setBackground(new Color(255, 255, 255));
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Credentials id = new Credentials();
				Login lg = new Login(id);
				lg.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblNewLabel_12.setFont(new Font("Product Sans", Font.BOLD, 17));
		lblNewLabel_12.setBounds(679, 532, 78, 33);
		frame.getContentPane().add(lblNewLabel_12);
		
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Sign Up3Final.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 11, 1200, 754);
		frame.getContentPane().add(lblNewLabel);
		
	
		
	
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	
		
		
		
	
		
		
		
	
		
	
		
		
		
		
		
		
	
		
		
		
		
		
		
	}
}
