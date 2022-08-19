package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JSlider;
import javax.swing.ImageIcon;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 379);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 51));
		panel.setBounds(0, 0, 599, 121);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("App Projects");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BINHO\\Documents\\Nicholas\\JAVA\\projetos2\\mavenquickstart\\src\\main\\resources\\tick.png"));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 36));
		lblNewLabel.setBounds(10, 11, 579, 64);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel);
		
		JLabel lblAnoteTudoE = new JLabel("Anote tudo e não esqueça de nada");
		lblAnoteTudoE.setForeground(Color.WHITE);
		lblAnoteTudoE.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblAnoteTudoE.setVerticalAlignment(SwingConstants.TOP);
		lblAnoteTudoE.setBounds(10, 86, 579, 16);
		panel.add(lblAnoteTudoE);
	}
}
