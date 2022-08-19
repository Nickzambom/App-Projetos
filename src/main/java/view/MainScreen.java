package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Dimension;

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
		setResizable(false);
		setMinimumSize(new Dimension(800, 600));
		setMaximumSize(new Dimension(1380, 980));
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 501);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(800, 600));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 121);
		panel.setBackground(new Color(0, 102, 51));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("App Projects");
		lblNewLabel.setBounds(10, 11, 775, 64);
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\BINHO\\Documents\\Nicholas\\JAVA\\projetos2\\mavenquickstart\\src\\main\\resources\\tick.png"));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 36));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel);

		JLabel lblAnoteTudoE = new JLabel("Anote tudo e não esqueça de nada");
		lblAnoteTudoE.setBounds(10, 86, 775, 16);
		lblAnoteTudoE.setForeground(Color.WHITE);
		lblAnoteTudoE.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblAnoteTudoE.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblAnoteTudoE);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 177, 148, 373);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JList list = new JList();
		list.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		list.setToolTipText("");
		list.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		list.setBounds(10, 204, 128, -189);
		panel_2.add(list);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 127, 148, 47);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("  Projetos");
		lblNewLabel_1.setForeground(new Color(0, 102, 51));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1.setBounds(0, 11, 87, 30);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(
				"C:\\Users\\BINHO\\Documents\\Nicholas\\JAVA\\projetos2\\mavenquickstart\\src\\main\\resources\\add.png"));
		lblNewLabel_2_1_1.setBounds(101, 11, 32, 30);
		panel_1.add(lblNewLabel_2_1_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(160, 127, 614, 47);
		panel_1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_1_1.setBackground(Color.WHITE);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("  Tarefas");
		lblNewLabel_1_1.setForeground(new Color(0, 102, 51));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(0, 11, 78, 30);
		panel_1_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(
				"C:\\Users\\BINHO\\Documents\\Nicholas\\JAVA\\projetos2\\mavenquickstart\\src\\main\\resources\\add.png"));
		lblNewLabel_2_1.setBounds(572, 11, 32, 30);
		panel_1_1.add(lblNewLabel_2_1);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(160, 177, 614, 373);
		panel_1_1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_1_1_1.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 11, 594, 351);
		panel_1_1_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Nenhuma tarefa por aqui");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setBounds(0, 175, 594, 14);
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Clique no botão \" + \" para adicionar tarefas");
		lblNewLabel_3_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(0, 200, 594, 14);
		panel_3.add(lblNewLabel_3_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 42, 594, 128);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\BINHO\\Documents\\Nicholas\\JAVA\\projetos2\\mavenquickstart\\src\\main\\resources\\lists.png"));
		panel_3.add(lblNewLabel_2);
	}
}
