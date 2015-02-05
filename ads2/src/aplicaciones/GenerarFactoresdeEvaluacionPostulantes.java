package aplicaciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;

public class GenerarFactoresdeEvaluacionPostulantes extends JFrame {

	private JPanel contentPane;
	
	private DefaultTableModel df;
	private JTable tb;
	private JScrollPane scp;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarFactoresdeEvaluacionPostulantes frame = new GenerarFactoresdeEvaluacionPostulantes();
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
	public GenerarFactoresdeEvaluacionPostulantes() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setResizable(false);
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGenerarFactoresDe = new JLabel("Generar Factores de Evaluaci\u00F3n");
		lblGenerarFactoresDe.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblGenerarFactoresDe.setBounds(76, 0, 471, 35);
		contentPane.add(lblGenerarFactoresDe);
		
		df = new DefaultTableModel();
	 	
		df.addColumn("Curso");
		df.addColumn("Factor");
		df.addColumn("Peso");
		df.addColumn("Escala puntaje");
		df.addColumn("Año");
		
		tb= new JTable(df);	

		scp= new JScrollPane(tb);
		scp.setBounds(12,369,589,84);
		contentPane.add(scp);
		
		JLabel lblCurso = new JLabel("curso");
		lblCurso.setBounds(12, 78, 55, 16);
		contentPane.add(lblCurso);
		
		final JComboBox comboBox_1 = new JComboBox();
		
		comboBox_1.addItem("Algoritmos Computacionales");
		comboBox_1.addItem("Matematica I");
		comboBox_1.addItem("Lenguaje Empresarial");
		comboBox_1.addItem("Historia del Arte");
		comboBox_1.addItem("Matematica I");

		comboBox_1.setToolTipText("Historia del Arte se evalua por tiempo de trabajo Y Algoritmos Computacionales se evalua por tiempo de trabajo Y Matematica I se evalua por tiempo de especialidad");
		
		comboBox_1.setBounds(53, 73, 198, 25);
		contentPane.add(comboBox_1);
		
		JLabel lblEscalaDePuntaje = new JLabel("escala del puntaje");
		lblEscalaDePuntaje.setBounds(256, 78, 103, 16);
		contentPane.add(lblEscalaDePuntaje);
		
		final JComboBox comboBox_3 = new JComboBox();
		
		//comboBox_3.addItem("20");
		//comboBox_3.addItem("30");
		//comboBox_3.addItem("50");
		//comboBox_3.addItem("70");
		//comboBox_3.addItem("80");
		comboBox_3.addItem("100"); 
		
