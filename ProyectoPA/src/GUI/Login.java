package GUI;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AdminScreen.AdminScreen;
import ClientScreen.ClientScreen;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Connection con;

	/**
	 * Launch the application.
	 * 
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setBounds(100, 100, 538, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(114, 60, 164, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(114, 25, 139, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(114, 99, 164, 29);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 138, 164, 29);
		contentPane.add(textField_1);
		//login button creation and function
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//AdminScreen as = new AdminScreen();
				//as.setVisible(true);
				
				ClientScreen cs = new ClientScreen();
				cs.setVisible(true);
				
				Login.this.dispose();
			}
		});
		login.setBounds(114, 188, 164, 38);
		contentPane.add(login);
		
		
		
		JLabel lblNewLabel = new JLabel("No tienes una cuenta?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(115, 246, 219, 46);
		contentPane.add(lblNewLabel);
		
		JButton signUp = new JButton("Registrate");
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn si = new SignIn();
				si.setVisible(true);
				
				Login.this.dispose();
			}
		});
		signUp.setBounds(318, 254, 139, 38);
		contentPane.add(signUp);
		
		JButton closeProgram = new JButton("");
		closeProgram.setBounds(441, 10, 100,32);
		ImageIcon image = new ImageIcon("Media/Exit3.png");
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(closeProgram.getWidth(), closeProgram.getHeight(), Image.SCALE_DEFAULT));
		closeProgram.setIcon(icon);
		closeProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.this.dispose();
			}
		});
		closeProgram.setFont(new Font("Tahoma", Font.PLAIN, 15));
		closeProgram.setBounds(441, 10, 73, 29);
		contentPane.add(closeProgram);
	}
	
}
