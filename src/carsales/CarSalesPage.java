package carsales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CarSalesPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarSalesPage frame = new CarSalesPage();
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
	public CarSalesPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 592);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktop = new JDesktopPane();
		desktop.setBackground(Color.GRAY);
		desktop.setBounds(337, 89, 616, 456);
		contentPane.add(desktop);
		
		JLabel lblNewLabel = new JLabel("Select A Car");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(310, 19, 264, 63);
		contentPane.add(lblNewLabel);
		
		JButton nissan = new JButton("");
		nissan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				desktop.removeAll();
				internalframes.nissan r34 = new internalframes.nissan();
				desktop.add(r34).setVisible(true);
				
				
			}
		});
		nissan.setIcon(new ImageIcon("C:\\Users\\Arwin\\Desktop\\arwin\\carsales\\src\\nissan.jpg"));
		nissan.setBounds(42, 280, 70, 64);
		contentPane.add(nissan);
		
		JLabel lblNewLabel_1 = new JLabel("Nissan");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(50, 214, 52, 23);
		contentPane.add(lblNewLabel_1);
		
		JButton supra = new JButton("");
		supra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktop.removeAll();
				internalframes.toyota mk4 = new internalframes.toyota();
				desktop.add(mk4).setVisible(true);
			}
		});
		supra.setIcon(new ImageIcon("C:\\Users\\Arwin\\Pictures\\Saved Pictures\\toyotalogo.jpg"));
		supra.setBounds(166, 139, 70, 63);
		contentPane.add(supra);
		
		JLabel lblNewLabel_2 = new JLabel("Toyota");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(183, 219, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JButton mustang = new JButton("");
		mustang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktop.removeAll();
				internalframes.mustang ford = new internalframes.mustang();
				desktop.add(ford).setVisible(true);
				
			}
		});
		mustang.setIcon(new ImageIcon("C:\\Users\\Arwin\\Pictures\\Saved Pictures\\mustanglogo.jpg"));
		mustang.setBounds(42, 139, 74, 65);
		contentPane.add(mustang);
		
		JLabel lblNewLabel_3 = new JLabel("Mustang");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(50, 354, 62, 22);
		contentPane.add(lblNewLabel_3);
		
		JButton bmw = new JButton("");
		bmw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktop.removeAll();
				internalframes.BMW old = new internalframes.BMW();
				desktop.add(old).setVisible(true);
			}
		});
		bmw.setHorizontalAlignment(SwingConstants.LEFT);
		bmw.setIcon(null);
		bmw.setBounds(166, 280, 70, 64);
		contentPane.add(bmw);
		
		JLabel lblNewLabel_4 = new JLabel("BMW");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(183, 359, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JButton nissan_1 = new JButton("");
		nissan_1.setBounds(42, 413, 70, 64);
		contentPane.add(nissan_1);
		
		JButton nissan_2 = new JButton("");
		nissan_2.setBounds(166, 413, 70, 64);
		contentPane.add(nissan_2);
	}
}