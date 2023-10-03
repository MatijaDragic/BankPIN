package Main;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jiconfont.IconCode;
import jiconfont.swing.IconFontSwing;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setUndecorated(true);
		contentPane = new PIN();

		setContentPane(contentPane);
	}

	
public static Icon initIcons(IconCode code , int size , Color color) {
		
		Icon icon = IconFontSwing.buildIcon(code, size , color);
		
		return icon;
		
	}
}
