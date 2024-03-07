package internalframes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class BMW extends JInternalFrame {

	private static final long serialVersionUID = 1L;

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
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(43, 229, 174, 39);
		getContentPane().add(lblNewLabel_1);

	}
}
