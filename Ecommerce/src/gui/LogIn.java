package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn {

	private JFrame jf_logIn;
	private JTextField tf_rut;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.jf_logIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jf_logIn = new JFrame();
		jf_logIn.setTitle("Login");
		jf_logIn.setBounds(100, 100, 432, 260);
		jf_logIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf_logIn.getContentPane().setLayout(null);
		
		JLabel lb_rut = new JLabel("RUT (Sin guion):");
		lb_rut.setBounds(40, 64, 90, 20);
		jf_logIn.getContentPane().add(lb_rut);
		
		JLabel lb_password = new JLabel("Password:");
		lb_password.setBounds(40, 94, 75, 20);
		jf_logIn.getContentPane().add(lb_password);
		
		tf_rut = new JTextField();
		tf_rut.setBounds(135, 64, 220, 20);
		jf_logIn.getContentPane().add(tf_rut);
		tf_rut.setColumns(10);
		
		JButton btn_logIn = new JButton("Ingresar");
		btn_logIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf_logIn.setVisible(false);
				UserHome userHome = new UserHome();
				//Abrir userHome
			}
		});
		btn_logIn.setBounds(135, 126, 105, 23);
		jf_logIn.getContentPane().add(btn_logIn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 95, 220, 20);
		jf_logIn.getContentPane().add(passwordField);
		
		JButton btn_signIn = new JButton("Registrate");
		btn_signIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf_logIn.setVisible(false);
				SignIn signIn = new SignIn();
				//Abrir Sign In
				
			}
		});
		btn_signIn.setBounds(250, 126, 105, 23);
		jf_logIn.getContentPane().add(btn_signIn);
	}
}
