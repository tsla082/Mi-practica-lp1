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
import javax.swing.JButton;

public class LitadoCursosAgregar extends JFrame {

	private JPanel contentPane;

	private DefaultTableModel df;
	private JTable tb;
	private JScrollPane scp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LitadoCursosAgregar frame = new LitadoCursosAgregar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	public LitadoCursosAgregar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		setResizable(false);
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		 df = new DefaultTableModel();
			df.addColumn("Curso");
			df.addColumn("Modulo");
			df.addColumn("Nivel Ciclo");
			df.addColumn("Credito");
			df.addColumn("Requisitios");
			
			tb= new JTable(df);	

			scp= new JScrollPane(tb);
			scp.setBounds(10,53,543,182);
			scp.setToolTipText("Seleccione una fila de la tabla y luego presione \"Agregar\"");
			contentPane.add(scp);
			
			JLabel lblListadoDeCursos = new JLabel("Listado de Cursos");
			lblListadoDeCursos.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
			lblListadoDeCursos.setBounds(156, 0, 253, 36);
			contentPane.add(lblListadoDeCursos);
			
			JButton btnAgregar = new JButton("Agregar");
			btnAgregar.setBounds(10, 246, 89, 23);
			contentPane.add(btnAgregar);
			
		
	}
}
