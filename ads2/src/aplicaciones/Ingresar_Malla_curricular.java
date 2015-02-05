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
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class Ingresar_Malla_curricular extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel df;
	private JTable tb;
	private JScrollPane scp;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingresar_Malla_curricular frame = new Ingresar_Malla_curricular();
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
	public Ingresar_Malla_curricular() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		setResizable(false);
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGenerarMallaCurricular = new JLabel("Generar Malla Curricular");
		lblGenerarMallaCurricular.setFont(new Font("Comic Sans MS", Font.PLAIN, 31));
		lblGenerarMallaCurricular.setBounds(74, 11, 400, 32);
		contentPane.add(lblGenerarMallaCurricular);
		
		JLabel lblCodigo = new JLabel("codigo");
		lblCodigo.setBounds(10, 55, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblVigencia = new JLabel("vigencia");
		lblVigencia.setBounds(10, 96, 46, 14);
		contentPane.add(lblVigencia);
		
		JLabel lblCarrera = new JLabel("carrera");
		lblCarrera.setBounds(10, 138, 46, 14);
		contentPane.add(lblCarrera);
		
		JLabel lblEncargado = new JLabel("encargado");
		lblEncargado.setBounds(271, 55, 74, 14);
		contentPane.add(lblEncargado);
		
		JLabel lblCreditosPorNivel = new JLabel("creditos por nivel");
		lblCreditosPorNivel.setBounds(271, 96, 108, 14);
		contentPane.add(lblCreditosPorNivel);
		
		JButton btnConsultarMallas = new JButton("consultar mallas");
		btnConsultarMallas.setBounds(397, 133, 140, 25);
		contentPane.add(btnConsultarMallas);
	
		 df = new DefaultTableModel();
			df.addColumn("Curso");
			df.addColumn("Modulo");
			df.addColumn("Nivel Ciclo");
			df.addColumn("Credito");
			df.addColumn("Requisitios");
			
			tb= new JTable(df);	

			scp= new JScrollPane(tb);
			scp.setBounds(12,168,525,182);
			contentPane.add(scp);
			
			JComboBox comboBox = new JComboBox();
			comboBox.addItem("Todos los ciclos");
			comboBox.addItem("2015 - I");
			comboBox.addItem("2015 - II");
			comboBox.setBounds(74, 91, 130, 25);
			contentPane.add(comboBox);
			
			textField = new JTextField();
			textField.setEnabled(false);
			textField.setBounds(74, 52, 130, 25);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.addItem("Computacion e Informatica");
			comboBox_1.addItem("Administracion de sistemas");
			comboBox_1.addItem("Administracion");
			comboBox_1.setBounds(74, 132, 185, 25);
			contentPane.add(comboBox_1);
			
			textField_1 = new JTextField();
			textField_1.setEnabled(false);
			textField_1.setBounds(397, 91, 46, 25);
			contentPane.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setEnabled(false);
			textField_2.setBounds(397, 50, 140, 25);
			contentPane.add(textField_2);
			textField_2.setColumns(10);
			
			JButton btnAgregar = new JButton("consultar cursos");
			btnAgregar.setBounds(12, 358, 114, 22);
			contentPane.add(btnAgregar);
			
			JButton btnEliminar = new JButton("eliminar");
			btnEliminar.setBounds(135, 358, 74, 22);
			contentPane.add(btnEliminar);
			
			JButton btnNuevo = new JButton("nuevo+");
			btnNuevo.setBounds(209, 358, 74, 22);
			contentPane.add(btnNuevo);
			
			JButton btnGrabar = new JButton("Grabar");
			btnGrabar.setBounds(140, 403, 82, 43);
			contentPane.add(btnGrabar);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(225, 403, 82, 43);
			contentPane.add(btnCancelar);
			
			JButton btnAgregarCursos = new JButton("Agregar Cursos");
			btnAgregarCursos.setBounds(438, 358, 99, 22);
			contentPane.add(btnAgregarCursos);
	}
}
