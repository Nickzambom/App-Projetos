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
import java.awt.List;
import java.awt.ComponentOrientation;
import javax.swing.AbstractListModel;
import javax.swing.JTabbedPane;
import javax.swing.DebugGraphics;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.Component;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=210,-31
	 */
	private final JPanel panel = new JPanel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new MainScreen();
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane);
		
		JPanel PanelEmptyList_1 = new JPanel();
		PanelEmptyList_1.setLayout(null);
		PanelEmptyList_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, PanelEmptyList_1, null);
		
		JLabel LabelEmptyTitle_1 = new JLabel("Nenhuma tarefa por aqui");
		LabelEmptyTitle_1.setHorizontalTextPosition(SwingConstants.LEADING);
		LabelEmptyTitle_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelEmptyTitle_1.setFont(new Font("Dialog", Font.BOLD, 14));
		LabelEmptyTitle_1.setBounds(0, 175, 594, 14);
		PanelEmptyList_1.add(LabelEmptyTitle_1);
		
		JLabel LabelEmptyListSubtitle_1 = new JLabel("Clique no botão \" + \" para adicionar tarefas");
		LabelEmptyListSubtitle_1.setHorizontalTextPosition(SwingConstants.LEADING);
		LabelEmptyListSubtitle_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelEmptyListSubtitle_1.setFont(new Font("Dialog", Font.BOLD, 12));
		LabelEmptyListSubtitle_1.setBounds(0, 200, 594, 14);
		PanelEmptyList_1.add(LabelEmptyListSubtitle_1);
		
		JLabel LabelEmptyListIcon_1 = new JLabel("");
		LabelEmptyListIcon_1.setVerticalAlignment(SwingConstants.BOTTOM);
		LabelEmptyListIcon_1.setHorizontalTextPosition(SwingConstants.LEADING);
		LabelEmptyListIcon_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelEmptyListIcon_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LabelEmptyListIcon_1.setBounds(0, 42, 594, 128);
		PanelEmptyList_1.add(LabelEmptyListIcon_1);
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

		JPanel PanelToolBar = new JPanel();
		PanelToolBar.setBounds(0, 0, 784, 121);
		PanelToolBar.setBackground(new Color(0, 102, 51));
		contentPane.add(PanelToolBar);
		PanelToolBar.setLayout(null);

		JLabel LabelToolBarTitle = new JLabel("App Projects");
		LabelToolBarTitle.setBounds(10, 11, 775, 64);
		LabelToolBarTitle.setIcon(new ImageIcon(
				"C:\\Users\\BINHO\\Documents\\Nicholas\\JAVA\\projetos2\\mavenquickstart\\src\\main\\resources\\tick.png"));
		LabelToolBarTitle.setForeground(Color.WHITE);
		LabelToolBarTitle.setFont(new Font("Segoe UI", Font.BOLD, 36));
		LabelToolBarTitle.setVerticalAlignment(SwingConstants.TOP);
		PanelToolBar.add(LabelToolBarTitle);

		JLabel LabelToolBarSubtitle = new JLabel("Anote tudo e não esqueça de nada");
		LabelToolBarSubtitle.setBounds(10, 86, 775, 16);
		LabelToolBarSubtitle.setForeground(Color.WHITE);
		LabelToolBarSubtitle.setFont(new Font("Segoe UI", Font.BOLD, 12));
		LabelToolBarSubtitle.setVerticalAlignment(SwingConstants.TOP);
		PanelToolBar.add(LabelToolBarSubtitle);

		JPanel ProjectList = new JPanel();
		ProjectList.setBounds(10, 177, 155, 373);
		ProjectList.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		ProjectList.setBackground(Color.WHITE);
		contentPane.add(ProjectList);
		ProjectList.setLayout(null);
		
		JList ListProjects = new JList();
		ListProjects.setFixedCellHeight(50);
		ListProjects.setVisibleRowCount(10);
		ListProjects.setModel(new AbstractListModel() {
			String[] values = new String[] {"tarefa 1", "tarefa 2", "tarefa 3", "tarefa 4"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		ListProjects.setToolTipText("");
		ListProjects.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		ListProjects.setBackground(Color.WHITE);
		ListProjects.setSelectionBackground(new Color(0, 102, 51));
		ListProjects.setName("");
		ListProjects.setForeground(Color.BLACK);
		ListProjects.setFont(new Font("Segoe UI", Font.BOLD, 14));
		ListProjects.setBounds(10, 11, 135, 351);
		ProjectList.add(ListProjects);

		JPanel PanelProject = new JPanel();
		PanelProject.setBounds(10, 127, 155, 47);
		PanelProject.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		PanelProject.setBackground(Color.WHITE);
		contentPane.add(PanelProject);
		PanelProject.setLayout(null);

		JLabel LabelProjectTitle = new JLabel("  Projetos");
		LabelProjectTitle.setForeground(new Color(0, 102, 51));
		LabelProjectTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
		LabelProjectTitle.setBounds(0, 11, 87, 30);
		PanelProject.add(LabelProjectTitle);

		JLabel ProjectAdd = new JLabel("");
		ProjectAdd.setIcon(new ImageIcon(
				"C:\\Users\\BINHO\\Documents\\Nicholas\\JAVA\\projetos2\\mavenquickstart\\src\\main\\resources\\add.png"));
		ProjectAdd.setBounds(113, 11, 32, 30);
		PanelProject.add(ProjectAdd);

		JPanel PanelTasks = new JPanel();
		PanelTasks.setBounds(175, 127, 599, 47);
		PanelTasks.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		PanelTasks.setBackground(Color.WHITE);
		contentPane.add(PanelTasks);
		PanelTasks.setLayout(null);

		JLabel LabelTasksTitle = new JLabel("  Tarefas");
		LabelTasksTitle.setForeground(new Color(0, 102, 51));
		LabelTasksTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
		LabelTasksTitle.setBounds(0, 11, 78, 30);
		PanelTasks.add(LabelTasksTitle);

		JLabel TaskAdd = new JLabel("");
		TaskAdd.setIcon(new ImageIcon(
				"C:\\Users\\BINHO\\Documents\\Nicholas\\JAVA\\projetos2\\mavenquickstart\\src\\main\\resources\\add.png"));
		TaskAdd.setBounds(564, 11, 32, 30);
		PanelTasks.add(TaskAdd);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(175, 177, 599, 373);
		panel_1_1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_1_1_1.setBackground(Color.WHITE);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		table = new JTable();
		table.setRowHeight(20);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		table.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		table.setEditingRow(1);
		table.setEditingColumn(1);
		table.setShowVerticalLines(false);
		table.setName("Table");
		table.setAutoCreateRowSorter(true);
		table.setForeground(new Color(0, 0, 0));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setSelectionBackground(new Color(0, 153, 102));
		table.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		table.setToolTipText("");
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nome", "Descri\u00E7\u00E3o", "Prazo", Boolean.TRUE},
				{"Nome", "Descri\u00E7\u00E3o", "Prazo", Boolean.TRUE},
				{"Nome", "Descri\u00E7\u00E3o", "Prazo", Boolean.TRUE},
			},
			new String[] {
				"Nome", "Descri\u00E7\u00E3o", "Prazo", "Tarefa Concluida"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(10, 11, 579, 362);
		panel_1_1_1.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(10, 11, 579, 362);
		panel_1_1_1.add(scrollBar);
	}
}
