package internalframes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class toyota extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					toyota frame = new toyota();
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
	public toyota() {
		setTitle("Toyota Supra MK4");
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Arwin\\Pictures\\Saved Pictures\\toyota.jpg"));
		lblNewLabel.setBounds(51, 28, 235, 146);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price: $50000");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(51, 184, 235, 35);
		getContentPane().add(lblNewLabel_1);

	}

}
