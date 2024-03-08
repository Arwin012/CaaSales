package internalframes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class BMW extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMW frame = new BMW();
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
	public BMW() {
		getContentPane().setForeground(Color.CYAN);
		getContentPane().setBackground(Color.BLACK);
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);
		setTitle("BMW E9");
		setBounds(100, 100, 566, 403);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Arwin\\Pictures\\Saved Pictures\\bmw.jpg"));
		lblNewLabel.setBounds(31, 24, 238, 191);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price: $70000");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(43, 229, 174, 39);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(43, 282, 85, 21);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(Color.CYAN);
		textField.setBounds(279, 0, 3, 374);
		getContentPane().add(textField);
		textField.setColumns(10);

	}
}