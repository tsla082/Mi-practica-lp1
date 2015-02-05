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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;

public class IngresarCursos extends JFrame {

	private JPanel contentPane;
	
	private DefaultTableModel df;
	private JTable tb;
	private JScrollPane scp;
	
	private DefaultTableModel df1;
	private JTable tb1;
	private JScrollPane scp1;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresarCursos frame = new IngresarCursos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public IngresarCursos() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setResizable(false);
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGenerarCurso = new JLabel("Generar Curso");
		lblGenerarCurso.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblGenerarCurso.setBounds(194, 12, 214, 33);
		contentPane.add(lblGenerarCurso);
		
		JLabel lblCodigoCurso = new JLabel("codigo curso");
		lblCodigoCurso.setBounds(10, 60, 95, 14);
		contentPane.add(lblCodigoCurso);
		
		JLabel lblCurso = new JLabel("curso");
		lblCurso.setBounds(10, 92, 46, 14);
		contentPane.add(lblCurso);
		
		JLabel lblMdulo = new JLabel("m\u00F3dulo");
		lblMdulo.setBounds(10, 125, 46, 14);
		contentPane.add(lblMdulo);
		
		JLabel lblCreditos = new JLabel("creditos");
		lblCreditos.setBounds(10, 160, 46, 14);
		contentPane.add(lblCreditos);
		
		JLabel lblRequisitos = new JLabel("requisitos");
		lblRequisitos.setBounds(12, 195, 68, 14);
		contentPane.add(lblRequisitos);
		
		JButton btnVerCursos = new JButton("Ver cursos");
		btnVerCursos.setBounds(392, 56, 89, 23);
		contentPane.add(btnVerCursos);
		
		JLabel lblCodigoSilabo = new JLabel("codigo silabo");
		lblCodigoSilabo.setBounds(220, 92, 95, 14);
		contentPane.add(lblCodigoSilabo);
		
		JButton btnBuscar = new JButton("buscar");
		btnBuscar.setBounds(392, 88, 59, 23);
		contentPane.add(btnBuscar);
		
		JButton btnNuevoSilabo = new JButton("nuevo silabo");
		btnNuevoSilabo.setBounds(460, 88, 89, 23);
		contentPane.add(btnNuevoSilabo);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(88, 56, 114, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 88, 114, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Modulo IA");
		comboBox.addItem("Modulo IB");
		comboBox.addItem("Modulo IC");
		comboBox.setBounds(88, 121, 114, 23);
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(88, 156, 114, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBounds(309, 88, 79, 23);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		 	df = new DefaultTableModel();
		 	
			df.addColumn("Codigo");
			df.addColumn("Curso");
			df.addColumn("Modulo");
			
			tb= new JTable(df);	

			scp= new JScrollPane(tb);
			scp.setBounds(12,221,545,129);
			contentPane.add(scp);
			
			JButton btnAgregar = new JButton("agregar");
			btnAgregar.setBounds(10, 361, 74, 22);
			contentPane.add(btnAgregar);
			
			JButton btnEliminar = new JButton("eliminar");
			btnEliminar.setBounds(89, 361, 74, 22);
			contentPane.add(btnEliminar);
			
			JLabel lblSistemaDeEvaluacin = new JLabel("Sistema de Evaluaci\u00F3n");
			lblSistemaDeEvaluacin.setBounds(10, 395, 153, 16);
			contentPane.add(lblSistemaDeEvaluacin);
	
			df1 = new DefaultTableModel();
		 	
			df1.addColumn("Codigo Evaluación");
			df1.addColumn("peso(%)");
			
			tb1= new JTable(df1);	

			scp1= new JScrollPane(tb1);
			scp1.setBounds(12,423,545,129);
			contentPane.add(scp1);
			
			JButton btnAgregar_1 = new JButton("buscar");
			btnAgregar_1.setBounds(10, 563, 74, 22);
			contentPane.add(btnAgregar_1);
			
			JButton btnEditar = new JButton("editar");
			btnEditar.setBounds(88, 563, 74, 22);
			contentPane.add(btnEditar);
			
			JButton btnNuevo = new JButton("nuevo");
			btnNuevo.setBounds(167, 563, 74, 22);
			contentPane.add(btnNuevo);
			
			JButton btnGrabar = new JButton("Grabar");
			btnGrabar.setBounds(194, 596, 92, 33);
			contentPane.add(btnGrabar);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(297, 596, 95, 33);
			contentPane.add(btnCancelar);
			
			JLabel lblVacantes = new JLabel("N\u00B0 vacantes");
			lblVacantes.setBounds(220, 159, 89, 16);
			contentPane.add(lblVacantes);
			
			textField_4 = new JTextField();
			textField_4.setBounds(309, 156, 79, 23);
			contentPane.add(textField_4);
			textField_4.setColumns(10);
	
	}
}
