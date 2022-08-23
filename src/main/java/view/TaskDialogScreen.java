package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class TaskDialogScreen extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TaskDialogScreen dialog = new TaskDialogScreen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TaskDialogScreen() {
		setBounds(100, 100, 450, 504);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 102, 51));
			panel.setBounds(0, 0, 434, 60);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Tarefas");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setBounds(0, 11, 69, 25);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\BINHO\\Documents\\Nicholas\\JAVA\\projetos2\\mavenquickstart\\src\\main\\resources\\check.png"));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(388, 11, 46, 38);
				panel.add(lblNewLabel);
			}
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nome");
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(10, 71, 414, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			textField.setBounds(10, 96, 414, 25);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Descrição");
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(10, 132, 414, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JTextArea textArea = new JTextArea();
			textArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			textArea.setBounds(10, 157, 414, 83);
			contentPanel.add(textArea);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Prazo");
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(10, 242, 414, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			textField_1.setColumns(10);
			textField_1.setBounds(10, 267, 414, 25);
			contentPanel.add(textField_1);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Notas");
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(10, 303, 414, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JTextArea textArea = new JTextArea();
			textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			textArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			textArea.setBounds(10, 330, 414, 91);
			contentPanel.add(textArea);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
