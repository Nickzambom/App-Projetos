package view;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

public final class OtherComponents {
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source comp PanelToolBar
	 * @wbp.factory.parameter.source comp_1 ProjectList
	 * @wbp.factory.parameter.source comp_2 PanelProject
	 * @wbp.factory.parameter.source comp_3 PanelTasks
	 * @wbp.factory.parameter.source comp_4 panel_1_1_1
	 */
	public static JPanel createJPanel(Component comp, Component comp_1, Component comp_2, Component comp_3, Component comp_4) {
		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(800, 600));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		panel.add(comp);
		panel.add(comp_1);
		panel.add(comp_2);
		panel.add(comp_3);
		panel.add(comp_4);
		return panel;
	}
}