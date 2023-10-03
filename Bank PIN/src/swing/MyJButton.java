package swing;

import javax.swing.*;
import javax.swing.border.LineBorder;

import Main.PIN;
import jiconfont.icons.font_awesome.FontAwesome;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;

public class MyJButton extends JButton {

    public MyJButton(String text) {
    	
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false); 
        setBorder(new LineBorder(Color.BLACK));
        setBackground(new Color(255, 255, 255, 0));
        setFont(new Font("Poppins Black", Font.BOLD, 11));
        setForeground(Color.BLACK);
        addMouseListener(new MyMouseListener());
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(new Color(255,255,255,10));
            repaint();
        } else {
            g.setColor(new Color(255,255,255,0));
            repaint();
        }
        
        ((Graphics2D) g).fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(),0,0));

        super.paintComponent(g);
    }

    private class MyMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
        	MyJButton button = (MyJButton) e.getSource();
            String buttonText = button.getText();
            
            PIN.setPassword(buttonText);

            if(button.getX() == 280 && button.getY() == 129) {
            	PIN.clearPassword();
            }else if(button.getX() == 280 && button.getY() == 187) {
            	PIN.randomPIN();
            }else if(button.getX() == 280 && button.getY() == 244) {
            	if(PIN.getPassword().equals("1234")) {
            		JOptionPane.showMessageDialog(null, "Cestitamo!!!");
            	}else {
            		JOptionPane.showMessageDialog(null, "Netacna lozinka,pokusajte ponovo...");
            		PIN.clearPassword();
            	}
            }
        	
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // Handle mouse press event
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        	// Handle mouse released event
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // Handle mouse enter event
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // Handle mouse exit event
        }
    }
}