		comboBox_3.setBounds(371, 71, 55, 23);
		contentPane.add(comboBox_3);
		
		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.setBounds(12, 458, 74, 22);
		contentPane.add(btnEliminar);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(204, 483, 74, 22);
		contentPane.add(btnGrabar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(285, 483, 74, 22);
		contentPane.add(btnCancelar);
		
		JLabel lblCodigo = new JLabel("codigo");
		lblCodigo.setBounds(12, 43, 55, 16);
		contentPane.add(lblCodigo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(53, 38, 103, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label = new JLabel("(%)");
		label.setBounds(460, 74, 33, 16);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Factores de Evaluacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 106, 589, 251);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAos = new JLabel("experiencia en a\u00F1os");
		lblAos.setBounds(12, 133, 122, 16);
		panel.add(lblAos);
		
		JLabel lblCentroDeEstudios = new JLabel("Centro de estudios");
		lblCentroDeEstudios.setBounds(12, 28, 134, 16);
		panel.add(lblCentroDeEstudios);
		
		JLabel lblEspecialidad = new JLabel("especialidad");
		lblEspecialidad.setBounds(12, 62, 103, 16);
		panel.add(lblEspecialidad);
		
		JLabel lblGradoObtenido = new JLabel("grado obtenido");
		lblGradoObtenido.setBounds(12, 96, 103, 16);
		panel.add(lblGradoObtenido);
		
		JComboBox comboBox_7 = new JComboBox();
	
		comboBox_7.setBounds(122, 92, 122, 25);
		panel.add(comboBox_7);
		
		JComboBox comboBox_6 = new JComboBox();
	
		comboBox_6.setBounds(122, 58, 122, 25);
		panel.add(comboBox_6);
		
		JComboBox comboBox_5 = new JComboBox();
	
		comboBox_5.setBounds(122, 24, 122, 25);
		panel.add(comboBox_5);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(164, 130, 80, 23);
		panel.add(comboBox_4);
		comboBox_4.addItem("1");
		comboBox_4.addItem("2");
		comboBox_4.addItem("3");
		comboBox_4.addItem("5");
		comboBox_4.addItem("7");
		comboBox_4.addItem("8");
		
		JCheckBox chckbxSi = new JCheckBox("si");
		chckbxSi.setSelected(true);
		chckbxSi.setBounds(380, 24, 48, 24);
		panel.add(chckbxSi);
		
		JCheckBox chckbxSi_1 = new JCheckBox("si");
		chckbxSi_1.setSelected(true);
		chckbxSi_1.setBounds(380, 58, 48, 24);
		panel.add(chckbxSi_1);
		
		JCheckBox chckbxSi_2 = new JCheckBox("si");
		chckbxSi_2.setSelected(true);
		chckbxSi_2.setBounds(380, 92, 48, 24);
		panel.add(chckbxSi_2);
		
		JCheckBox chckbxSi_3 = new JCheckBox("si");
		chckbxSi_3.setSelected(true);
		chckbxSi_3.setBounds(380, 129, 47, 24);
		panel.add(chckbxSi_3);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.addItem("10");
		comboBox.addItem("15");
		comboBox.addItem("20");
		comboBox.addItem("25");
		comboBox.addItem("30");
		comboBox.addItem("35");
		comboBox.addItem("40");
		comboBox.addItem("45");
		comboBox.addItem("50");
		comboBox.addItem("55");
		comboBox.addItem("60");
		comboBox.addItem("65");
		comboBox.addItem("70");
		comboBox.addItem("75");
		comboBox.addItem("80");
		comboBox.addItem("85");
		comboBox.addItem("90");
		comboBox.addItem("95");
		comboBox.addItem("100");
		
		comboBox.setBounds(317, 24, 55, 22);
		panel.add(comboBox);
		
		JLabel label_1 = new JLabel("peso(%)");
		label_1.setBounds(253, 27, 55, 16);
		panel.add(label_1);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(317, 60, 55, 22);
		panel.add(comboBox_8);
		
		comboBox_8.addItem("10");
		comboBox_8.addItem("15");
		comboBox_8.addItem("20");
		comboBox_8.addItem("25");
		comboBox_8.addItem("30");
		comboBox_8.addItem("35");
		comboBox_8.addItem("40");
		comboBox_8.addItem("45");
		comboBox_8.addItem("50");
		comboBox_8.addItem("55");
		comboBox_8.addItem("60");
		comboBox_8.addItem("65");
		comboBox_8.addItem("70");
		comboBox_8.addItem("75");
		comboBox_8.addItem("80");
		comboBox_8.addItem("85");
		comboBox_8.addItem("90");
		comboBox_8.addItem("95");
		comboBox_8.addItem("100");
		
		JLabel label_2 = new JLabel("peso(%)");
		label_2.setBounds(253, 64, 55, 16);
		panel.add(label_2);
		
		JComboBox comboBox_9 = new JComboBox();
		
		comboBox_9.addItem("10");
		comboBox_9.addItem("15");
		comboBox_9.addItem("20");
		comboBox_9.addItem("25");
		comboBox_9.addItem("30");
		comboBox_9.addItem("35");
		comboBox_9.addItem("40");
		comboBox_9.addItem("45");
		comboBox_9.addItem("50");
		comboBox_9.addItem("55");
		comboBox_9.addItem("60");
		comboBox_9.addItem("65");
		comboBox_9.addItem("70");
		comboBox_9.addItem("75");
		comboBox_9.addItem("80");
		comboBox_9.addItem("85");
		comboBox_9.addItem("90");
		comboBox_9.addItem("95");
		comboBox_9.addItem("100");
		
		comboBox_9.setBounds(317, 94, 55, 22);
		panel.add(comboBox_9);
		
		JLabel label_3 = new JLabel("peso(%)");
		label_3.setBounds(253, 98, 55, 16);
		panel.add(label_3);
		
		JComboBox comboBox_10 = new JComboBox();
		
		comboBox_10.addItem("10");
		comboBox_10.addItem("15");
		comboBox_10.addItem("20");
		comboBox_10.addItem("25");
		comboBox_10.addItem("30");
		comboBox_10.addItem("35");
		comboBox_10.addItem("40");
		comboBox_10.addItem("45");
		comboBox_10.addItem("50");
		comboBox_10.addItem("55");
		comboBox_10.addItem("60");
		comboBox_10.addItem("65");
		comboBox_10.addItem("70");
		comboBox_10.addItem("75");
		comboBox_10.addItem("80");
		comboBox_10.addItem("85");
		comboBox_10.addItem("90");
		comboBox_10.addItem("95");
		comboBox_10.addItem("100");
		
		comboBox_10.setBounds(317, 129, 55, 22);
		panel.add(comboBox_10);
		
		JLabel label_4 = new JLabel("peso(%)");
		label_4.setBounds(253, 132, 55, 16);
		panel.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(163, 193, 45, 21);
		panel.add(textField_2);
		textField_2.setText("60");
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 163, 45, 20);
		panel.add(textField_1);
		textField_1.setText("20");
		textField_1.setColumns(10);
		
		JLabel lblPuntajeMaximo = new JLabel("valor de c/d factor :");
		lblPuntajeMaximo.setBounds(12, 165, 155, 16);
		panel.add(lblPuntajeMaximo);
		
		JLabel lblPuntajeMinimoReq = new JLabel("puntaje minimo requerido");
		lblPuntajeMinimoReq.setBounds(12, 195, 150, 16);
		panel.add(lblPuntajeMinimoReq);
		
		textField = new JTextField();
		textField.setBounds(503, 189, 74, 25);
		panel.add(textField);
		textField.setText("2015-01-05");
		textField.setColumns(10);
		
		JLabel lblFechaCreacion = new JLabel("Fecha creacion");
		lblFechaCreacion.setBounds(412, 193, 93, 16);
		panel.add(lblFechaCreacion);
		
		JButton btnAgregar = new JButton("agregar");
		btnAgregar.setBounds(12, 222, 74, 22);
		panel.add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//df.addRow(new Object[]{comboBox.getSelectedItem(),comboBox_1.getSelectedItem(),comboBox_2.getSelectedItem(),comboBox_3.getSelectedItem().toString(),textField.getText()});
				
			}
		});
		
		
		
	}
}
