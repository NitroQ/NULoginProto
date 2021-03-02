import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Welcome {
	
	public JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
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
	public Welcome() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
		Dimension frameSize = new Dimension (1009, 713);
		
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.setBounds (ss.width / 2 - frameSize.width / 2, ss.height/2 - frameSize.height/2,frameSize.width, frameSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(929, 103, 50, 28);
		btnNewButton.setBorder(new RoundedBorder(15));
		btnNewButton.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Log In");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Credentials id = new Credentials();
				Login lg = new Login(id);
				lg.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Product Sans", Font.BOLD, 30));
		lblNewLabel_1.setBounds(745, 327, 201, 91);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sign Up");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Credentials id = new Credentials();
				SignUp sp = new SignUp(id);
				sp.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Product Sans", Font.BOLD, 30));
		lblNewLabel_2.setBounds(762, 439, 169, 79);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1000, 677);
		Image img = new ImageIcon(this.getClass().getResource("/Welcome3Final.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		
	
		
		
		
		
	}
}
