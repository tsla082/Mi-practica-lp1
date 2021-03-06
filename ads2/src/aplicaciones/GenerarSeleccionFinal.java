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

public class GenerarSeleccionFinal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	private DefaultTableModel df;
	private JTable tb;
	private JScrollPane scp;
	
	private DefaultTableModel df1;
	private JTable tb1;
	private JScrollPane scp1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarSeleccionFinal frame = new GenerarSeleccionFinal();
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
	public GenerarSeleccionFinal() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setResizable(false);
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGenerarSeleccionDe = new JLabel("Generar Seleccion de Aptos");
		lblGenerarSeleccionDe.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblGenerarSeleccionDe.setBounds(96, 12, 416, 47);
		contentPane.add(lblGenerarSeleccionDe);
		
		JLabel lblCodigo = new JLabel("codigo");
		lblCodigo.setBounds(30, 88, 55, 16);
		contentPane.add(lblCodigo);
		
		JLabel lblAo = new JLabel("a\u00F1o");
		lblAo.setBounds(30, 135, 55, 16);
		contentPane.add(lblAo);
		
		JLabel lblCurso = new JLabel("curso");
		lblCurso.setBounds(30, 179, 55, 16);
		contentPane.add(lblCurso);
		
		JLabel lblEncargado = new JLabel("encargado");
		lblEncargado.setBounds(331, 88, 111, 16);
		contentPane.add(lblEncargado);
		
		JTextField textField_ = new JTextField();
		textField_.setBounds(81, 130, 115, 27);
		contentPane.add(textField_);
		textField_.setColumns(10);
		
		/*
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("2015 - I");
		comboBox.addItem("2015 - II");
		comboBox.addItem("2016 - I");
		comboBox.addItem("2015 - II");
		comboBox.setBounds(81, 130, 115, 27);
		contentPane.add(comboBox);
		*/
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("Matematica I");
		comboBox_1.addItem("Introduccion a la Algoritmia");
		comboBox_1.addItem("Lenguaje Empresarial");
		comboBox_1.addItem("Sistemas Operativos");
		comboBox_1.setBounds(81, 174, 192, 27);
		contentPane.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(81, 83, 152, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(460, 85, 137, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAptos = new JButton("Listar");
		btnAptos.setBounds(492, 411, 105, 27);
		btnAptos.setToolTipText("Este boton listara a los postulantes.");
		contentPane.add(btnAptos);
		
		JButton btnFactores = new JButton("Factores");
		btnFactores.setBounds(492, 222, 105, 27);
		contentPane.add(btnFactores);
		
		JLabel lblAptos = new JLabel("Aptos :");
		lblAptos.setBounds(12, 227, 87, 16);
		contentPane.add(lblAptos);
		
		df = new DefaultTableModel();
	 	
		df.addColumn("Codigo");
		df.addColumn("Nombre");
		df.addColumn("Puntaje");
		df.addColumn("Evaluado");
		
		tb= new JTable(df);	

		scp= new JScrollPane(tb);
		scp.setBounds(12,261,585,152);
		contentPane.add(scp);
		
		JButton btnEliminar = new JButton("eliminar seleccionado");
		btnEliminar.setBounds(12, 604, 137, 22);
		contentPane.add(btnEliminar);
		
		JLabel lblSeleccionados = new JLabel("Seleccionados :");
		lblSeleccionados.setBounds(12, 449, 91, 16);
		contentPane.add(lblSeleccionados);
		
		df1 = new DefaultTableModel();
	 	
		df1.addColumn("Codigo Postulante");
		df1.addColumn("Nombre");
		df1.addColumn("Puntaje");
		
		tb1= new JTable(df1);	

		scp1= new JScrollPane(tb1);
		scp1.setBounds(12,477,585,129);
		contentPane.add(scp1);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(182, 634, 74, 22);
		contentPane.add(btnGrabar);
		
		JButton btnReporte = new JButton("Reporte");
		btnReporte.setBounds(267, 634, 74, 22);
		contentPane.add(btnReporte);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(352, 634, 74, 22);
		contentPane.add(btnSalir);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(523, 604, 74, 22);
		contentPane.add(btnBorrar);
		
		JLabel lblVacantes = new JLabel("vacantes");
		lblVacantes.setBounds(331, 136, 69, 14);
		contentPane.add(lblVacantes);
		
		textField_2 = new JTextField();
		textField_2.setBounds(460, 133, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSelecionar = new JButton("selecionar");
		btnSelecionar.setBounds(12, 412, 91, 25);
		contentPane.add(btnSelecionar);
		
		
		
		
		
	}
}
