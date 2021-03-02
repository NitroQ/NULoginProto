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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Login {
	Credentials id1;
	
	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login(null);
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
	public Login(Credentials id) {
		id1 = id;
		initialize();
	}
	

	
	
	public boolean checkFields(){
	
		
		String uName = textField.getText();
		String pass1 = String.valueOf(passwordField.getPassword());
		String usName = id1.getUname();
		String opass = id1.getpass1();
		
		if( uName.trim().equals("")|| pass1.trim().equals("")){
			 JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
	            return false;
		}else if(!pass1.equals(opass) || !uName.equals(usName)) {
			JOptionPane.showMessageDialog(null, "Password Doesn't Match","Check Username/Password",2); 
			 return false;
		}else {
			return true;
		}
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = new Dimension (950, 650);
		
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
		btnNewButton.setBounds(849, 98, 50, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(53, 64, 142));
		lblNewLabel_1.setFont(new Font("Product Sans", Font.BOLD, 35));
		lblNewLabel_1.setBounds(538, 151, 266, 61);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Product Sans", Font.PLAIN, 19));
		textField.setBackground(Color.WHITE);
		textField.setBounds(426, 256, 379, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(426, 220, 143, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Product Sans", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(426, 323, 131, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Log In");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(checkFields()) {
					Window rt = new Window(id1);
					rt.frame.setVisible(true);
					frame.dispose();
				}
			}
		});
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Product Sans", Font.BOLD, 22));
		lblNewLabel_5.setBounds(717, 426, 105, 48);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(checkFields()) {
					Window rt = new Window(id1);
					rt.frame.setVisible(true);
					frame.dispose();
				}
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/Button120.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img2));
		lblNewLabel_4.setBounds(688, 416, 131, 69);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("No Account Yet?");
		lblNewLabel_6.setFont(new Font("Product Sans", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(426, 447, 120, 27);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sign Up.");
		lblNewLabel_7.setForeground(new Color(0, 0, 128));
		lblNewLabel_7.setFont(new Font("Product Sans", Font.BOLD, 15));
		lblNewLabel_7.setBounds(539, 447, 69, 27);
		frame.getContentPane().add(lblNewLabel_7);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Product Sans", Font.PLAIN, 19));
		passwordField.setBounds(425, 353, 379, 45);
		frame.getContentPane().add(passwordField);
		
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Login3Final.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(20, 11, 909, 628);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
	
		
		
	}

	

}
