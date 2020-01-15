package main;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import javax.swing.JTextArea;

public class Give extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	protected String comando;

	/**
	 * Create the panel.
	 */
	public Give() {
		
		JButton btnSeccionarItem = new JButton("Seccionar Item");
		JButton btnSeleccionarItem = new JButton("Seleccionar Item");
		JButton button = new JButton("");
		
		DefaultComboBoxModel g = new DefaultComboBoxModel(new String[] {"+/-", "+/- % (Adictivo)", "+/- % (Multiplicativo)"});
		
		JComboBox comboBox = new JComboBox();
		JComboBox comboBox_1 = new JComboBox();
		JComboBox comboBox_2 = new JComboBox();
		JComboBox comboBox_3 = new JComboBox();
		JComboBox comboBox_4 = new JComboBox();
		JComboBox comboBox_5 = new JComboBox();
		
		JLabel lblGive = new JLabel("Give");
		JLabel lblDurabilidad = new JLabel("Durabilidad:");
		JLabel lblDao = new JLabel("Da\u00F1o:");
		JLabel lblCostoDeReparacin = new JLabel("Costo de Reparaci\u00F3n:");
		JLabel lblNombre = new JLabel("Nombre:");
		JLabel lblDes = new JLabel("Descripci\u00F3n 1:");
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n 2:");

		JSpinner spinner = new JSpinner();
		JSpinner spinner_1 = new JSpinner();
		JSpinner spinner_2 = new JSpinner();
		JSpinner spinner_3 = new JSpinner();
		JSpinner spinner_4 = new JSpinner();
		JSpinner spinner_5 = new JSpinner();
		JSpinner spinner_6 = new JSpinner();
		JSpinner spinner_7 = new JSpinner();
		JSpinner spinner_8 = new JSpinner();
		
		JToggleButton btnCanPlace = new JToggleButton("Can Place On");
		JToggleButton tglbtnCanDestroy_1 = new JToggleButton("Can Destroy");
		JToggleButton btnEliminarEncantamiento = new JToggleButton("A\u00F1adir");
		JToggleButton tglbtnEncantamientos = new JToggleButton("Encantamientos");
		JToggleButton tglbtnModificadores = new JToggleButton("Modificadores");
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Irrompible");
		JToggleButton chckbxFollowRange = new JToggleButton("Follow Range:");
		JToggleButton chckbxKnockbackResistence = new JToggleButton("Knockback Resistance:");
		JToggleButton chckbxMovemtSpeed = new JToggleButton("Movement Speed:");
		JToggleButton lblVida = new JToggleButton("Max Health:");
		JToggleButton chckbxAttackDamage = new JToggleButton("Attack Damage:");
		JToggleButton tglbtnCanDestroy = new JToggleButton("Can Destroy:");
		JToggleButton tglbtnCanPlaceOn = new JToggleButton("Can Place On:");
		
		JTextArea txtriijukiio = new JTextArea();
		JCheckBox chckbxIrompible = new JCheckBox("Irompible");
		
		setBackground(new Color(20, 220, 100));
		setLayout(new BorderLayout(0, 0));
		
		lblGive.setHorizontalAlignment(SwingConstants.CENTER);
		lblGive.setFont(new Font("Consolas", Font.BOLD, 22));
		add(lblGive, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(34, 139, 34), 2, true), "Seleciona un item", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(34, 139, 34), 2, true), "Configuraci\u00F3n", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(34, 139, 34), 2, true), "Atributos", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		
		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(34, 139, 34), 2, true), "Encantamientos", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(51, 51, 51)));
		
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(34, 139, 34), 2, true), "Flags", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setBorder(new TitledBorder(new LineBorder(new Color(34, 139, 34), 2, true), "Comando", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(51, 51, 51)));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 582, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addComponent(txtriijukiio, GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addComponent(txtriijukiio, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
		);
		
		comboBox.setModel(g);
		txtriijukiio.setText(comando);
		txtriijukiio.setLineWrap(true);
		txtriijukiio.setEditable(false);
		panel_6.setLayout(gl_panel_6);
		
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 5));
		panel_5.add(btnCanPlace);
		panel_5.add(tglbtnCanDestroy_1);
		panel_5.add(tglbtnNewToggleButton);
		panel_5.add(tglbtnModificadores);
		panel_5.add(tglbtnEncantamientos);
		
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(spinner_8, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEliminarEncantamiento, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEliminarEncantamiento)
						.addComponent(spinner_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		comboBox_1.setModel(g);
		comboBox_2.setModel(g);
		comboBox_3.setModel(g);
		comboBox_4.setModel(g);
		
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(chckbxKnockbackResistence, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(chckbxFollowRange, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(chckbxAttackDamage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblVida, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(chckbxMovemtSpeed, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(9)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(spinner_4, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addComponent(spinner_5)
						.addComponent(spinner_6)
						.addComponent(spinner_7)
						.addComponent(spinner_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
							.addComponent(comboBox_4, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_1, Alignment.TRAILING, 0, 178, Short.MAX_VALUE))
						.addComponent(comboBox, 0, 191, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxAttackDamage)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(spinner_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxFollowRange))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxKnockbackResistence))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblVida))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxMovemtSpeed))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_2.setColumns(10);
		
		chckbxIrompible.setOpaque(false);
		spinner.setModel(new SpinnerNumberModel(0, -32000, 32000, 1));
		tglbtnCanPlaceOn.setHorizontalAlignment(SwingConstants.LEFT);
		btnSeleccionarItem.setOpaque(false);
		btnSeccionarItem.setOpaque(false);
		tglbtnCanDestroy.setHorizontalAlignment(SwingConstants.LEFT);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblDes)
								.addComponent(lblDescripcin)
								.addComponent(lblNombre)
								.addComponent(lblDurabilidad)
								.addComponent(lblDao)
								.addComponent(lblCostoDeReparacin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(tglbtnCanDestroy, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(tglbtnCanPlaceOn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(9)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(spinner, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
								.addComponent(textField, 317, 392, Short.MAX_VALUE)
								.addComponent(textField_2, 317, 392, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
								.addComponent(spinner_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
								.addComponent(spinner_3, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
								.addComponent(btnSeleccionarItem, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
								.addComponent(btnSeccionarItem, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)))
						.addComponent(chckbxIrompible))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDes))
					.addGap(9)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDescripcin))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDao))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDurabilidad))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCostoDeReparacin))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(tglbtnCanPlaceOn)
						.addComponent(btnSeleccionarItem))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSeccionarItem)
						.addComponent(tglbtnCanDestroy))
					.addGap(8)
					.addComponent(chckbxIrompible)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);


		button.setOpaque(false);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(button, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(button, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);

	}
}