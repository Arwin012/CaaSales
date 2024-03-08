package internalframes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class nissan extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nissan frame = new nissan();
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
	public nissan() {
		getContentPane().setBackground(Color.BLACK);
		setTitle("Nissan GTR R34");
		setIconifiable(true);
		setClosable(true);
		setResizable(true);
		setMaximizable(true);
		setBounds(100, 100, 501, 384);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Arwin\\Pictures\\Saved Pictures\\skyline.jpg"));
		lblNewLabel.setBounds(26, 47, 242, 166);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Price: $90000");
		lblNewLabel_3.setForeground(Color.CYAN);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(26, 223, 111, 42);
		getContentPane().add(lblNewLabel_3);
		
		JButton buy = new JButton("BUY");
		buy.setBackground(Color.CYAN);
		buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buy.buyingpage purchase = new buy.buyingpage();
				purchase.setVisible(true);
				dispose();	
			}
		});
        buy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buy.setBounds(25, 292, 123, 43);
		getContentPane().add(buy);

	}
}