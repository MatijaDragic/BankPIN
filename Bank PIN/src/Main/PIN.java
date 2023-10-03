package Main;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;
import swing.MyJButton;

import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.SwingConstants;

public class PIN extends JPanel {
	private static JPasswordField passwordField;

	public PIN() {
		
		IconFontSwing.register(FontAwesome.getIconFont());
		
		setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Poppins Black", Font.PLAIN, 30));
		passwordField.setOpaque(false);
		passwordField.setEditable(false);
		passwordField.setForeground(Color.BLACK);
		passwordField.setBorder(new LineBorder(Color.BLACK));
		passwordField.setBounds(112, 47, 214, 71);
		add(passwordField);
		
		MyJButton btnNewButton = new MyJButton("1");
        btnNewButton.setBounds(112, 129, 46, 46);
        add(btnNewButton);
		
        MyJButton btnNewButton_1 = new MyJButton("2");
		btnNewButton_1.setBounds(168, 129, 46, 46);
		add(btnNewButton_1);
		
		MyJButton btnNewButton_2 = new MyJButton("3");
		btnNewButton_2.setBounds(224, 129, 46, 46);
		add(btnNewButton_2);
		
		MyJButton btnNewButton_3 = new MyJButton("4");
		btnNewButton_3.setBounds(112, 187, 46, 46);
		add(btnNewButton_3);
		
		MyJButton btnNewButton_4 = new MyJButton("5");
		btnNewButton_4.setBounds(168, 187, 46, 46);
		add(btnNewButton_4);
		
		MyJButton btnNewButton_5 = new MyJButton("6");
		btnNewButton_5.setBounds(224, 187, 46, 46);
		add(btnNewButton_5);
		
		MyJButton btnNewButton_5_1 = new MyJButton("");
		btnNewButton_5_1.setIcon(Main.initIcons(FontAwesome.TRASH, 24, Color.BLACK));
		btnNewButton_5_1.setBounds(280, 129, 46, 46);
		add(btnNewButton_5_1);
		
		MyJButton btnNewButton_5_2 = new MyJButton("");
		btnNewButton_5_2.setIcon(Main.initIcons(FontAwesome.QRCODE, 24, Color.BLACK));
		btnNewButton_5_2.setBounds(280, 187, 46, 46);
		add(btnNewButton_5_2);
		
		MyJButton btnNewButton_5_3 = new MyJButton("7");
		btnNewButton_5_3.setBounds(112, 244, 46, 46);
		add(btnNewButton_5_3);
		
		MyJButton btnNewButton_5_4 = new MyJButton("8");
		btnNewButton_5_4.setBounds(168, 244, 46, 46);
		add(btnNewButton_5_4);
		
		MyJButton btnNewButton_5_5 = new MyJButton("9");
		btnNewButton_5_5.setBounds(224, 244, 46, 46);
		add(btnNewButton_5_5);
		
		MyJButton btnNewButton_5_6 = new MyJButton("");
		btnNewButton_5_6.setIcon(Main.initIcons(FontAwesome.SIGN_IN, 24, Color.BLACK));
		btnNewButton_5_6.setBounds(280, 244, 46, 46);
		add(btnNewButton_5_6);
		
		//img 450x300px
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("path/to/your/img"));
		lblNewLabel.setBounds(0, 0, 450, 300);
		add(lblNewLabel);

	}
	
	public static String getPassword() {
		return passwordField.getText();
	}
	
	public static void setPassword(String text) {
		
		if(getPassword().length() != 4) {
			passwordField.setText(getPassword() + text);
		}else {
			return;
		}
		
	}
	
	public static String randomPIN() {
		Random r = new Random();
		int pin = r.nextInt() * 1000;
		return String.valueOf(pin);
	}
	
	public static void clearPassword() {
		passwordField.setText("");
		System.out.println(passwordField.getText());
	}
}
